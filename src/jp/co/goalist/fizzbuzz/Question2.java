package jp.co.goalist.fizzbuzz;

public class Question2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "�ł��B�A�z");
            } else if (i.contains("3")) {
                System.out.println(i + "�ł��B�A�z");
            } else {
                System.out.println(i + "�ł��B");
            }
        }
    }
}