package OOP_UAS;
import java.util.ArrayList;

public class Proses {
    public ArrayList<Kamar> standard = new ArrayList<Kamar>();
    public ArrayList<Kamar> deluxe = new ArrayList<Kamar>();
    public ArrayList<Kamar> suite = new ArrayList<Kamar>();
    public ArrayList<Tamu> guest = new ArrayList<Tamu>();

    public void addTamu(Tamu tamu){
        this.guest.add(tamu);
    }

    public void addStandard(Kamar kamar){
    try{
    
        if (standard.size() < 5) {
            standard.add(kamar);
        }
    
    }catch (Exception e){
        System.out.println("Sorry, the Standard Room has been sold out");
    }
    }

    public void addDeluxe(Kamar kamar){
    try{
    
        if (deluxe.size() < 5) {
            deluxe.add(kamar);
        }
    
    }catch (Exception e){
        System.out.println("Sorry, the Deluxe Room has been sold out");
    }
}

    public void addSuite(Kamar kamar){
        try{
    
        if (suite.size() < 5) {
            suite.add(kamar);
        }
    
    }catch (Exception e){
        System.out.println("Sorry, the Suite Room has been sold out");
    }
    }

    public void removeTamu(Tamu tamu){
        this.guest.remove(tamu);
    }

    public void removeStandard(Kamar kamar){
        this.standard.remove(kamar);
    }

    public void removeDeluxe(Kamar kamar){
        this.deluxe.remove(kamar);
    }

    public void removeSuite(Kamar kamar){
        this.suite.remove(kamar);
    }
}
