package org.bansikah;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Balls> balls = new HashSet<>();// alternatively we can have TreeSet
         balls.add(new Balls("red"));
         balls.add(new Balls("blue"));
         balls.add(new Balls("red"));
         balls.add(new Balls("yellow"));
         balls.add(new Balls("green"));

        System.out.println(balls);
        System.out.println(balls.size());
        System.out.println(balls.contains(new Balls("red")));
        System.out.println(balls.contains(new Balls("pink")));
        System.out.println(balls.remove(new Balls("red")));


    }

    public static class Balls{
        public String color;

        public Balls(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Balls{" + "color=" + color + '}';
        }

        @Override
        public int hashCode() {
            return color.hashCode();
        }
    }

    //record Balls (String color){ }
}
