/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan3_51019021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 * @author Lab20703
 */
public class Percobaan3_51019021 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       BufferedReader key=new BufferedReader(new
               InputStreamReader(System.in));
        System.out.println("Menu Pilihan");
        System.out.println("1. Operasi Geometri Lingkaran");
        System.out.println("2. Operasi Geometri Segitiga");
        System.out.println("3. Exit");
        System.out.print("Pilihan anda?");
        String pilihan=key.readLine();
        if(pilihan.equals("1")){
            System.out.print("Masukkan jari-jari lingkaran:");
            double r=Double.parseDouble(key.readLine());
            Lingkaran p=new Lingkaran(r);
            p.display();
        }else if(pilihan.equals("2")){
            System.out.println("Lengkapi untuk operasi SegiTiga....");
        }else if(pilihan.equals("3")){
            System.out.println("Bye-Bye");
            System.exit(0);
        }else{
            System.out.println("Pilihan salah");
            
        }
        
        
        
    }
    
}
