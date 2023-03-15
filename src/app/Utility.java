package app;
import data.Shape;
import java.util.Scanner;

public class Utility {

    public static void header(Shape title){
        System.out.println("\n======================================================");
        System.out.println("                  " + title.name.toUpperCase());
        System.out.println("------------------------------------------------------");
    }
    public static boolean yesOrNo (String message){
        Scanner inputTerminal = new Scanner(System.in);
        System.out.print("\n" + message + "[y/n]");
        String inputUser = inputTerminal.next();
        while (!inputUser.equalsIgnoreCase("y") && !inputUser.equalsIgnoreCase("n")){
            System.out.println("pilihan anda bukan [y/n]");
            System.out.print("\n" + message + "[y/n] : ");
            inputUser = inputTerminal.next();
        }

        return inputUser.equalsIgnoreCase("y");
    }
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\003\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }


}
