package org.bansikah;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args)  {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);
        System.out.println(colors.get(1));
        System.out.println(colors.size());
        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.indexOf("Blue"));
        System.out.println(colors.lastIndexOf("Blue"));
        System.out.println(colors.isEmpty());
        System.out.println(colors.remove(1));

        List<String> colorsUnmodifiable = List.of("Red", "Blue", "Green");

        for(String color : colors) {
            System.out.println(color);
        }

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        colors.forEach( System.out::println);;
    }
}
