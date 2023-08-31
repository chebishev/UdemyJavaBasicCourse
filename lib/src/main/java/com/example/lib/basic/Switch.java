package com.example.lib.basic;

public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: {
                System.out.println("Invalid day");
            }

        }
        System.out.println(daysOfMonth());
    }
    public static int daysOfMonth() {
        //We need to create a conditional statement using a switch to check
        // if "monthName" which is the variable that holds the month name ,
        // is a 31-days month or 30-days month.

        //Given this code:

        String monthName = "May";
        int number_Of_DaysInMonth = 0;

        switch (monthName) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                number_Of_DaysInMonth = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                number_Of_DaysInMonth = 30;
                break;
            case "February":
                number_Of_DaysInMonth = 28;
                break;
        }
        return number_Of_DaysInMonth;
    }
}
