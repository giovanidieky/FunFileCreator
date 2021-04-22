/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfilecreator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FunFileCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner forRequest = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner format = new Scanner(System.in);
        
        System.out.println("Hi, Selamat Datang di GioDoc File Creator");
        System.out.println("Rancang script kalian disini");
                
        System.out.println("Kalian Bisa membuat :");
        System.out.println("1. File Bebas");
        System.out.println("2. Information");

        FunFileLibrary BorderLine = new FunFileLibrary("");
        
        BorderLine.hr("=");
        
        System.out.print("Pilih Keinginan anda : ");
        int request = forRequest.nextInt();
        
        switch(request){
            //File Bebas
            case 1:
                
                do {

                    System.out.println("File Bebas");
                    BorderLine.hr("=");
                    System.out.println("Silahkan berkreasi membuat file anda");
                    BorderLine.hr("=");
                    //Memasukan Driver Komputer C/D/E/etc
                    System.out.print("Masukan Drivers \t: ");
                    String drivers = input.nextLine();
                    
                    System.out.println("");
                    
                    //Memasukan nama File
                    System.out.print("Masukan Nama File \t: ");
                    String files = input.nextLine();
                    
                    BorderLine.hr("=");
                    
                    //Menyediakan format file
                    System.out.println("Format File tersedia :");
                    
                    String[] strArrFormat = new String[]{"txt","doc","html"};
                    
                    for(int h=0;h<strArrFormat.length; h++){
                        System.out.print(strArrFormat[h]+" | ");
                    }          
                    
                    BorderLine.hr("_");
                    
                    System.out.print("Masukan Format File \t: ");
                    String formats = format.nextLine();

                    FunFile Storages = new FunFile(drivers,files,formats);

                    Storages.print_File();
                    
                    System.out.println("Note : Ketik Iya Jika anda ingin membuat konten lagi");
                    System.out.println("Note : Ketik Tidak Jika anda ingin keluar");
                    System.out.print("=> ");
                } while (forRequest.next().equalsIgnoreCase("IYA"));
                
                forRequest.close();
            break;
            //Akhir File Bebas
            case 2:    
                
                final double created = 21042021;
                
                do{
                    System.out.println("Hi Iam Giovani \n this program was made on date" +created);
                
                    System.out.println("Note : Ketik Iya Jika anda ingin membuat konten lagi");
                    System.out.println("Note : Ketik Tidak Jika anda ingin keluar");
                    System.out.print("=> ");
                } while (forRequest.next().equalsIgnoreCase("IYA"));
                
                forRequest.close();
  
        
        
        }
    }
    
}
