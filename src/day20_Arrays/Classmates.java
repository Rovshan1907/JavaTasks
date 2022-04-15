package day20_Arrays;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates = {"Musa Sir","Mehmet Sir","Mario Sir","Rumeysa Mrs","Laman Ms","Aleydo Sir","Merve Mrs","Bureyda Sir","Kanpar Sir","Fatih Sir"};

        for (int i = 0; i < classmates.length; i++) {
            String mate = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") +1);
            System.out.println(mate);
        }





    }
}
/*
1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */