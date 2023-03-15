package data;

public abstract class Shape {
  public String name;

  public Shape(String name) {
    this.name = name;
  }

  public abstract double luas();
  public abstract double keliling();


}

