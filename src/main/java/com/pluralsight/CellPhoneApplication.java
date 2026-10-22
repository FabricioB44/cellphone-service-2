package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        System.out.print("Enter serial number: ");
        cellPhone1.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine(); // Clear the input buffer

        System.out.print("Enter model: ");
        cellPhone1.setModel(myScanner.nextLine());

        System.out.print("Enter carrier: ");
        cellPhone1.setCarrier(myScanner.nextLine());

        System.out.print("Enter phone number: ");
        cellPhone1.setPhoneNumber(myScanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(myScanner.nextLine());

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(249531);
        cellPhone2.setModel("Google Pixel");
        cellPhone2.setCarrier("Verizon");
        cellPhone2.setPhoneNumber("412-999-1111");
        cellPhone2.setOwner("Bill Gates");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.printf("\n=== %s's Phone Details ===\n", phone.getOwner());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model:         " + phone.getModel());
        System.out.println("Carrier:       " + phone.getCarrier());
        System.out.println("Phone Number:  " + phone.getPhoneNumber());
        System.out.println("Owner:         " + phone.getOwner());
    }
}
