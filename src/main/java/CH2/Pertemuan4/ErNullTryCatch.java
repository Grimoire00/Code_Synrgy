package CH2.Pertemuan4;

public class ErNullTryCatch {
    public static void main(String[] args) {
        String str = null;
        try{
            //Open koneksi DB
            //Open/write file
            int length = str.length();
            System.out.println(length);

        }catch (Exception e){
            System.out.println("Handling Error ... " + e.getMessage());
            //Lakukan penanganan yang sesuai, seperti memberikan nilai default
            str = "";
        }finally {
            str = "";
            //tutup koneksi DB
            //close file
        }


        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[3]);
        }catch (Exception e){
            System.out.println("Handling Error ... " + e.getMessage());
        }

    }

}