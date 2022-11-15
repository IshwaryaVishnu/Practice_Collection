package se.lexicon;
import java.util.*;
public class SetAdd {
    public static void main(String args[]){

    HashSet<String> set=new HashSet<>();
    set.add("html");
    set.add("CSS");
    set.add("java");
    set.add("C#");
    set.add("javascript");

    Iterator<String> it=set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
}
}

