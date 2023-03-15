package app.menus;

import app.Utility;
import data.Segitiga;
import data.Shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSegitiga extends MainMenu{

    @Override
    public void menuPilihan(String inputUser) {
        switch (inputUser){
            case "1" : {
                Segitiga segitigaSamaSisi = new Segitiga("Segitiga Sama Sisi");
                MenuSegitiga.menuLuasAtauKeliling(segitigaSamaSisi);
                return;
            }
            case "2": {
                Segitiga segitigaSamaKaki = new Segitiga("Segitiga Sama Kaki");
                MenuSegitiga.menuLuasAtauKeliling(segitigaSamaKaki);
                return;
            }
            case "3" : {
                Segitiga segitigaLancip = new Segitiga("Segitiga Lancip");
                MenuSegitiga.menuLuasAtauKeliling(segitigaLancip);
                return;
            }
            case "4" : {
                Segitiga segitigaTumpul = new Segitiga("Segitiga Tumpul");
                MenuSegitiga.menuLuasAtauKeliling(segitigaTumpul);
                return;
            }
            case "5" : {
                Segitiga segitigaSikuSiku = new Segitiga("Segitiga Siku-Siku");
                MenuSegitiga.menuLuasAtauKeliling(segitigaSikuSiku);
                return;
            }
            case "6" : {
                String[] mainmenuList = {"persegi", "persegi panjang", "segitiga", "lingkaran", "Trapesium", "Belah ketupat"};
                MainMenu menuObj = new MainMenu();
                menuObj.mainMenu(mainmenuList, menuObj, false);
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

    private static void menuLuasAtauKeliling(Segitiga objShape){
        Utility.clearScreen();
        Utility.header(objShape);
        System.out.println("1. Hitung Luas");
        System.out.println("2. Hitung Keliling");
        System.out.println("------------------------------------------------------");
        System.out.println("3. KEMBALI");
        System.out.println("4. KELUAR");
        System.out.print("\n" + "masukkan pilihan anda: ");
        Scanner inputTerminal = new Scanner(System.in);
        String pilihanUser = inputTerminal.next();
        try {
            if (pilihanUser.equalsIgnoreCase("1")) {
                System.out.printf("Masukkan alas %s: ", objShape.name);
                double alas = inputTerminal.nextDouble();
                System.out.printf("Masukkan tinggi %s: ", objShape.name);
                double tinggi = inputTerminal.nextDouble();
                objShape.setAlas(alas);
                objShape.setTinggi(tinggi);
                System.out.printf("\nLUAS %s adalah : " + objShape.luas(), objShape.name);

            } else if (pilihanUser.equalsIgnoreCase("2")) {
                if (objShape.name.equalsIgnoreCase("segitiga sama sisi")) {
                    System.out.printf("Masukkan sisi %s: ", objShape.name);
                    double sisi = inputTerminal.nextDouble();
                    objShape.setSisiA(sisi);
                } else if (objShape.name.equalsIgnoreCase("segitiga sama kaki")) {
                    System.out.printf("Masukkan sisi A dan B atau kaki-kaki %s: ", objShape.name);
                    double sisiAdanB = inputTerminal.nextDouble();
                    System.out.printf("Masukkan alas %s: ", objShape.name);
                    double alas = inputTerminal.nextDouble();
                    objShape.setSisiA(sisiAdanB);
                    objShape.setAlas(alas);
                } else if (objShape.name.equalsIgnoreCase("segitiga lancip") || objShape.name.equalsIgnoreCase("segitiga tumpul")) {
                    System.out.print("Masukkan sisi A : ");
                    double sisiA = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi B : ");
                    double sisiB = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi C : ");
                    double sisiC = inputTerminal.nextDouble();
                    objShape.setSisiA(sisiA);
                    objShape.setSisiB(sisiB);
                    objShape.setSisiC(sisiC);
                } else if (objShape.name.equalsIgnoreCase("segitiga siku-siku")) {
                    System.out.print("Masukkan tinggi : ");
                    double tinggi = inputTerminal.nextDouble();
                    System.out.print("Masukkan sisi miring : ");
                    double sisiMiring = inputTerminal.nextDouble();
                    System.out.print("Masukkan alas : ");
                    double alas = inputTerminal.nextDouble();
                    objShape.setTinggi(tinggi);
                    objShape.setSisiA(sisiMiring);
                    objShape.setAlas(alas);
                }
                System.out.printf("\nKELILING %s adalah : " + objShape.keliling(), objShape.name);
            } else if (pilihanUser.equalsIgnoreCase("3")) {
                String[] menuList = {
                        "Segitiga sama sisi",
                        "Segitiga sama kaki",
                        "Segitiga lancip",
                        "Segitiga tumpul",
                        "Segitiga siku-siku"
                };
                MenuSegitiga menuSegitiga = new MenuSegitiga();
                menuSegitiga.mainMenu(menuList, menuSegitiga, true);
            } else if (pilihanUser.equalsIgnoreCase("4")) {
                System.exit(0);
            } else {
                System.out.println("pilihan yg anda masukkan salah");
                System.out.println("silahkan pilih [1-4]");
            }
        }catch (InputMismatchException e){
            System.out.println("Input Invalid");
        }
    }
}
