package CH2.Pertemuan1.Class;

public class Main  {
    public static void main(String[] args) {

        int a = 10;
        double b = 10.0;

        Mobil mobil = new Mobil();

        mobil.setRoda("4");
        mobil.setType("Sedan");
        mobil.setKecepatan(100.0);

        System.out.println("Roda Mobil : " + mobil.getRoda());
        System.out.println("Type Mobil : " + mobil.getType());
        System.out.println("Kecepatan Mobil : " + mobil.getKecepatan());


        mobil.kecepatan();
        System.out.println(mobil.kecepatan(200.0,60));
        System.out.println(mobil.kecepatan(200.0,60,"Avaanza"));


    }
}
