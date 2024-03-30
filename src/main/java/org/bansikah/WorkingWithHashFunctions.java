package org.bansikah;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithHashFunctions {
    public static void main(String[] args) {
        Map<Person, Diamonds> map = new HashMap<>();
        map.put(new Person("John"), new Diamonds("African Diamond"));
        map.put(new Person("Noel"), new Diamonds("American Diamond"));

        System.out.println(map.get(new Person("Noel")));
        System.out.println(map.get(new Person("Noel")).hashCode());
        System.out.println(map.get(new Person("Noel")).hashCode());

    }

    static class Person{
        String name;
        public Person(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
        @Override
        public int hashCode() {
            return name.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            return obj instanceof Person && ((Person) obj).name.equals(name);
        }
    }

    record Diamonds(String name) { }
}