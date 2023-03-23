package aula05;

public class DateYMD {
    int days, month, year;
    public DateYMD(int days, int month, int year){
        if (valid(days, month, year)){
            this.days = days; this.month = month; this.year = year;
        }
        else System.out.println("Invalid date, try again");
    }

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

    public void setDate(int days, int month, int year){
        if (valid(days, month, year)){
            this.days = days; this.month = month; this.year = year;
        }
        else System.out.println("Invalid date, try again");
    }

    public int[] getDate(){ return new int[]{this.days, this.month, this.year};}

    public String toString(){return days + "/" + month + "/" + year;}

    public void increment(){
        if (valid(this.days + 1, this.month, this.year)){++this.days;}
        else if (this.month + 1 > 12){this.days = 1; this.month = 1; ++this.year;}
        else {this.days = 1; ++this.month;}
        }

    public void decrement(){
        if (valid(this.days - 1, this.month, this.year)){--this.days;}
        else if (this.month - 1 < 1) {this.days = 31; this.month = 12; --this.year;}
        else {this.days = monthDays(this.month, this.year); --this.month;}
    }
}
