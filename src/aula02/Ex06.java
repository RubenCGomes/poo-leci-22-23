package aula02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        int h, m, s, secs;
        Scanner inp = new Scanner(System.in);
        System.out.println("Indique o tempo em segundos: ");
        secs = inp.nextInt();
        s = secs % 60;
        h = secs / 3600;
        m = secs / 60 - h * 60;
        System.out.printf("%02d:%02d:%02d",h, m, s);
    }
}
