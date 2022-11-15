package se.lexicon;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> arrList=new ArrayList<>();

        //adding few elements
        arrList.add("India");
        arrList.add("Sweden");
        arrList.add(0, "UK");
        System.out.println("ArrayList Elements: ");
        //Traversing ArrayList using enhanced for loop
        for(String str:arrList)
            System.out.println(str);
    }
}
