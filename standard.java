package OOP_UAS;

public class Standard implements Pilihan {
    private Tamu guest;
    private Kamar room;

    public Standard(Tamu guest) {
        this.guest = guest;
    }

    public Standard(Kamar room) {
        this.room = room;
    }

    @Override
    public void fasilitas() {
        System.out.println("Fasilitas   :");
        System.out.println("1. Room Size 29 sqm ");
        System.out.println("2. Queen Bed or Twin Beds");
        System.out.println("3. Balcony with Garden View");
        System.out.println("4. Free 2 packs of Breakfast");
        System.out.println("5. Bathtub in the Bathroom with Cold and Hot Running Water");
    }

    @Override
    public double harga() {
        return 500000*room.getJumKamar();
    }

    @Override
    public void tampil() {
        System.out.println("===================================================================");
        System.out.println("-------------------------Oceanlux Resort---------------------------");
        System.out.println("===================================================================");
        System.out.println("Guest Name      : " + guest.getNama());
        System.out.println("Jumlah Tamu     : " + guest.getjumlahTamu());
        System.out.println("Jenis Kamar     : " +room.getJenKamar());
        System.out.println("Jumlah Kamar    : " +room.getJumKamar());
        System.out.println("Total Harga     : "+harga());
    }
}