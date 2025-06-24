package java_assign;

public class Strings {
    public static void main(String[] args) {
        String dept1= "Information";
        String dept2="Technology";

        String department= dept1.concat(dept2);
        System.out.println(department);

//        some string methods
        System.out.println(department.charAt(2));
        System.out.println(department.toUpperCase());
        System.out.println(department.toLowerCase());
        System.out.println(department.indexOf('o'));
        System.out.println(department.contains("no"));
        System.out.println(department.length());

//        Stringbuffer
        System.out.println("\nString buffer:");
        StringBuffer example1=new StringBuffer("Information");

//        example methods
        example1.append(" Technology");
        System.out.println(example1);
        example1.insert(0,"Department of ");
        System.out.println(example1);
        System.out.println(example1.replace(1,3,"replaced"));
        System.out.println(example1.delete(1,9));
        System.out.println(example1.insert(1,"ep"));
        System.out.println(example1.reverse());
        System.out.println(example1.reverse());

//        Stringbuilder
        System.out.println("String Builder");
        StringBuilder example2=new StringBuilder("Technology");

//      example methods
        System.out.println(example2);
        System.out.println(example2.append(" Department"));
        System.out.println( example2.insert(0,"Information "));
        System.out.println(example2.reverse());
        example2.reverse();
        System.out.println(example2.delete(0,1));
        System.out.println(example2.insert(0,"De"));

    }
}
