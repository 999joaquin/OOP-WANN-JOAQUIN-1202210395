package MODUL1;

import java.util.Scanner;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    Scanner sc = new Scanner(System.in);
    String nama, noHP;

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void registerUser(){
        System.out.println("Selamat datang di restoran EAD");
        System.out.println("Silahkan register terlebih dahulu");
        system.out.println("======================================");
        System.out.print("Nama: ");
        nama = sc.nextLine();
        noHP = sc.nextLine();
        
    }

    public void registerSuccess(){
        System.out.println("Register success!");
        system.out.println("Name: " + nama);
        system.out.println("Phone Number: " + noHP);
    }

}
