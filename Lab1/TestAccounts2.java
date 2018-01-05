package Lab1;

import java.util.Scanner;
/**
 * Write a description of class TestAccounts2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAccounts2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three names");
        
        Account a = new Account(100.00,scan.nextLine(), 001);
        Account b = new Account(100.00,scan.nextLine(), 002);
        Account c = new Account(100.00,scan.nextLine(), 003);
        
        
    }

}
