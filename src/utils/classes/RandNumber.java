package utils.classes;

import java.util.Random;

public class RandNumber {
    /*Starts in zero, supports doubles*/
    public static double RandDoubleZero(int max){
        double rand;
        Random random = new Random();
        rand = random.nextDouble(max);
        return rand;
    }

    /*Starts in one, supports ints*/
    public static int RandIntOne(int max){
        int rand;
        Random random = new Random();
        do {
            rand = random.nextInt(max);
        } while (rand == 0);
        return rand;
    }
}
