/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalbinar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author HIKENSABO
 */
public class Katak {
    @SuppressWarnings("empty-statement")
    public Katak(){
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Posisi : ");
            int posisi = Integer.parseInt(reader.readLine());
            
            System.out.print("Tujuan : ");
            int tujuan = Integer.parseInt(reader.readLine());
            
            System.out.print("Jarak Lompatan : ");
            int jarak = Integer.parseInt(reader.readLine());
            
//            for (int x=posisi;x<=tujuan;x=x+jarak){
//                System.out.println(x+", ");
//                
//            }

             int hasil = ((tujuan - posisi) % jarak ) + ((tujuan - posisi) / jarak) ;

             System.out.println("hasil : "+hasil);
        }
        catch(Exception ex){
            System.out.println("Terjadi error");
        }
    }
}
