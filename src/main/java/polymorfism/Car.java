package polymorfism;

public class Car {
    protected String enrolment;
    protected String Mark;
    protected String Model;

    public Car(String enrolment, String Mark, String model) {
        this.enrolment = enrolment;
        this.Mark = Mark;
        this.Model = Model;
    }

    public String getEnrolment(){
        return enrolment;
    }

    public String getMark(){
        return Mark;
    }

    public String getModel() {
        return Model;
    }
    public String viewdata() {
        return "enrolment: "+enrolment+ "Mark: "+Mark+ "MOdel: "+Model;
    }
}
