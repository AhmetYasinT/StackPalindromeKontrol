
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Bir cümlenin Palindromik olup olmadığını bulma..
        //Baştan okunuşu ile sondan okunuşu aynı olan cümlelere denir..
        //örneğin....; kasaylabalyasak

        Scanner sca = new Scanner(System.in);
        System.out.print("Cümle giriniz : ");
        String cumle = sca.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < cumle.length() / 2; i++) {

            stack.push(cumle.charAt(i));
        }
        if (isPalindrome(cumle, stack)) {

            System.out.println("Bu cümle Palindrom'dur..");
        } else {

            System.out.println("Bu cümle Palindrom değildir...");
        }
    }

    public static boolean isPalindrome(String cumle, Stack<Character> stack) {

        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {

            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
