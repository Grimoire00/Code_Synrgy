package CH1.Pertemuan5;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String []argh)
    {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("Baban", "0818777777");
        hash.put("Beben", "0817777777");
        hash.put("Bobon", "0878777777");
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nama yang dicari: ");
        while(in.hasNext())
        {
            String s = in.nextLine();
            try
            {
                String out= hash.get(s);
                System.out.println(s+" = "+out);
            }
            catch(Exception e)
            {
                System.out.println("Nama tidak ditemukan");
            }
        }


    }
}

