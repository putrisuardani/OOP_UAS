package OOP_UAS;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    // sebagai objek untuk mengakses kelas Proses pada method yang terdapat pada kelas Main
    static Proses proses = new Proses();

    public static void menuTampil() {
        System.out.println("1. Room Type");
        System.out.println("2. Check In");
        System.out.println("3. Check Out");
        System.out.println("4. Show Guest List");
        System.out.println("5. Selesai");
    }

    public static int menuPilih() {
        System.out.print("Choose menu: ");
        int pilih = scan.nextInt();
        return pilih;
    }

    public static void main(String[] args) {
        Sambutan sambutan = new Sambutan("===========Oceanlux Hotel===========");
        sambutan.welcome();

        String lanjut = "y";

        do {
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
                    checkOut();
                    break;
                case 4:
                    showGuests();
                    break;
                case 5:
                    Welcome welcome = new Welcome("Terimakasih");
                    welcome.welcome("Terimakasih");
                    break;
                default:
                    System.out.println("\nPilihan anda tidak terdapat pada menu ");
                    break;
            }
            System.out.print("Apakah anda ingin lanjut ke pilihan menu awal? (y/n): ");
            lanjut = scan.next();
        } while (lanjut.equals("y"));
    }

    // Menampilkan tipe kamar
    public static void roomType() {
        try {
        String con = "y";
        System.out.print("Silahkan pilih room type (1: Standard, 2: Deluxe, 3: Suite): ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                showStandard();
                break;
            case 2:
                showDeluxe();
                break;
            case 3:
                showSuite();
                break;
            default:
            System.out.println("Pilihan anda tidak terdapat pada menu");
            break;
        } 
        System.out.println("Apakah anda ingin lanjut melihat tipe kamar lain? (y/n)");
        con = scan.next();
            if (con.equals("y")) {
            roomType();
            }else if(con.equals("n")){
                return ;
            }
            else{
                System.out.println("pilihan anda tidak terdapat dalam menu");
                roomType();
            }
        } catch (Exception e) {
            System.out.println("input anda tidak ada dalam sistem");
        }
    }

    public static void showStandard() {
        Tamu tamu = new Tamu();
        Standard standard = new Standard(tamu);
        standard.fasilitas();
        System.out.println("\n\n");
    }

    public static void showDeluxe() {
        Tamu tamu = new Tamu();
        Deluxe deluxe = new Deluxe(tamu);
        deluxe.fasilitas();
        System.out.println("");
        deluxe.Extras();
        System.out.println("\n\n");
    }

    public static void showSuite() {
        Tamu tamu = new Tamu();
        Suite suite = new Suite(tamu);
        suite.fasilitas();
        System.out.println("");
        suite.Extras();
    }

    public static void checkIn() {
        Tamu tamu = new Tamu();
        Standard standard = new Standard(tamu);
        Deluxe deluxe = new Deluxe(tamu);
        Suite suite = new Suite(tamu);

        System.out.println("Guest Id (wajib angka): ");
        tamu.setId(scan.next());

        System.out.println("Guest Name :");
        tamu.setNama(scan.next());

        System.out.println("Jenis Kamar (standard, deluxe, suite):");
        tamu.setJenKamar(scan.next());

        System.out.println("Jumlah Kamar :");
        tamu.setJumKamar(scan.nextInt());

        try{
            if (tamu.getJenKamar().equalsIgnoreCase("Standard")){
                standard.tampil();
                proses.addTamu(tamu);
            }else if (tamu.getJenKamar().equalsIgnoreCase("Deluxe")){
                deluxe.tampil();
                proses.addTamu(tamu);
            }else if (tamu.getJenKamar().equalsIgnoreCase("Suite")){
                suite.tampil();
                proses.addTamu(tamu);
            }else{
                System.out.println("Anda salah memasukkan tipe Kamar");
            }
        }catch (Exception e){
            System.out.println("Silahkan memasukkan data kembali");
        }
    }

    public static void checkOut() {
        System.out.println("Guest Id :");
        String guestId = scan.next(); 

        System.out.println("Guest Name :");
        String guestName = scan.next();

        proses.removeTamu(guestId , guestName);
    }

    private static void showGuests() {
        if (proses.guest.isEmpty()) {
            System.out.println("Tidak ada tamu");
        }else{
            for (Tamu tamu : proses.guest){
                System.out.print(tamu.getId() + ". " + tamu.getNama());
                System.out.println("||Jenis Kamar : " +tamu.getJenKamar()+ "||Jumlah Kamar :"+tamu.getJumKamar());
                System.out.println("");
                System.out.println("");
            }
        }
    }
}
