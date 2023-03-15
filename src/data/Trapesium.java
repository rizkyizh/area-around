package data;

public class Trapesium extends Shape{

    private double alasA, alasB, tinggi, sisiC;
    public Trapesium(String name) {
        super(name);
    }

    @Override
    public double luas() {
        return ((this.getAlasA() + this.getAlasB()) * this.getTinggi()) / 2;
    }

    @Override
    public double keliling() {
        return this.getAlasA() + this.getAlasB() + this.getSisiC() + this.getTinggi();
    }

    public double getAlasA() {
        return alasA;
    }

    public void setAlasA(double alasA) {
        this.alasA = alasA;
    }

    public double getAlasB() {
        return alasB;
    }

    public void setAlasB(double alasB) {
        this.alasB = alasB;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }
}
