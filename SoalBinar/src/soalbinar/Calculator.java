/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalbinar;

//import java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import java.io.InputStreamReader;

/**
 *
 * @author HIKENSABO
 */
public class Calculator {
    
@SuppressWarnings("empty-statement")
    public Calculator(){
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Nilai 1 = ");
            int nilai1 = Integer.parseInt(reader.readLine());
            
            System.out.print("Nilai 2 = ");
            int nilai2 = Integer.parseInt(reader.readLine());
            
            System.out.println("Operator");
            System.out.println("(+) tambah");
            System.out.println("(-) kurang");
            System.out.println("(*) kali");
            System.out.println("(/) bagi");
            System.out.print("pilih (1-4) = ");
            
            int Cal = Integer.parseInt(reader.readLine());
            
            if(Cal == 1){
                int hasil = nilai1 + nilai2;
                System.out.println("Hasil "+nilai1 + " + " +nilai2+ " = "+hasil);
            }else if(Cal == 2){
                int hasil = nilai1 - nilai2;
                System.out.println("Hasil "+nilai1 + " - " +nilai2+ " = "+hasil);
            }else if(Cal == 3){
                int hasil = nilai1 * nilai2;
                System.out.println("Hasil "+nilai1 + " * " +nilai2+ " = "+hasil);
            }else if(Cal == 4){       
                int hasil = nilai1 / nilai2;
                System.out.println("Hasil "+nilai1 + " / " +nilai2+ " = "+hasil);
            }else{
                System.out.println("Inputan anda salah");
            }
            
//           System.out.println("Hasil nya adalah "+hasil);
        }
        catch(Exception ex){
            System.out.println("Terjadi error");
        }
    }
    
}
