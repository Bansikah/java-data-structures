package org.bansikah;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("John", 30));
        supermarket.add(new Person("Jane", 25));
        supermarket.add(new Person("Jim", 40));
        supermarket.add(new Person("Noel", 21));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }
    public record Person(String name, int age){}
}
