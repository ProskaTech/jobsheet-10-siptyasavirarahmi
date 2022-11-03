/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * Created By_Siptya Savira Rahmi_21343015
 */
public class Manusia {
 String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukan tempat lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukan tanggal lahir\t: ");
        tgl_lahir = input.nextLine();
        System.out.print("Masukan berat badan\t: ");
        berat_badan = input.nextInt();
        System.out.print("Masukan tinggi badan\t: ");
        tinggi_badan = input.nextInt();
    }
    
    public void identitas(){
        System.out.println("Nama saya \t: " + nama);
        System.out.println("Tempat lahir \t: " + tempat_lahir);
        System.out.println("Tanggal lahir \t: " + tgl_lahir);
        System.out.println("Berat badan \t: " + berat_badan + " kg");
        System.out.println("Tinggi badan \t: " + tinggi_badan + " cm");
    }
    
    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}
    

