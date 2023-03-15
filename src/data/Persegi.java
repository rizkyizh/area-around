package data;

public class Persegi extends Shape {
    private double sisi;
    private double lebar;
    private double panjang;

    //constructor
    public Persegi(String name){
        super(name);
    };

    @Override
    public double luas() {
        if (super.name.equalsIgnoreCase("persegi panjang")){
            return this.getPanjang() * this.getLebar();
        }
        return this.getSisi() * this.getSisi();
    }

    @Override
    public double keliling() {
        if (super.name.equalsIgnoreCase("persegi panjang")){
            return this.getPanjang() * 2 + this.getLebar() * 2;
        }
        return this.getSisi() * 4;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
