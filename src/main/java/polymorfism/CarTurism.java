package polymorfism;

public class CarTurism {

    public class CarTurism extends Car {

        private int Doors;

        public CarTurism (int Doors, String enrolment, String Mark, String Model) {
            super(enrolment, Mark, Model);
            this.Doors = Doors;
        }

        public int getDoors() {
            return Doors;
        }

        @Override
        public String viewdata() {
            return "enrolment: "+enrolment+ "Mark: "+Mark+ "Model: "+Model+ "Number od doors: "+Doors;
        }
    }
}
