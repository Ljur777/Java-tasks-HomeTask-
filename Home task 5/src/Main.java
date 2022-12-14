public class Main {
    static int acc = 0;
    static int[] arr2;
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


        print3(arr3);
        arr2 = new int[acc];
        int calc = 0;
        for (int j = 0; j < arr3.length; j++) {
            if ((arr3[j] % 3) == 0) {
                arr2[calc] = arr3[j];
                System.out.println(arr2[calc]);
                calc++;
            }
        }
            System.out.println(average(arr2));


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

    }
    public static void print3(int[] arr ){

        for (int i = 0; i < arr.length; i++){
            if((arr[i] % 3) == 0) {
                System.out.println(arr[i]);
                acc++;
            }
        }

    }
    public static double average(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


 
    }
