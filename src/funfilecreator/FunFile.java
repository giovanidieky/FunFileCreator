/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfilecreator;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FunFile {
    String Drivers, File, Format;
    
    FunFile(String Devices, String File, String Format){
        this.Drivers = Devices;
        this.File = File;
        this.Format = Format;
    }
    
    FunFile(){
        System.out.println("WoW");
    }
    
    public void print_File(){
        //Cetakan pengalamatan File
        String storage = Drivers+":\\"+File+"."+Format;
        
        //Peminimalisir error
        try {
            //Pengambilan data dari cetakan
            File file = new File(storage);
            
            //Pengkondisian input File baru
            boolean flag = file.createNewFile();
            if (flag) {
                System.out.println("File telah berhasil dibuat");
                
                System.out.println("File berada di " + storage);
                
                FileOutputStream fos = new FileOutputStream(storage, true);
                //Untuk Mode Penambahan
                Scanner fileContent = new Scanner(System.in);
                
                System.out.print("Masukan konten filet: ");
                String str = fileContent.nextLine() + "\n";
                //Variabel yang menyimpan data yang telah kita masukan
                byte[] b = str.getBytes(); //Mengubah string menjadi byte
                fos.write(b); //Menulis byte pada file 
                fos.close(); //Menutup file
                System.out.println("Konten telah disimpan pada tempat yang ditetapkan");
                

                
                try {
                    //Konstruksi file untuk menampilkan datanya 
                    File open = new File(storage);
                    if (!Desktop.isDesktopSupported())
                    //pengecekan suportifitas pada desktop  
                    {
                      System.out.println("Tidak mendukung");
                      return;
                    }
                    Desktop desktop = Desktop.getDesktop();
                        if (open.exists()){ //Mengecck data file masih ada atau tidak
                            desktop.open(open);
                        }//Membuka file yang spesifik
                }
                catch(Exception e) {
                  e.printStackTrace();
                }
                
            }
            else {
                System.out.println("File sudah ada di lokasi yang telah ditentukan");
            }
        }
        catch(IOException e) {
            System.out.println("Pengecualian :");
            e.printStackTrace();
        }
    }
}
