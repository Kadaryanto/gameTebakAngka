package com.xdr.app12141372;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * 12141372
 * @author XDARR (KADARYANTO)
 */
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>();
        ArrayList <Integer> sekorPermainan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random angkaRandom=new Random();
        String Na="no";
        boolean PlayaGain = false;
        String cariY; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPemain.add(cariY);
            // Mulai Ngegame
            if(!("y").equals(cariY)){
                // Mulai Tebak
                System.out.println("Mulai Game");
                // Tebak
                
              // ------------------- START EDIT HERE
              int KoT, AnG;  
              int aNGk=angkaRandom.nextInt(10);
              for(KoT=0;KoT<5;KoT++){
                  System.out.println("Level" + KoT + " - ");
                  System.out.println("Tebakan Anda ? (" + aNGk + ")");
                  int iPT=input.nextInt();
                  if(aNGk==iPT){
                       System.out.println("Teebakan Tepat");
                       break;
                  }
                  else{
                      System.out.println("Salah");
                  }
              }
              
              // ------------------- END OF EDIT
            } // Stop Looping Nama Pemain
            
        }        
        while(!"y".equals(cariY));
        int jumPemain=namaPemain.size();
        System.out.println("SCORE");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(namaPemain.get(l));
        }
    }
}
