package jp.co.goalist.array;

public class kadai1 {

    public static void main(String[] args) {
        int[] ary1 = {1, 2, 3, 4, 5};
        int[] ary2 = {10, 20, 30, 40, 50};
        
        for (int x: ary1) {
            for (int y: ary2) {
                System.out.println(x + " * " + y + " = " + (x * y));
            }
        }
    }

}
