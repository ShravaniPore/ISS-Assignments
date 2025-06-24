package java_assign;

import java.util.HashMap;
import java.util.Map;

public class Collections_map {
    public static void main(String[] args) {
        Map<String,Integer> productList=new HashMap<>();
        productList.put("Modile",20);
        productList.put("Tv",50);
        productList.put("Fridge",10);
        productList.put("Laptop",15);
        System.out.println(productList);
        System.out.println("Mobiles available: "+ productList.get("Mobile"));
        System.out.println("Does map have key Tv?" +productList.containsKey("Tv"));
        System.out.println("Does map have value 17?" +productList.containsValue(17));
        System.out.println("All map values?" +productList.values());
        System.out.println(productList.getOrDefault("Fridge", 0));
        for (Map.Entry<String, Integer> e : productList.entrySet()) {
            System.out.println(e);
        }

//        map of custom objects
        System.out.println("Map of custom objects:");
        Map<Integer,Products> products=new HashMap<>();
        products.put(1,new Products("Tv",50000));
        products.put(2,new Products("Mobile",20000));
        products.put(3,new Products("Fridge",60000));
        products.put(4,new Products("Mouse",500));
        products.put(5,new Products("Headset",2000));

        for (Map.Entry<Integer, Products> e : products.entrySet()) {
            System.out.println(e);
        }

    }
}

class Products {
    double price;
    String name;
    Products(String name,double price){
        this.price=price;
        this.name=name;
    }
    @Override
     public String toString(){
        return "Product:"+name+" Price:"+price;
     }


}