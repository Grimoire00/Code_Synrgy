package CH2.Pertemuan2.abstrac;



public abstract class Vehicle {
    // Atribut
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public Vehicle(String brand) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method untuk menghitung biaya servis kendaraan
    public abstract double calculateServiceCost();

    public abstract int roda();

    public void sampleMethod(){

    }

}

