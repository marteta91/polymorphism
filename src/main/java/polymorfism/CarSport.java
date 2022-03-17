package polymorfism;

public class CarSport {

    public class CarSport extends Car {
        private int displacement;

        public CarSport (int displacement, String enrolment , String Mark, String Model){
            super(enrolment,Mark, Model);
            this.displacement = dispplacement;
        }

        public int getDisplacement() {
            return displacement;
        }

        public String viewdata(){
            return "enrolment: "+enrolment+ "Mark: "+Mark+ "MOdel: "+Model+ "displacement:"+displacement;
        }
    }
}
