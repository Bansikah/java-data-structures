package org.bansikah;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args)  {
        String[] colors = new String[6];
        colors[0] = "yellow";
        colors[1] = "purple";
        colors[2] = "orange";
        colors[3] = "white";
        colors[4] = "black";
        colors[5] = "brown";

        System.out.println(colors.length);
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[3]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(String color : colors) {
            System.out.println(color);
        }

        System.out.println("---");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
