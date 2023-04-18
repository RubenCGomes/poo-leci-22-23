package aula05;

class Calendar {
    /* limite 50 eventos!! */
    int[][] events = new int[12][31];
    int year, initpos;
    public Calendar(int year, int initpos){
        this.year = year; this.initpos = initpos;
    }

    public int year() {return year;}

    public int firstWeekDayOfYear(){return initpos;}

    public int firstWeekDayOfMonth(int month){
        int days = 0;
        for (int i = 1; i < month; ++i)
            days += DateYMD.monthDays(i, year);
        if (DateYMD.leapYear(year)) ++days;
        return (days + initpos) % 7;
    }

    public void addEvent(DateYMD date){
        if (this.year == date.getDate()[2])
            this.events[date.getDate()[1] - 1] [date.getDate()[0] - 1] = 1;
        else System.out.println("Invalid date");
    }
    public void removeEvent(DateYMD date) {
        if (this.year == date.getDate()[2])
            this.events[date.getDate()[1] - 1][date.getDate()[0] - 1] = 0;
        else System.out.println("Invalid date");
    }

    public String getMonthByNumber(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }

    public void printMonth(int month){
        String extmonth = getMonthByNumber(month);
        int pos = firstWeekDayOfMonth(month);

        System.out.printf("%16s\n", extmonth + " " + year);
        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Su","Mo","Tu","We","Th","Fr","Sa");

        int days = DateYMD.monthDays(month, year);

        int count = 0;
        while (count < pos - 1){
            count++;
            System.out.print("    ");
        }

        for (int i = 1; i < days + 1; i++) {
            if (events[month - 1][i - 1] == 1)
                System.out.printf("%4s", "*" + i );
            else
                System.out.printf("%4d", i);
            if ((i + pos - 1) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public void printCalendar() {
        for (int i = 1; i < 13; ++i){
            printMonth(i);
            System.out.println();
        }
    }

}
