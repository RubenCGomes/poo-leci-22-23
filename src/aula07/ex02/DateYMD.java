package aula07.ex02;

import java.util.Objects;

public class DateYMD extends Date{
    int days, month, year;
    public DateYMD(int days, int month, int year){
        setDate(days, month, year);
    }

    public void setDate(int days, int month, int year){
        if (!valid(days, month, year)) System.out.println("Invalid date, try again");
        else {this.days = days; this.month = month; this.year = year;}
    }

    public String toString(){return days + "/" + month + "/" + year;}

    @Override
    public int[] getDate(){ return new int[]{this.days, this.month, this.year};}

    @Override
    public void increment(){
        if (valid(this.days + 1, this.month, this.year)){++this.days;}
        else if (this.month + 1 > 12){this.days = 1; this.month = 1; ++this.year;}
        else {this.days = 1; ++this.month;}
        }

    @Override
    public void decrement(){
        if (valid(this.days - 1, this.month, this.year)){--this.days;}
        else if (this.month - 1 < 1) {this.days = 31; this.month = 12; --this.year;}
        else {this.days = monthDays(this.month, this.year); --this.month;}
    }

    @Override
    public int getDay() {
        return days;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getDateDays() {
        int days = 0;
        for (int i = 2000; i < year; i++) {
            if (leapYear(i)) days += 366;
            else days += 365;
        }
        for (int i = 0; i < month; i++) {
            days += monthDays(i, year);
        }
        return days + this.days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateYMD dateYMD = (DateYMD) o;
        return days == dateYMD.days && month == dateYMD.month && year == dateYMD.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, month, year);
    }
}
