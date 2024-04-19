package CH1.Pertemuan3and4;

public class IfElseEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;
        if (a==b){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
            System.out.println("=============");
        }
        checkAngka(a,b,c);
    }
    public static void checkAngka(int a, int b, int c){
        if (a==b){
            System.out.println("Equals");
        } else if (a<=b) {
            System.out.println(a<=b);
        } else if (a>=b) {
            System.out.println(a>=b);
        }
    }


}


