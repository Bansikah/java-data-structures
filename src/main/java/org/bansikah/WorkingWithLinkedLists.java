package org.bansikah;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("blanch", 21));
        list.add(new Person("jane", 25));
        list.add(new Person("john", 30));
        list.addFirst(new Person("jack", 35));

        ListIterator<Person> personListIterator = list.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println("===========================");
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    public record Person(String name, int age){}
}
