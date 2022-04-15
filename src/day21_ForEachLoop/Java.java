package day21_ForEachLoop;

public class Java {
    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");

        int countJava = 0,
                countPython = 0;

        for (String each : words) {
            if(each.equalsIgnoreCase("java")){
                countJava++;
            }else if(each.equalsIgnoreCase("python")){
                countPython++;
            }
        }

        System.out.println(countJava+" Java and "+countPython+" Python");




    }
}
/*
6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
 */