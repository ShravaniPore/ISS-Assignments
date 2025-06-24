package java_assign;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON {
    public static void main(String[] args) {
        String jsonString= """
                {
                  "category": "Electronics",
                  "products": [
                    {
                      "productId": "E101",
                      "name": "Samsung Galaxy S21",
                      "type": "Mobile",
                      "brand": "Samsung",
                      "price": 69999,
                      "inStock": true,
                      "specs": {
                        "ram": "8GB",
                        "storage": "128GB",
                        "battery": "4000mAh"
                      }
                    },
                    {
                      "productId": "E102",
                      "name": "Dell Inspiron 15",
                      "type": "Laptop",
                      "brand": "Dell",
                      "price": 59999,
                      "inStock": false,
                      "specs": {
                        "ram": "16GB",
                        "storage": "512GB SSD",
                        "processor": "Intel i5"
                      }
                    }
                  ]
                }
                """;
//        creating a json object
        JSONObject jsonObject=new JSONObject(jsonString);
        System.out.println(jsonObject);

//        accessing json elements
        String category=jsonObject.getString("category");
        System.out.println("Category: "+category);

//        accessing json array object
        JSONArray products=jsonObject.getJSONArray("products");
        System.out.println(products);

//        traversing elements of json array
        for(int i=0;i<products.length();i++){
            JSONObject prods=products.getJSONObject(i);
            System.out.println(prods);
//            accessing elements in objects inside json array
            String name=prods.getString("name");
            System.out.println("Product name is: "+name);
        }

//        directly accessing particular elements inside json array
        String brand=jsonObject.getJSONArray("products").getJSONObject(1).getString("brand");
        System.out.println("brand of 2nd product is: "+brand);

//        saving jsonObject to a json file
        try (FileWriter file = new FileWriter("src/java_assign/products.json")) {
            file.write(jsonString);
            System.out.println(" JSON string saved to products.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
