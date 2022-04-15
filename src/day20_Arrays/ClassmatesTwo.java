package day20_Arrays;

public class ClassmatesTwo {
    public static void main(String[] args) {

        String[] classmates = {"Musa Sir","Mehmet Sir","Mario Sir","Rumeysa Mrs","Laman Ms","Aleydo Sir","Merve Mrs","Bureyda Sir","Kanpar Sir","Fatih Sir"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j =  name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);

            }
            System.out.println(reverseName);

        }




    }
}
/*
2. create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
 */