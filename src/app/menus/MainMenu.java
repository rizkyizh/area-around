package app.menus;

import app.Utility;
import data.Persegi;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public void mainMenu(String[] menuList, MainMenu menuSwitch, boolean isKembali){

     Scanner terminalInput = new Scanner(System.in);
        boolean isLanjutkan = true;
        String userInput;

        while (isLanjutkan){
            Utility.clearScreen();
            System.out.println("======================================================");
            System.out.println("        MENGHITUNG LUAS & KELILING BIDANG DATAR       ");
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < menuList.length; i++) {
                System.out.println(i+1 + ". " + menuList[i]);
            }
            System.out.println("------------------------------------------------------");
            if (isKembali){
                System.out.println(menuList.length + 1 + ". KEMBALI");
                System.out.println(menuList.length + 2 + ". KELUAR");
            }else {
                System.out.println(menuList.length + 1 + ". KELUAR");
            }
            System.out.print("\n" + "masukkan pilihan anda: ");
            userInput = terminalInput.next();
            menuSwitch.menuPilihan(userInput);

            isLanjutkan = Utility.yesOrNo("\nApakah ingin melanjutkan ");
        }


    }
    public void menuPilihan(String inputUser){
        Scanner terminalInput = new Scanner(System.in);
        switch (inputUser){
            case "1" : {
                Persegi objPersegi = new Persegi("Persegi");
                Utility.header(objPersegi);
                System.out.printf("Masukkan sisi %s: ", objPersegi.name);
                try {
                    double sisi = terminalInput.nextDouble();
                    objPersegi.setSisi(sisi);
                }catch (InputMismatchException e){
                    System.out.println("input invalid");
                    return;
                }
                System.out.printf("\nLUAS %s adalah : " + objPersegi.luas(), objPersegi.name);
                System.out.printf("\nKELILING %s adalah : " + objPersegi.keliling(), objPersegi.name);
                break;
            }
            case "2": {
                Persegi objPersegiPanjang = new Persegi("Persegi Panjang");
                Utility.header(objPersegiPanjang);
                try {
                    System.out.printf("Masukkan Panjang %s: ", objPersegiPanjang.name);
                    double panjang = terminalInput.nextDouble();
                    System.out.printf("Masukkan Lebar %s: ", objPersegiPanjang.name);
                    double lebar = terminalInput.nextDouble();
                    objPersegiPanjang.setPanjang(panjang);
                    objPersegiPanjang.setLebar(lebar);
                }catch (InputMismatchException e){
                    System.out.println("Input Invalid");
                    return;
                }
                System.out.printf("\nLUAS %s adalah : " + objPersegiPanjang.luas(), objPersegiPanjang.name);
                System.out.printf("\nKELILING %s adalah : " + objPersegiPanjang.keliling(), objPersegiPanjang.name);
                break;
            }
            case "3" : {
                String[] menuList = {
                        "Segitiga sama sisi",
                        "Segitiga sama kaki",
                        "Segitiga lancip",
                        "Segitiga tumpul",
                        "Segitiga siku-siku"
                };
                MenuSegitiga menuSegitiga = new MenuSegitiga();
                this.mainMenu(menuList, menuSegitiga, true);
            }
            case "4" : {
                String[] menuList = {
                        "Hitung dengan Jari-Jari",
                        "Hitung dengan Diameter"
                };
                MenuLingkaran menuLingkaran = new MenuLingkaran();
                this.mainMenu(menuList, menuLingkaran, true);
            }
            case "5" : {
                String[] menuList = {
                        "Hitung Luas Trapesium",
                        "Hitung Keliling Trapesium"
                };
                MenuTrapesium menuTrapesium = new MenuTrapesium();
                this.mainMenu(menuList, menuTrapesium, true);
            }
            case "6" : {
                String[] menuList = {
                        "Hitung Luas Belah Ketupat",
                        "Hitung Keliling Belah Ketupat"
                };
                MenuBelahKetupat menuBelahKetupat = new MenuBelahKetupat();
                this.mainMenu(menuList, menuBelahKetupat, true);
            }
            case "7" : {
                System.exit(0);
            }
            default:  {
                System.out.println("pilihan yg anda masukkan salah");
                System.out.println("silahkan pilih [1-7]");
            }

        }
    }

}
