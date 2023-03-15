package app.menus;

import app.Utility;
import data.BelahKetupat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBelahKetupat extends MainMenu{
    @Override
    public void menuPilihan(String inputUser) {
        Scanner inputTerminal = new Scanner(System.in);
        try {
            switch (inputUser) {
                case "1": {
                    BelahKetupat belahKetupat = new BelahKetupat("LUAS Belah Ketupat");
                    Utility.header(belahKetupat);
                    System.out.print("Masukkan Diagonal 1: ");
                    double d1 = inputTerminal.nextDouble();
                    System.out.print("Masukkan Diagonal 2: ");
                    double d2 = inputTerminal.nextDouble();
                    belahKetupat.setD1(d1);
                    belahKetupat.setD2(d2);
                    System.out.printf("\n%s adalah : " + belahKetupat.luas(), belahKetupat.name);
                    break;
                }
                case "2": {
                    BelahKetupat belahKetupat = new BelahKetupat("KELILING Belah Ketupat");
                    Utility.header(belahKetupat);
                    System.out.print("Masukkan Sisi: ");
                    double sisi = inputTerminal.nextDouble();
                    belahKetupat.setSisi(sisi);
                    System.out.printf("\n%s adalah : " + belahKetupat.keliling(), belahKetupat.name);
                    break;
                }
                case "3": {
                    //Back to Main Menu
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
