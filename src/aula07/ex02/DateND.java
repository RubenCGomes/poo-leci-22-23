package aula07.ex02;

import java.util.Objects;

public class DateND extends Date{
    private int chosenDate;

    public DateND(int days){
        setDate(days);
    }

    public void setDate(int days){
        if (days <= 0) System.out.println("Invalid date, try again");
        else this.chosenDate = days;
    }

    @Override
    public int[] getDate() {
        int[] date = new int[3];
        int days = this.chosenDate;
        int months = 0;
        int startYear = 1999;

        while (days > 0){
            if (leapYear(startYear)) days -= 366;
            else days -= 365;
            startYear++;
        }

        date[2] = startYear;
        if (leapYear(startYear)) days += 366;
        else days += 365;

        while (days > 0) {
            months++;
            days -= monthDays(months, startYear);
        }
        date[1] = months;

        days += monthDays(months, startYear);
        date[0] = days;

        return date;
    }

    @Override
    public void increment() {
        chosenDate++;
    }

    @Override
    public void decrement() {
        chosenDate--;
    }

    @Override
    public int getDay() {
        return getDate()[0];
    }

    @Override
    public int getMonth() {
        return getDate()[1];
    }

    @Override
    public int getYear() {
        return getDate()[2];
    }

    @Override
    public int getDateDays() {
        return chosenDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateND dateND = (DateND) o;
        return chosenDate == dateND.chosenDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chosenDate);
    }

    public String toString(){return getDay() + "/" + getMonth() + "/" + getYear();}

}
