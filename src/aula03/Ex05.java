package aula03;

import utils.*;

public class Ex05 {
    public static void main(String[] args){
        /*arr[0] = month; arr[1] = year*/
        int[] arr =  DateFuncts.validateDate("Introduza uma data no formato mm/yyyy: ");
        int month = arr[0]; int year = arr[1];
        int days = DateFuncts.daysInMonth(month, year);
        int pos = UserInput.readIntClosed(1, 7, "Em que dia da semana começa o mês? ");
        DateFuncts.printCalendar(days, month, year, pos);
    }
}
