package OOP_UAS;

public class Sambutan extends Welcome {

    // pemanggilan constructor dari parent class
    public Sambutan(String sambut) {
        super(sambut);
    }

    @Override
    public void welcome() {
        System.out.println("===========Welcome To=========== ");
        System.out.println(super.sambut);
    }
}