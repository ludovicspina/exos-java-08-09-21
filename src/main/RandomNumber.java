package main;

public class RandomNumber {
    public static void main(String[] args) {

        double n1 = Math.round(Math.random() * 1000);
        double n2 = Math.round(Math.random() * 1000);
        double n3 = Math.round(Math.random() * 1000);

        while (n1 % 2 == 1) {
            n1 = Math.round(Math.random() * 1000);
        }
        while (n2 % 2 == 1) {
            n2 = Math.round(Math.random() * 1000);
        }
        while (n3 % 2 == 0) {
            n3 = Math.round(Math.random() * 1000);
        }
        System.out.print("n1:" + n1 + "n2:" + n2 + "n3:" + n3);
    }
}
