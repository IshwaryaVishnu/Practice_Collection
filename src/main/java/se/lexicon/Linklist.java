package se.lexicon;
import java.util.*;
public class Linklist {

    public static void main(String args[]){
        LinkedList<String> linkList=new LinkedList<>();
        linkList.add("TamilNadu");
        linkList.add("Karnataka");
        //inserting element at first position
        linkList.add(1, "Kerala");
        System.out.println("LinkedList elements: ");
        //iterating LinkedList using iterator
        Iterator<String> iterator=linkList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

