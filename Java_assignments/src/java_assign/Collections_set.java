package java_assign;

import java.util.*;

public class Collections_set {
    public static void main(String[] args) {
//        Hashset example
        HashSet<Integer> rollNo=new HashSet<>();
        rollNo.add(45);
        rollNo.add(65);
        rollNo.add(54);
        System.out.println(rollNo);
        rollNo.add(45); //won't be added to the set as it is the repeated value
        System.out.println(rollNo);
        System.out.println("Roll number 45 exists? "+rollNo.contains(45));
        System.out.println("Is set empty? "+rollNo.isEmpty());
        rollNo.remove(54);
        System.out.println("set after removing roll number 54 :"+rollNo);
        rollNo.add(16);
        System.out.println("set after adding roll number 16 :"+rollNo);

//        Hashset if custom objects
        System.out.println("\nHashset of custom objects:");
        HashSet<MarksRecord> marks=new HashSet<>();
        marks.add(new MarksRecord(1, 15));
        marks.add(new MarksRecord(45, 19));
        marks.add(new MarksRecord(65, 20));
        marks.add(new MarksRecord(16, 16));
        System.out.println("Set of custom objects:");
        marks.forEach(System.out::println);

//        Hashset is unordered and can be converted to the list and then sorted.
//        For sorted set we can use treeset.
        System.out.println("\nTreeSet");
        TreeSet<MarksRecord> marksTree=new TreeSet<>();
        marksTree.add(new MarksRecord(1, 15));
        marksTree.add(new MarksRecord(45, 19));
        marksTree.add(new MarksRecord(65, 20));
        marksTree.add(new MarksRecord(16, 16));

        System.out.println("\nSorted set of custom objects:");
//        Treeset implicitly applies compareTo method
        for(MarksRecord m:marksTree){
            System.out.println(m);
        }

    }
}

class MarksRecord implements Comparable<MarksRecord>{
    int marks;
    int rollno;
    MarksRecord(int rollno, int marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Roll number:"+rollno+" Marks:"+marks;
    }
    @Override
    public int compareTo(MarksRecord other){
        return Integer.compare(this.marks,other.marks);
    }

}