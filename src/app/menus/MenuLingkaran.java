package app.menus;

import app.Utility;
import data.Lingkaran;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLingkaran extends MainMenu {
    @Override
    public void menuPilihan(String inputUser) {
        Scanner inputTerminal = new Scanner(System.in);
        try {
            switch (inputUser) {
                case "1": {
                    Lingkaran lingkaran = new Lingkaran("Lingkaran dengan jari-jari");
                    Utility.header(lingkaran);
                    System.out.print("Masukkan jari-jari: ");
                    Double jari_jari = inputTerminal.nextDouble();
                    lingkaran.setJari_jari(jari_jari);
                    lingkaran.luas(true);
                    System.out.printf("\nLUAS %s adalah : " + lingkaran.luas(false), lingkaran.name);
                    System.out.printf("\nKELILING %s adalah : " + lingkaran.keliling(), lingkaran.name);
                    break;
                }
                case "2": {
                    Lingkaran lingkaran = new Lingkaran("Lingkaran dengan diameter");
                    Utility.header(lingkaran);
                    System.out.print("Masukkan Diameter: ");
                    Double diameter = inputTerminal.nextDouble();
                    lingkaran.setDiameter(diameter);
                    lingkaran.luas(true);
                    System.out.printf("\nLUAS %s adalah : " + lingkaran.luas(false), lingkaran.name);
                    System.out.printf("\nKELILING %s adalah : " + lingkaran.keliling(), lingkaran.name);
                    break;
                }
                case "3": {
                    String[] mainmenuList = {"persegi", "persegi panjang", "segitiga", "lingkaran", "Trapesium", "Belah ketupat"};
                    MainMenu menuObj = new MainMenu();
                    menuObj.mainMenu(mainmenuList, menuObj, false);
                }
                case "4": {
                    System.exit(0);
                }
                default: {
                    System.out.println("pilihan yg anda masukkan salah");
                    System.out.println("silahkan pilih [1-4]");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Input Invalid!");
        }
    }
}
