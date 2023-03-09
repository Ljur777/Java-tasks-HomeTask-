import java.util.Arrays;

public class Average {
    static int acc = 0;
    static int[] arr4;

    public static void main(String[] args) {
        //TODO   1.  Создать массивы типа: int, double и создать методы, для их вывода на консоль

        int[] arr = new int[10]; // Создаем массив
        int[] arr3 = {2, 6, 12, 24, 5, 10, 11, 9};
        //   double[] dArr = new double[15];

        //    print(arr);
        //     printd(dArr);

        //TODO  2. Сделать программу, которая будет складывать или вычитать введенные числа многократно,
        //    пока не будет дана команда на выход из цикла
/*
        Scanner scanner = new Scanner(System.in);
        char ex;
        for (; ; ) {                     // бесконечн цикл
            System.out.println("ВВедите число 1: ");
            int a = scanner.nextInt();
            System.out.println("ВВедите число 2: ");
            int b = scanner.nextInt();
            System.out.println("Выберите операцию: " +
                    "\n p - сложить " +
                    "\n m - вычесть " +
                    "\n e - выход");
            ex = scanner.next().charAt(0);   //считіваем 0 символ ввода
            if (ex == 'p') {                     //проверяем ввод
                int p = a + b;
                System.out.println("Результат сложения: " + p);
            }
            if (ex == 'm') {                     //проверяем ввод
                int m = a - b;
                System.out.println("Результат вычетания: " + m);
            }
            if (ex == 'e') {                     //проверяем ввод
                break;                            //віход из цикла
            }
        }
*/

        //TODO  3. Сделать процедуру для вывода из массива чисел со значением кратным 3.
        // Найти в другой функции их среднее арифметическое значение


     //     print3(arr3);
     //   System.out.println(average(arr3));


        //TODO 4. Создать метод, который будет применять строку и выводить из нее только гласные буквы
   /*     String str = "Hello";
        char arr5[] = {'a', 'o', 'e', 'y', 'i', 'u', 'A', 'O', 'E', 'Y', 'I', 'U'};
        for (int i = 0; i < str.length(); i++) {
            for (int k = 0; k < arr5.length; k++) {
                if(str.charAt(i) == (char)arr5[k]) {
                    System.out.print(str.charAt(i) + " ");
                }
            }
        }
    }
/
    public static void print(int[] arr ){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]=i);
        }
    }
    public static void printd(double[] arr ){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]=i);
        }
    }
*/

        //TODO 4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = reverseArr(arr3);
        System.out.println(Arrays.toString(arr4));
        System.out.println("******");
        printEven(arr4);
    }

    private static void printEven(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    private static int[] reverseArr(int[] arr) {
        int index = 0;
        int arr2[] = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--){
            arr2[index] = arr[i];
            index++;
        }
        return arr2;
    }

    public static void print3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("----------------------");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0) {
                System.out.print(arr[i] + " ");
                acc++;
            }
        }
    }

    public static double average(int[] arr) {
        System.out.println();
        double sum = 0;
        int calc = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0) {
                System.out.println(arr[i]);
                sum += arr[i];
                calc++;
            }
        }
        return sum / calc;
    }


}