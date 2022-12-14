import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//TODO 1)Создать Scanner и организовать ввод чисел
    /*    System.out.println("Enter the value of variable a ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of variable b ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of variable c ");
        int c = scanner.nextInt();
        //TODO 2) Проверить больше ли некоторого значения сумма двух чисел, если нет вывести сообщение что сумма меньше заданного значение
        if(a + b <= c){
            System.out.println("The sum of a and b is less than a given value c");
        }
      */ //TODO    3) Через case обработать несколько вариантов введенной переменной, предусмотреть дефолтный случай -см решение в задаче №6

        //TODO   4) Инициализировать массив псевдослучайными числами(Random)
          SumElArray sumElArray = new SumElArray(10);
          sumElArray.fillRandomArray();
          sumElArray.printArray();

        //TODO   5) Найти сумму и произведение всех элементов этого массива
        sumElArray.sumElArray();
        //TODO 6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружност
       ShapeArea shapeArea = new ShapeArea();
       shapeArea.choseShape();


    }
}