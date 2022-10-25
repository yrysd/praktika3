import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(method(5, 5, 5, 3, 8, 5));

    }
    public static boolean method(int a , int ... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            if (varargs[i] == a) {
                return true;
            } else {
                return false;
            }

            }

        return false;
    }

  }