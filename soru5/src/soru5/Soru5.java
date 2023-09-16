/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner deger=new Scanner(System.in);
        int[] dizi=new int[4];
        int sayi=deger.nextInt();
        int idx=0;
        while(sayi!=-1)
        {
            if (idx>=dizi.length) 
            {
                dizi=Genislet(dizi);
            }
            dizi[idx]=sayi;
            idx++;
            sayi=deger.nextInt();
        }
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
     
    }
    public static int[] Genislet (int[] dizi)
    {          
        int [] yenidizi=new int[dizi.length*2];
        for (int i = 0; i < dizi.length; i++) {
            yenidizi[i]=dizi[i];
            
        }
        return yenidizi;
       
    }
    
}
