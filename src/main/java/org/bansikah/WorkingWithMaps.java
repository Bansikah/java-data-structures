package org.bansikah;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        //Map<Integer, String> map = Map.of(1, "one", 2, "two");
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person( "John"));
        map.put(2, new Person("Jane"));
        map.put(3, new Person( "Noel"));
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(new Person( "John")));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove(1));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
        map.keySet()
                .forEach(System.out::println);
        map.values()
                .forEach(System.out::println);
    }
    record Person(String name){}
}
