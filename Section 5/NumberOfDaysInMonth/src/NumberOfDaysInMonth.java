public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        boolean leapYear = isLeapYear(year);

        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else{
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    if (leapYear == true) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
            }
            return days;
        }
    }
}

