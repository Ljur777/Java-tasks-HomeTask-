import java.util.Scanner;

public class ReverseString extends Main{

    static Scanner scanner = new Scanner(System.in);
    String str = inputStr();

    public ReverseString() {
        this.str = str;
    }

    public void reverseStr(){
        String newStr = "";
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            length--;
            newStr += str.charAt(length);
        }
        System.out.println(newStr);
    }
    public static String inputStr() {
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }

}
