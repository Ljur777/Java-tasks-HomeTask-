import java.util.Scanner;
//TODO 1) Метод(процедура), которая будет считывать значения и выводить их на консоль
//    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
//    3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
//    их разность и вывести на консоль их метода main
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int a = 0;
    static int b = 0;
    static int c = 0;
    public static void main(String[] args) {

        a = inputNum();
        b = inputNum();
        c = inputNum();
        System.out.println(sum(a, b, c));
        System.out.println(a + " минус " + b + " будет равно " + difference(a,b));
    }
    public static int difference(int d, int f) {
        return d-f;
    }
    public static int inputNum() {
        System.out.println("Введите первое число: ");
        return scanner.nextInt();
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    }