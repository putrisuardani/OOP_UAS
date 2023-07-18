package OOP_UAS;
import java.util.ArrayList;

public class Proses {
    public ArrayList<Tamu> guest = new ArrayList<Tamu>();
    // menyimpan daftar objek Tamu
    
    // memeriksa keberadaan Guest Id
    public boolean isGuestIdExist(String id){
        boolean isExist = false;
        for (Tamu tamu : this.guest){
            if(tamu.getId().equals(id)){
                System.out.println("Guest Id telah digunakan");
                isExist = true;
            }
        }
        return isExist;
    }

    // menambahkan tamu ke arrayList
    public void addTamu(Tamu tamu){
        if(!isGuestIdExist(tamu.getId())){
            this.guest.add(tamu);
            System.out.println("Tamu berhasil Check In");
        }else{
            System.out.println("Silahkan pilih menu no 2 dan lakukan pengisian kembali ");
        }
    }

    // Memeriksa apakah tamu terdapat di dalam sistem hotel
    private Tamu getTamuId(String guestId){
        try{
        for(Tamu tamu : this.guest){
            if(tamu.getId().equals(guestId)){
            return tamu;
            }
        }
        }catch (Exception e){
            System.out.println("Sorry, the guest is not in house");
        }
        return null;
    }

    //Memeriksa apakah tamu terdapat di dalam sistem hotel
    private Tamu getNamaTamu(String guestName){
        try{
        for(Tamu tamu : this.guest){
            if(tamu.getId().equals(guestName)){
            return tamu;
            }
        }
        }catch (Exception e){
            System.out.println("Sorry, the guest is not in house");
        }
        return null;
    }

    // menghapus data tamu dari arrayList apabila Check Out
    public void removeTamu(String guestId, String guestName){
        Tamu tamuId = this.getTamuId(guestId);
        Tamu tamuNama = this.getNamaTamu(guestName);
        if (tamuId == null || tamuNama == null) {
            System.out.println("Guest Id atau nama tamu salah");
        } else {
            this.guest.remove(tamuId);
            System.out.println("Tamu berhasil Check Out");
        }
    }
}
