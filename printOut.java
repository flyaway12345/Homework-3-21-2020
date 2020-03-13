package profile;

import java.util.Scanner;

public class printOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------Welcome to the HI Media Network Database!!-------------------");
        System.out.println("---------You Add Contacts by typing a, Type A Name! Try it Out!----------");
        System.out.print("Input Here");
        char userInput = scan.next().charAt(0);

        if (userInput == 'a'){
            Database.addContact();
        }




    }
}
