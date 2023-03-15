package data;

public class BelahKetupat extends Shape{
    private double d1, d2, sisi;

    public BelahKetupat(String name) {
        super(name);
    }

    @Override
    public double luas() {
        return (this.getD1() * this.getD2()) / 2;
    }

    @Override
    public double keliling() {
        return this.getSisi() * 4;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
