package OOP_UAS;

public class Standard implements Pilihan {
    // variable instance untuk menampung semua objek pada kelas Tamu
    private Tamu guest;

    // constructor standard fungsinya untuk menginisialisasi nilai dari variabel guest 
    public Standard(Tamu guest) {
        this.guest = guest;
    }

    @Override
    public void fasilitas() {
        System.out.println("==============================================================");
        System.out.println("STANDARD ROOM");
        System.out.println("==============================================================");
        System.out.println("Fasilitas   :");
        System.out.println("1. Room Size 29 sqm ");
        System.out.println("2. Queen Bed or Twin Beds");
        System.out.println("3. Balcony with Garden View");
        System.out.println("4. Free 2 packs of Breakfast");
        System.out.println("5. Bathtub in the Bathroom with Cold and Hot Running Water");
        System.out.println("Price : Rp.500,000.00");
    }

    @Override
    public double harga() {
        return 500000*guest.getJumKamar();
    }

    @Override
    public void tampil() {
        System.out.println("===================================================================");
        System.out.println("-------------------------Oceanlux Resort---------------------------");
        System.out.println("===================================================================");
        System.out.println("Guest Id        : " +guest.getId());
        System.out.println("Guest Name      : " +guest.getNama());
        System.out.println("Jenis Kamar     : " +guest.getJenKamar());
        System.out.println("Jumlah Kamar    : " +guest.getJumKamar());
        System.out.println("Total Harga     : "+harga());
    }
}