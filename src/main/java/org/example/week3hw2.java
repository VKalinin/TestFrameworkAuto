package org.example;

public class week3hw2 {
    public static void main(String[] args) {

        //Task 1

        double incomeUser = 89075;

        if (incomeUser > 0 && incomeUser <= 10275) {
            System.out.println("your tax will be 10%");
        } else if (incomeUser > 10275 && incomeUser <= 41775) {
            System.out.println("your tax will be 12%");
        } else if (incomeUser > 41775 && incomeUser <= 89075) {
            System.out.println("your tax will be 22%");
        } else {
            System.out.println("please call your CPA");
        }

        //Task 2

        String department = "Insurance";
        switch (department) {
            case "sales":
                System.out.println("Sales depatrment works from 8am to 12pm.");
                break;
            case "operations":
                System.out.println("Operations depatrment works from 9am to 6pm.");
                break;
            case "insurance":
                System.out.println("Insurance depatrment works from 8am to 3pm.");
                break;
            case "HR":
                System.out.println("HR depatrment works from 8am to 8pm.");
                break;
            case "IT":
                System.out.println("IT depatrment works from 10am to 6pm.");
                break;
            case "billing":
                System.out.println("Billing depatrment works from 10am to 2pm.");
                break;
            default:
                System.out.println("Please enter the correct department.");
                break;
        }

        //Task 3

        int i = 0;

        for(i = 0; i<24; i++){
            if (i % 2 == 0){
            System.out.println(i);
            }
        }
    }
}
