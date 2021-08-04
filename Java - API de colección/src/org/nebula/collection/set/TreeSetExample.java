package org.nebula.collection.set;

import java.util.TreeSet;
import java.util.Set;

/* 
*   La colección TreeSet es ordenado y no permite elementos duplicados.
*/
public class TreeSetExample {
    
    protected static Set<String> myHashset = new TreeSet<>();

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
        TreeSetExample.addElement("Hello");
        TreeSetExample.addElement("darkness");
        TreeSetExample.addElement("my");
        TreeSetExample.addElement("old");
        TreeSetExample.addElement("friend");
        TreeSetExample.addElement("my");
        TreeSetExample.deleteElement("darkness");
        System.out.println("Se imprime elementos (1):");
        TreeSetExample.printAllElements();
        TreeSetExample.updateElement("friend", "couple");
        System.out.println("Se imprime elementos (2):");
        TreeSetExample.printAllElements();
    }

}
