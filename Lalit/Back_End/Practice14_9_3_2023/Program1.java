package Practice14_9_3_2023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

// sorting students based on id in descending order


class Students implements Comparable<Students>, Comparator<Students> {
    private int id;
    private String name;
    public Students(){
        super();
    }
    public Students(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "ID : " + id + " NAME : " + name + "\n";
    }


    @Override
    public int compareTo(Students o) {
        Students s1 = (Students) o;
        int id1 = this.id;
        int id2 = s1.id;

        if(id1 < id2)
            return -1;
        else if(id1 > id2)
            return +1;
        else
            return 0;

    }
    @Override
    public int compare(Students s1, Students s2){
        int id1 = s1.id;
        int id2 = s2.id;
//        return id2.compareTo(id1);
//        if(id1 < id2)
//            return +1;
//        else if(id1 > id2)
//            return -1;
//        else
//            return 0;
        return Integer.compare(id2, id1);
    }
}


public class Program1 {
    public static void main(String[] args) {

        TreeSet<Students> treeSet = new TreeSet<>(new Students());

        treeSet.add(new Students(12, "Shyam"));
        treeSet.add(new Students(2, "Ravi"));
        treeSet.add(new Students(7, "Harihar"));
        treeSet.add(new Students(9, "Lalit"));

        System.out.println(treeSet);


    }
}
