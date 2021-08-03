package org.nebula.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

/* 
*   La colección HashSet no es ordenado y no permite elementos duplicados.
*/
public class HashSetExample {
    
    protected static Set<String> myHashset = new HashSet<>();

    public static void add(String something) {
        myHashset.add(something);
    }

    public static void printAllElements() {
        myHashset.forEach(System.out::println);
    }

    public static void deleteElement(String something) {
        myHashset.removeIf(e -> e.equals(something));
    }

    public static void main(String[] args) {
        /* add elements */
        HashSetExample.add("Hello");
        HashSetExample.add("darkness");
        HashSetExample.add("my");
        HashSetExample.add("old");
        HashSetExample.add("friend");
        HashSetExample.add("my");
        HashSetExample.deleteElement("darkness");
        System.out.println("Se imprime elementos (1):");
        HashSetExample.printAllElements();
    }

}
