import java.util.Random;

public class SumElArray {
    int[] arr;
    int count;
    Random random = new Random();

    public SumElArray(int size) {           //constructor
        arr = new int[size];
        count = 0;
    }

    public void sumElArray() {             //procedure
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pow *= arr[i];
        }

        System.out.println("\n The sum of array`s elements is: " + sum);
        System.out.println("The product of the array elements is equal: " + pow);
    }

    public void fillRandomArray(){
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            count++;

        }

    }
    public void printArray(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");  //выводим массив в строку через пробел
        }
    }

}
