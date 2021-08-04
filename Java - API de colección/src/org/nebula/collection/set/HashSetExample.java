package org.nebula.collection.set;

import java.util.HashSet;
import java.util.Set;

/* 
*   La colección HashSet no es ordenado y no permite elementos duplicados.
*/
public class HashSetExample {
    
    protected static Set<String> myHashset = new HashSet<>();

    public static boolean addElement(String something) {
        return myHashset.add(something);
    }

    public static void printAllElements() {
        myHashset.forEach(System.out::println);
    }

    public static boolean deleteElement(String something) {
        return myHashset.removeIf(e -> e.equals(something));
    }

    public static void updateElement(String somethingOld, String somethingNew) {
        if (deleteElement(somethingOld)) {
            addElement(somethingNew);
        }
    }

    public static void main(String[] args) {
        HashSetExample.addElement("Hello");
        HashSetExample.addElement("darkness");
        HashSetExample.addElement("my");
        HashSetExample.addElement("old");
        HashSetExample.addElement("friend");
        HashSetExample.addElement("my");
        HashSetExample.deleteElement("darkness");
        System.out.println("Se imprime elementos (1):");
        HashSetExample.printAllElements();
        HashSetExample.updateElement("friend", "couple");
        System.out.println("Se imprime elementos (2):");
        HashSetExample.printAllElements();
    }

}
