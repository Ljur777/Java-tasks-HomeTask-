import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        EquationSolver solver = new EquationSolver();
        //решаем уровнение: 2х=10;
        System.out.println("Корень: " + solver.linerEquation(2, 10));
        System.out.println("Введите первый параметр: ");
        int a = scanner.nextInt();

        System.out.println("Введите второй параметр: ");
        int b = scanner.nextInt();

        System.out.println("Введите третьий параметр: ");
        int c = scanner.nextInt();
        if (a != 0) {
            if (solver.isRoots(solver.findDiscriminant(a, b, c))) {
                if (solver.isTwoRoots(solver.findDiscriminant(a, b, c))) {
                    double[] arr = solver.doubleRoot(a, b, solver.findDiscriminant(a, b, c));
                    System.out.println("First root: " + arr[0]);
                    System.out.println("First root: " + arr[1]);
                } else {
                    System.out.println("One root: " + solver.singleRoot(a, b, solver.findDiscriminant(a, b, c)));
                }
            } else {
                System.out.println("Корней нет");
            }
        } else {
            System.out.println("некоректный ввод");
        }

    }
}




   /* public static void main(String[] args) {
             do{

        System.out.println("Do!");
    }
             while(10<9); // tozhe chto i false

        printHello();         //vuzov metoda
    }

    static void printHello(){  //
        System.out.println("Hello");
    }

    */