package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    public String Company = "alphabet";

    // constructor to receive first last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + " " + this.firstName + " " + this.lastName);
        // Keyword 'THIS' in Java is a reference variable
        // that refers to the current object. "this" is a reference to the current
        // object
        // whose method is being called upon. You can use "this" keyword to avoid naming
        // conflicts in the method/constructor of your instance/object

        // print method that return department
        System.out.println("department" + " " + setDepartment());

        // print method that return password
        System.out.println("password is " + " " + randomPassword(defaultPasswordLength));
        System.out.println("Email id is " + " " + this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@"
                + setDepartment().toLowerCase() + "." + Company + "." + "com");
    }

    // ask for department
    // generate random password
    private String setDepartment() {
        System.out.println("enter code for department\n1 for sale\n2 for dev\n3 for HR");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) {
            return "sales";
        } else if (dep == 2) {
            return "dev";
        } else if (dep == 3) {
            return "HR";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM!@#$*&%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // set alternate mail

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change password

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String Showinfo() {
        return "Display name" + " " + firstName + " " + lastName + " " + "\n mailbox capacity" + " " + mailboxCapacity
                + " " + "mb";
    }
}