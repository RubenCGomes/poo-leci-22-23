package utils.classes;

public class MathUtils {
    /*Verifies if a number is prime, returns true if prime*/
    public static boolean isPrime(int num1){
        int i = 2;
        while (i <= num1 / 2) {
            if (num1 % i != 0)
                ++i;
            else
                return false;
        }
        return true;
    }
}
