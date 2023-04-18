package utils.classes;

public class CalcGrade {
    public static int finalGrade(double notaT,double notaP){
        return (int) Math.round((0.4 * notaT) + (0.6 * notaP));
    }
}
