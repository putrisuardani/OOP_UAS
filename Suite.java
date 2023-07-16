package OOP_UAS;

public class Suite extends Additional implements Pilihan {
    private Tamu guest;
    private Kamar room;

    public Suite(Tamu guest) {
        this.guest = guest;
    }

    public Suite(Kamar room) {
        this.room = room;
    }

    @Override
    public void fasilitas() {
        System.out.println("Fasilitas   :");
        System.out.println("1. Room Size 29 sqm ");
        System.out.println("2. King Bed or Twin Beds");
        System.out.println("3. Balcony with Beach View");
        System.out.println("4. Free 2 packs of Breakfast");
        System.out.println("5. Bathtub in the Balcony with Cold and Hot Running Water");

    }

    @Override
    public double harga() {
        return 1000000*room.getJumKamar();
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

    @Override
    public void Extras() {
        System.out.println("Extra Facility :");
        System.out.println("1. Free access spa for two persons");
        System.out.println("2. Free access for an hour play at arcade zone");
        System.out.println("3. Free 2 Softdrinks at Pool Bar");
        System.out.println("4. Free access at movie theater for two persons");
        System.out.println("5. Free 2 packs of lunch");
    }
}