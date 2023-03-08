import java.util.Scanner;

public class Main {
    //TODO  1) Работа со String
    //    2) Продемонстировать явное и неявное приведение типов
    //    3) Показать переполнение
    //    4) Показать работу с методами и классами
    //    5*) Сделать реверс строки



    public static void main(String[] args) {
        byte b = 70;
        //type casting int to byte
        b = (byte) (b * 2);
        System.out.println("переполнение примитивного типа byte " + b);
        int a = 9;
        double dot = a;  // Automatic casting: int to double
        System.out.println("Явное приведение " + dot);
        double d = 65.3;
        int q = (int) d;
        System.out.println("неявное приведение " + q);  //неявное приведение Narrowing (Manual) casting: double to int
        System.out.println("------------END of the 1-3 part-----------------");

        ReverseString reverseString = new ReverseString();
        reverseString.reverseStr();
    }
}