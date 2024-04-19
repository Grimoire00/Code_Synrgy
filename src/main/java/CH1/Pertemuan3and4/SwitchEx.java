package CH1.Pertemuan3and4;

public class SwitchEx {
    public static void main(String[] args) {
        String grade = "A";
        String hasil = null;

        switch (grade){
            case "A":
                hasil = "Lulus";
                break;
            case "B":
                hasil = "Lulus";
                break;
            case "C":
                hasil = "Tidak Lulus";
            case "D":
                hasil = "Tidak Lulus";
        }
        System.out.println("result ="+hasil);
        checkGrade();
    }

    public static void checkGrade(){
        String grade = "A";
        String hasil = switch (grade){
            case "A", "B" -> "lulus";
            case "C" -> "tidak lulus";
            default -> "tidak lulus";
        };
        System.out.println("Result = "+hasil);
    }
}
