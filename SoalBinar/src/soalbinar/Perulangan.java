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
public class Perulangan {
    
    @SuppressWarnings("empty-statement")
    public Perulangan(){
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Jumlah Baris : ");
            int nilai = Integer.parseInt(reader.readLine());
            
            for (int i = 1; i <= nilai; i++) {
                System.out.print(" ");
                for (int k = 0; k<=(i*1)-1; k++){
                System.out.print("*");
            }
                System.out.println(" ");
            }
           
            
        }
        catch(Exception ex){
            System.out.println("Terjadi error");
        }
    }
}
