package CH2.Pertemuan2.abstrac;

public class Motorcycle extends Vehicle {
    // Atribut tambahan untuk sepeda motor
    boolean hasHelmet; // Apakah memiliki helm atau tidak

    // Constructor
    public Motorcycle(String brand, int year, boolean hasHelmet) {
        super(brand, year);
        this.hasHelmet = hasHelmet;
    }


    @Override
    public double calculateServiceCost() {
        return 50000;
    }

    @Override
    public int roda() {
        return 2;
    }
}

