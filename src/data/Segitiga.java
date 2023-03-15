package data;

public class Segitiga extends Shape{
    private double alas, tinggi, sisiA, sisiB, sisiC;

    public Segitiga(String name) {
        super(name);
    }

    @Override
    public double luas() {
        if (super.name.equalsIgnoreCase("segitiga siku-siku")){
            System.out.println("\n||\\             | ");
            System.out.println("|||\\\\            | ");
            System.out.println("||  \\\\           | ");
            System.out.println("||   \\\\          | ");
            System.out.println("||    \\\\         | ");
            System.out.println("||     \\\\        | "+ this.getTinggi() );
            System.out.println("||      \\\\       | ");
            System.out.println("||       \\\\      | ");
            System.out.println("||        \\\\     | ");
            System.out.println("===="+ this.getAlas() + " ====");

        }else {
            System.out.println("\n        /|\\");
            System.out.println("       //|\\\\");
            System.out.println("      // | \\\\");
            System.out.println("     //  |  \\\\");
            System.out.println("    //   |   \\\\");
            System.out.println("   //   "+ this.getTinggi() +"  \\\\");
            System.out.println("  //     |     \\\\");
            System.out.println(" //      |      \\\\");
            System.out.println("//       |       \\\\");
            System.out.println("======= "+ this.getAlas() + " =======");
        }
            return (this.getAlas() * this.getTinggi()) / 2;
    }

    @Override
    public double keliling() {
        if (super.name.equalsIgnoreCase("Segitiga Sama Sisi")){
            System.out.println("\n        /\\         ");
            System.out.println("       /  \\        ");
            System.out.println("      /    \\ " + this.getSisiA());
            System.out.println("     /      \\      ");
            System.out.println("    /________\\     ");
            return this.getSisiA() * 3;
        }else if (super.name.equalsIgnoreCase("Segitiga Sama Kaki")){
            System.out.println("\n        /\\         ");
            System.out.println("       /  \\        ");
            System.out.println("      /    \\ " + this.getSisiA());
            System.out.println("     /      \\      ");
            System.out.println("    /________\\     ");
            System.out.println("       " + this.getAlas());
            return this.getSisiA() * 2 + this.getAlas();
        } else if (super.name.equalsIgnoreCase("segitiga lancip") || super.name.equalsIgnoreCase("segitiga tumpul")) {
            System.out.println("\n        /\\         ");
            System.out.println("       /  \\        ");
            System.out.println("    "+this.getSisiA()+ "  " + this.getSisiB());
            System.out.println("     /      \\      ");
            System.out.println("    /________\\     ");
            System.out.println("       " + this.getSisiC());
            return this.getSisiA() + this.getSisiB() + this.getSisiC();
        }else if (super.name.equalsIgnoreCase("segitiga siku-siku")){
            System.out.println("\n        |\\       ");
            System.out.println("        | \\        ");
            System.out.println(this.getTinggi()+ "     |  \\ " + this.getSisiA());
            System.out.println("        |   \\      ");
            System.out.println("        |____\\     ");
            System.out.println("       " + this.getAlas());
            return this.getSisiA() + this.getTinggi() + this.getAlas();
        }
        return 0;
    }


    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiA() {
        return sisiA;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }
}
