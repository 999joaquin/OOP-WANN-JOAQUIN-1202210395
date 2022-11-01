package MODUL1;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        User userDisplay = new User();
        Scanner sc = new Scanner(System.in);

        // TODO Create Database


        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First

        // TODO Create User from register in Main Menu
        userDisplay.registerUser();
        userDisplay.registerSuccess();
        
        // TODO Display Menu

    }
}
