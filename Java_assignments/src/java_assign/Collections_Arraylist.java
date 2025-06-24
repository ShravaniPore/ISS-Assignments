package java_assign;

import java.util.*;

public class Collections_Arraylist {
    public static void main(String[] args) {

//        Arraylist
        System.out.println("ArrayList example");
        ArrayList<String> products=new ArrayList<>();

//        some important methods
        products.add("laptop");
        products.add("fridge");
        products.add("TV");
        products.add("camera");
        System.out.println(products);
        products.set(1,"mobile");
        System.out.println(products);
        products.remove(2);
        System.out.println(products);
        System.out.println("Size of list: "+products.size());
        System.out.println("Is the list empty? :"+products.isEmpty());
        System.out.println("Does list contain fridge? :"+products.contains("fridge"));
        System.out.println("Index of camera? :"+products.indexOf("camera"));

//        Arraylist with custom objects
        ArrayList<ProductDetails> prodDetails=new ArrayList<>();
        prodDetails.add(new ProductDetails("Mobile",20000));
        prodDetails.add(new ProductDetails("Fridge",60000));
        prodDetails.add(new ProductDetails("Camera",35000));

        for (ProductDetails p:prodDetails){
            System.out.println(p);
        }

        prodDetails.remove(2);
        System.out.println("after removing product at index 2");
        prodDetails.forEach(System.out::println);
        prodDetails.add(new ProductDetails("Tv",50000));

        System.out.println("Size: " +prodDetails.size());
        System.out.println("Is empty? :" +prodDetails.isEmpty());

//        using comparable interface
        System.out.println("\nSorting by price using comparable interface.");
        Collections.sort(prodDetails);
        prodDetails.forEach(System.out::println);

//        using comparator
        System.out.println("\nSorting by name using comparator.");
        prodDetails.sort((p1, p2) -> p1.name.compareTo(p2.name));
        prodDetails.forEach(System.out::println);

    }
}

class ProductDetails implements Comparable<ProductDetails>{
    String name;
    double price;
    ProductDetails(String name,double price){
        this.name =name;
        this.price=price;
    }

    @Override
    public String toString(){
        return ("Name of product: "+name+" Price "+price);
    }

//overriding comparable interface method
    @Override
    public int compareTo(ProductDetails other){
        return Double.compare(this.price,other.price);
    }
}
