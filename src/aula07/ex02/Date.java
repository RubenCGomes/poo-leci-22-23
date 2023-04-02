package aula07.ex02;

public abstract class Date {
    public abstract int[] getDate();
    public abstract void increment();
    public abstract void decrement();
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
    public abstract int getDateDays();



    public static int monthDays(int month, int year){
        int days;
        switch (month) {
            case 2 -> {
                if (leapYear(year)) days = 29;
                else days = 28;
            }
            case 4, 6, 9, 11 -> days = 30;
            default -> days = 31;
        }
        return days;
    }

    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static boolean validMonth(int month){
        return (0 < month && month <= 12);
    }

    public static boolean valid(int days, int month, int year){
        if (!validMonth(month)) return false;
        if (days <= 0) return false;
        if (month == 2){
            if (leapYear(year)) return days <= 29;
            else return days <= 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return days <= 30;
        return days <= 31;
    }
}
