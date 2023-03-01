package aula03;

import utils.*;

public class Ex04 {
    public static void main(String[] args){
        int alunos = UserInput.readIntClosed(1, Double.POSITIVE_INFINITY, "Nº de alunos? ");
        double[][] notas = new double[10][alunos];

        notas[0][0] = UserInput.readDoubleClosed(0, 20, "Introduza a nota teórica: ");
        notas[0][1] = UserInput.readDoubleClosed(0, 20, "Introduza a nota prática: ");
        notas[0][2] = CalcGrade.finalGrade(notas[0][0], notas[0][1]);

        for (int i = 1; i < alunos; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    if (notas[i][0] < 7 || notas[i][1] < 7)
                        notas[i][j] = 66;
                    else
                        notas[i][j] = CalcGrade.finalGrade(notas[i][0], notas[i][1]);
                }
                else
                    notas[i][j] = RandNumber.RandDoubleZero(20);
            }
        }
        System.out.printf("%5s %5s %5s\n", "NotaT", "NotaP", "Pauta");
        for (int i = 0; i < alunos; i++) {
            System.out.printf("%5.1f %5.1f %5.0f\n", notas[i][0], notas[i][1], notas[i][2]);
        }
    }
}
