package OOP_UAS;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Proses proses = new Proses();

    public static void menuTampil(){
        System.out.println("===========Oceanlux Hotel===========");
        System.out.println("1. Room Type");
        System.out.println("2. Check In");
        System.out.println("3. CHeck Out");
    }
        
        public static int menuPilih(){
        System.out.print("choose menu : ");
        int pilih = scan.nextInt();
        return pilih;
        }
        public static void main(String[] args){
            String lanjut = "y";

            do{
                menuTampil();
                int pilih = menuPilih();
                switch (pilih) {
                case 1:
                    roomType();
                break;   
                case 2:
                    checkIn();
                break;   
                case 3:
                    checkout();
                break;
                default:
                    System.out.println("Pilihan anda tidak terdapat pada menu");
                break;
                }
            }
        }
}