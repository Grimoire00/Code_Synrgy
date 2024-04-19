package CH2.Pertemuan1.Class;

public class Mobil {

    private String roda;
    private String type;
    private Double kecepatan;

    public Mobil() {

    }

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(Double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Mobil(String roda, String type, Double kecepatan) {
        this.roda = roda;
        this.type = type;
        this.kecepatan = kecepatan;
    }


    public Mobil(String roda, String type) {
        this.roda = roda;
        this.type = type;
    }


    public void kecepatan(){
        System.out.println("kecepatan di print");
    }

    public  Double kecepatan(Double jarak, Integer waktu){
        return  jarak/waktu;
    }

    public  Double kecepatan(Double jarak, Integer waktu, String type){
        System.out.println("type ="+type);
        return  jarak/waktu;
    }

}
