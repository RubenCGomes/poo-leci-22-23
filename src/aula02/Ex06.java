package aula02;

import utils.classes.UserInput;

public class Ex06 {
    public static void main(String[] args){
        int h, m, s, secs;
        secs = UserInput.readIntClosed(0, Double.POSITIVE_INFINITY, "Indique o tempo em segundos: ");
        s = secs % 60;
        h = secs / 3600;
        m = secs / 60 - h * 60;
        System.out.printf("%02d:%02d:%02d",h, m, s);
    }
}
