package ProgPOE10047466;



import java.util.Scanner;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ST10047466
 */
public class Worker {

    final static int MAXIMUM_USERS = 5;
    final static int MAXIMUM_TASKS = 10;

    Login user[] = new Login[MAXIMUM_USERS];
    static int uRegCount = 0;
    static int uLoggedIn = 0;
    Scanner input = new Scanner(System.in);

    public void printInvalidError(String failedMsg) {
        JOptionPane.showMessageDialog(null, failedMsg, "ERROR, Request has NOT been completed", JOptionPane.ERROR_MESSAGE);
    }

    public void printSuccess(String passedMsg) {
        JOptionPane.showMessageDialog(null, passedMsg, "SUCCESS, Request has been completed", JOptionPane.INFORMATION_MESSAGE);
    }

    public int printLoginMenu() {
        String usrInput;
        int uIndex = 0;
        boolean check = false;

        while (!check) {
            usrInput = JOptionPane.showInputDialog(null, "Please select an option using the corresponding numbers.\n"
                    + "\t1. Register a user\n"
                    + "\t2. Login a user\n"
                    + "\t3. Quit\n"
                    + "Registered users : " + uRegCount,
                    "Login / Register", JOptionPane.QUESTION_MESSAGE);

            if ((usrInput != null) && (!usrInput.isEmpty()) && (Character.isDigit(usrInput.charAt(0))))
                {
                uIndex = Integer.parseInt(usrInput);
                
                }
            else 
                {
                uIndex = 999;
                }
            if ((uIndex < 1) || (uIndex > 3)) 
            {
                 printInvalidError("Please enter a valid selection [1 to 3]");
            }
            else 
            {
                check = true;
            }
        }
        return uIndex;
    }

    public void registerUsr() {
        Scanner input = new Scanner(System.in);
        String usrString = "";
        Login fUser = new Login();
        boolean check = false;

        System.out.println("-------------\n");
        do {
            System.out.println("Create a username [max 5 chars, include underscore]");

            usrString = input.next();

            if (fUser.checkusrName(usrString)) 
            {
                check = true;
            } 
            else 
            {
                printInvalidError("Username is not correctly formatted. \n" + ""
                        + "Please ensure that your username contains an underscore and is no more than 5 characters in length.");
            }
        } 
        while (!check);
        fUser.setusrName(usrString);
        printSuccess("Username successfully captured");

        check = false;
        do {
            System.out.println("Please enter a password that is at least 8 characters long, it must contain:\n"+
                    "a special character,\n"+
                    "a capital letter \n"+
                    "and a number");
            usrString = input.next();

            if (fUser.checkPassword(usrString)) 
            {
                check = true;
            } 
            else 
            {
                printInvalidError ("Password must be 8 characters or longer, please also ensure that the password contains:\n"+
                        "a special character,\n"+
                        "a capital letter \n"+
                        "a number");
            }
        } while (!check);
        fUser.setPass(usrString);
        printSuccess("Password successfully captured");

        System.out.println("Please enter your first name:");
        usrString = input.next();
        fUser.setName(usrString);

        System.out.println("Please enter your surname:");
        usrString = input.next();
        fUser.setsurName(usrString);
        user[uRegCount] = fUser;
        uRegCount++;

        System.out.println("----------------\n");
        printSuccess ("Successfully registered");
    }

    public boolean loginUser() {
        boolean check = false;
        String tempusrName, tempPass;
        
        System.out.println(
                "------------");

        System.out.println(
                "Please enter your username to login:");
        tempusrName = input.next();

        System.out.println(
                "Please enter your password to login:");
        tempPass = input.next();

        System.out.println(
                "---------\n");

        for (int i = 0; i < uRegCount + 1; i++)
        {
            if (user[i].getusrName().equals(tempusrName)) 
            {
                if (user[i].getPass().equals(tempPass)) 
                {
                    check = true;
                    uLoggedIn = i;
                    break;
                }
            }
        }
        return check;
    }
           

        public void mainThread() {
                  
    
        int uIndex;
        boolean quit = false;
        boolean logged = false;

        do {
            uIndex = printLoginMenu();
            switch (uIndex) {
                case 1:
                    registerUsr();
                    break;
                case 2:
                    logged = loginUser();
                    if (!logged)
                    {
                    printInvalidError("Username or password incorrect,\n" +
                                            "please try again");
                    }
                    else 
                    {
                   JOptionPane.showMessageDialog(null, "Welcome " + user[uLoggedIn].getusrName() + ", " + user[uLoggedIn].getsurName() + "\n"
                           + " it is great to see you again!");
                    }
                    break;
                default:
                    logged = true;
            }
        } while (!logged);
         printSuccess("Thank you for using the app!");
    }
}
