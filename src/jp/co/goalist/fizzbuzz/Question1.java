package jp.co.goalist.fizzbuzz;

public class Question1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "�ł��B�A�z");
            } else {
                System.out.println(i + "�ł��B");
            }
        }
    }
}