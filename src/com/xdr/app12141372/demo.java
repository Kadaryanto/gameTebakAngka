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
        Scanner input2= new Scanner(System.in);
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
                int NilaiJalan=0;
                // Tebak
                
              // ------------------- START EDIT HERE
                String nextLevel; // untuk Menaikkan Level
                int gameOper;
                int PiLevel=1;
                System.out.println("Selamat Datang " + cariY);
                do{
                    int kesempatan=5;
                    int Kout, Ang, Pang;
                    
                    System.out.println("# Level " + PiLevel);
                    
                    Pang=PiLevel*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    int AngKaAcak=angkaRandom.nextInt(Pang);
                    for(Kout=0;Kout<5;Kout++){

                        System.out.println("Tebakan Anda ? " + AngKaAcak);
                        int AkuTeb=input2.nextInt();
                        int Kurang=4-Kout;
                        if(AkuTeb==AngKaAcak){
                            System.out.println("Jawaban Betul");
                            break;
                            
                        }
                        else{
                            if(AkuTeb>AngKaAcak){
                                System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                            }
                            else{
                                
                                System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                            }
                        }
                    }
                    // Memapankan Nilai :D
                    if(PiLevel==5){ // Jika sudah Mencapai Level 5, langsung di break/otomatis Exit
                        break;
                    }
                    else{
                        
                    System.out.println("Level Anda : " + PiLevel);
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau 'exit' untuk keluar : ");
                    nextLevel=input.nextLine();
                    PiLevel++;
                    }
                   
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
