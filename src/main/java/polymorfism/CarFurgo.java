package polymorfism;

public class CarFurgo {
    private int charge;

    public CarFurgo(int charge, String enrolment, String Mark, String Model) {
        super(enrolment, Mark, Model);
        this.charge = charge;
    }

    public int getCharge(){
        return charge;
    }
    @Override
    public String viewdata(){
        return "enrolment: "+enrolment+ "Mark: "+Mark+ "Model: "+Model+ "charge: "+charge;
    }
}
