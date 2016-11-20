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
                // Tebak
                
              // ------------------- START EDIT HERE
                String nextLevel; // untuk Menaikkan Level
                int gameOper;
                do{
                    int kesempatan=5;
                    int Kot, Ang, Pang;
                    int PiLevel=0;
                    System.out.println("# Level 1");
                    System.out.println("Selamat Datang " + cariY);
                    Pang=PiLevel+1*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    int AngKaAcak=angkaRandom.nextInt(Pang);
                    for(Kot=0;Kot<2;Kot++){

                        System.out.println("Tebakan Anda ? " + AngKaAcak);
                        int AkuTeb=input.nextInt();
                        int Kurang=5-Kot;
                        if(AkuTeb==AngKaAcak){
                            System.out.println("Jawaban Betul");
                            break;
                            
                        }
                        else{
                            if(AkuTeb>AngKaAcak){
                                System.out.println("Tebakan Anda terlalu Besar! Anda mempunya kesempatan " + Kurang + " lagi" );
                            }
                            else{
                                System.out.println("Tebakan Anda terlalu Kecil! Anda mempunya kesempatan " + Kurang + " lagi" );
                            }
                            Kot++;
                        }
                    }
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau 'exit' untuk keluar : ");
                    nextLevel=input.nextLine();
                    PiLevel++;
                    
                   
                }
                while(!"exit".equals(nextLevel));
              
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
