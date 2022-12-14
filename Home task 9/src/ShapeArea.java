import java.util.Scanner;

public class ShapeArea {
    Scanner scanner = new Scanner(System.in);
    
    
    public void choseShape(){
        System.out.println("Select a shape to calculate its area: " +
                "triangle:  t \n" +
                "rectangle:  r \n" +
                "circle:  c \n");
        char ch = scanner.next().charAt(0);                         //accept the entered user choice
        switch(ch){
            case 't':
                System.out.println("You have chosen a triangle");
                triangleSquare();
                break;

            case 'r':
                System.out.println("You have chosen a rectangle");
                rectangleSquare();
                break;

            case 'c':
                System.out.println("You have chosen a circle");
                circleSquare();
                break;
            default:
              System.out.println("This is an impossible option. Select the initial letter of the shape name");
        }


}
        public void triangleSquare() {
        System.out.println("Enter the height of the triangle");
        int a = scanner.nextInt();
        System.out.println("Enter the side of the triangle to which the height is drawn");
        int b = scanner.nextInt();
            double sq = (a*b)/2;
            System.out.println(sq);
        }

     private void rectangleSquare() {
         System.out.println("Enter the side a of the rectangle");
         int a = scanner.nextInt();
         System.out.println("Enter the side b of the rectangle");
         int b = scanner.nextInt();
         double sq = a*b;
         System.out.println(sq);
     }

    private void circleSquare() {
        System.out.println("Enter the radius of the circle");
        int r = scanner.nextInt();
        double sq = Math.pow(r, 2)*Math.PI;
        System.out.println(sq);
    }
     }

