package app.menus;

import data.Trapesium;
import app.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTrapesium extends MainMenu{
    @Override
    public void menuPilihan(String inputUser) {
        Scanner inputTerminal = new Scanner(System.in);
        try {
            switch (inputUser) {
                case "1": {
                    Trapesium trapesium = new Trapesium("LUAS Trapesium");
                    Utility.header(trapesium);
                    System.out.print("Masukkan alas A: ");
                    double alasA = inputTerminal.nextDouble();
                    System.out.print("Masukkan alas B: ");
                    double alasB = inputTerminal.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = inputTerminal.nextDouble();
                    trapesium.setAlasA(alasA);
                    trapesium.setAlasB(alasB);
                    trapesium.setTinggi(tinggi);
                    System.out.printf("\n%s adalah : " + trapesium.luas(), trapesium.name);
                    break;
                }
                case "2": {
                    Trapesium trapesium = new Trapesium("KELILING Trapesium");
                    Utility.header(trapesium);
                    System.out.print("Masukkan sisi A: ");
                    double sisiA = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi B: ");
                    double sisiB = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi C: ");
                    double sisiC = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi D: ");
                    double sisiD = inputTerminal.nextDouble();
                    trapesium.setAlasA(sisiA);
                    trapesium.setAlasB(sisiB);
                    trapesium.setSisiC(sisiC);
                    trapesium.setTinggi(sisiD);
                    System.out.printf("\n%s adalah : " + trapesium.keliling(), trapesium.name);
                    break;
                }
                case "3": {
                    //back to Main Manu
                    String[] mainmenuList = {"persegi", "persegi panjang", "segitiga", "lingkaran", "Trapesium", "Belah ketupat"};
                    MainMenu menuObj = new MainMenu();
                    menuObj.mainMenu(mainmenuList, menuObj, false);
                }
                case "4": {
                    System.exit(0);
                }

            }
        }catch (InputMismatchException e){
            System.out.println("Input Invalid!");
        }
    }
}
