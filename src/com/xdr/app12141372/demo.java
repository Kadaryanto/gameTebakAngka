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
            int NilaiJalan = 0;
            int CekGameOver=0;
            
            int aKumulasi[]= new int[6];
            int NilaiPasJalan=0;
            // Mulai Ngegame
            if(!("y").equals(cariY)){
                // Mulai Tebak
                
                // Tebak
                
              // ------------------- START EDIT HERE
                String nextLevel; // untuk Menaikkan Level
                int gameOper;
                int PiLevel=1;
                
                // Akumulasi Nilai
                
                
                // End Off Akumulasi Nilai
                System.out.println("Selamat Datang " + cariY);
                do{
                    int kesempatan=5;
                    int Kout, Ang, Pang;
                    
                    System.out.println("# Level " + PiLevel);
                    int StarNilaiO=PiLevel-1;
                    
                    Pang=PiLevel*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    int AngKaAcak=angkaRandom.nextInt(Pang);
                    
                    for(Kout=0;Kout<=5;Kout++){
                        if(Kout==5){
                            System.out.println("GAMEOVER! Anda Gagal");
                            CekGameOver++;
                        }
                        else{
                            
                            System.out.println("Tebakan Anda ? " + AngKaAcak);
                            int AkuTeb=input2.nextInt();
                            int Kurang=4-Kout;
                            
                            // Mengakumulasi Nilai
                            
                            // Akumulasi Selesai
                            if(AkuTeb==AngKaAcak){
                                // Penilaian
                                if(Kout==0){
                                    NilaiPasJalan=PiLevel*100;
                                }
                                else if(Kout==1){
                                    NilaiPasJalan=PiLevel*70;
                                }
                                else if(Kout==2){
                                    NilaiPasJalan=PiLevel*50;
                                }
                                else if(Kout==3){
                                    NilaiPasJalan=PiLevel*30;
                                }
                                else{
                                    NilaiPasJalan=0;
                                }
                            //
                                int NeTebak=Kout+1;
                                
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + NeTebak + " kali tebakan. Sekor anda adalah " + NilaiPasJalan);
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
                    }
                    // Jika GameOver
                    if(CekGameOver>0){
                        break;
                    }
                    // Memapankan Nilai :D
                    if(PiLevel==5){ // Jika sudah Mencapai Level 5, langsung di break/otomatis Exit
                        break;
                    }
                    else{
                    aKumulasi[StarNilaiO]=NilaiPasJalan;    
                    System.out.println("Level Anda : " + PiLevel);
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau 'exit' untuk keluar : ");
                    nextLevel=input.nextLine();
                    PiLevel++;
                    
                    }
                   
                }
                while(!"exit".equals(nextLevel));
              
              // ------------------- END OF EDIT
            } // Stop Looping Nama Pemain
            // Ngolah Nilai
            for(int rO=0; rO<5; rO++){
                NilaiJalan=NilaiJalan+aKumulasi[rO];
            }
            sekorPermainan.add(NilaiJalan);
            
        }        
        while(!"y".equals(cariY));
        int jumPemain=namaPemain.size();
        System.out.println("SCORE");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(namaPemain.get(l) + " : " + sekorPermainan.get(l));
        }
    }
}
