import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] arr = {"5", "2", "C", "D", "+"};

        System.out.println(iteration(arr));
    }

    private static int sumOfStackEl(Stack<Integer> stack) {
        Iterator<Integer> iterator = stack.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    private static int iteration(String arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "D" && arr[i] != "C" && arr[i] != "+") {
                stack.push(Integer.parseInt(arr[i]));
            } else {
                if (arr[i] == "D") {
                    stack.push(stack.peek() * 2);
                }
                if (arr[i] == "C") {
                    stack.pop();
                }
                if (arr[i] == "+") {
                    ListIterator<Integer> it = stack.listIterator(stack.size());
                    int temp = 0;
                    int sum = 0;
                    while (temp < 2 && it.hasPrevious()) {
                        sum += it.previous();
                        temp++;
                    }
                    stack.push(sum);
                }
            }
        }
        return sumOfStackEl(stack);
    }
}

