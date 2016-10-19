package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Scanner password = new Scanner(System.in);
        System.out.println("Write your username: ");
        String user = password.next();
        System.out.println("Welcome, " + user);
        Random rand = new Random();
        int pass = rand.nextInt(2147483647)+ 32768;
        System.out.println("Your password is: " + pass);
        System.out.println("Would you like to log in: yes or no?");
        String c = password.next();

        if (c.equalsIgnoreCase("yes"))
        {
                System.out.println("Put in username and password: ");
                String a = password.next();
            if (a.equalsIgnoreCase(user + pass))
                System.out.println("Welcome to your account");

            else
            System.out.println("Sorry try again");

        }

        else
        {
            System.exit(0);
        }

    }
}
