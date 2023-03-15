package data;

public class Lingkaran extends Shape{
    private final double phi = 3.14;
    private Double jari_jari = (double) 0;
    private Double diameter = (double) 0;

    public Double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(Double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Lingkaran(String name) {
        super(name);
    }

    @Override
    public double luas() {
        return 0;
    }
    public double luas(boolean isDisplay) {
        if (isDisplay){
            int radius = 5;
            int diameter = radius * 2;

            for (int y = -radius; y <= radius; y++) {
                for (int x = -radius; x <= radius; x++) {
                    double distance = Math.sqrt(x * x + y * y);
                    if (distance <= radius) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        if (this.getJari_jari() != 0){
            return this.phi * this.getJari_jari() * this.getJari_jari();
        };
        return (this.phi * (this.getDiameter() * this.getDiameter())) / 4;
    }

    @Override
    public double keliling() {
        if (this.getJari_jari() != 0){
            return 2 * this.phi * this.getJari_jari();
        };
        return this.phi * this.getDiameter();
    }
}
