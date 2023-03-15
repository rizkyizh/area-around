import app.menus.MainMenu;


public class Main {
    public static void main(String[] args) {
        String[] mainmenuList = {"persegi", "persegi panjang", "segitiga", "lingkaran", "Trapesium", "Belah ketupat"};
        MainMenu menuObj = new MainMenu();
        menuObj.mainMenu(mainmenuList, menuObj, false);

    }
}