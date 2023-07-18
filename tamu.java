package OOP_UAS;

public class Tamu {
    // encapsulation
    private String Nama;
    private String Id;
    private String JenKamar;
    private double JumKamar;


  // setter and getter
  public void setNama(String Nama){
    this.Nama = Nama;
  }

  public String getNama(){
    return Nama;
  }

  public void setId(String Id){
    this.Id = Id;
  }

  public String getId(){
    return Id;
  }
  
  public void setJenKamar(String JenKamar){
    this.JenKamar = JenKamar;
  }

  public String getJenKamar(){
    return JenKamar;
  }

  public void setJumKamar(double JumKamar){
    this.JumKamar = JumKamar;
  }

  public double getJumKamar(){
    return JumKamar;
  }
}
