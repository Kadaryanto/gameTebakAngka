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
            System.out.println("Masukkan Nama anda atau tekan y untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPemain.add(cariY);
            // Mulai Ngegame
            if(cariY!="y"){
                // Mulai Tebak
                System.out.println("Mulai Game");
                // Tebak
                
              // ------------------- START EDIT HERE
                int gameOper;
                int AngKaAcak=angkaRandom.nextInt(10);
                do{
                    int kesempatan=5;                    
                    System.out.println("Tabakan Anda ? " + AngKaAcak);
                    int SendiriTebak=input.nextInt();
                    if(AngKaAcak==SendiriTebak){
                        gameOper=1;
                    }
                }
                while(gameOper==1);
              
              // ------------------- END OF EDIT
            } // Stop Looping Nama Pemain
            
        }        
        while(!("y").equals(cariY));
        int jumPemain=namaPemain.size();
        System.out.println("SCORE");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(namaPemain.get(l));
        }
    }
}
