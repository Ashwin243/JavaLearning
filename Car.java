public class Car extends vehicle {
    private int doors;
    private int steering;
    private int gear;
    private int lights;
//    //private int seat;
//    private int seats=getSeat();
//private int wheels;
//    private int seat;
//    private int horn;
//    private int size;
//    private int brakes;
//    private String name;

    public Car(){
        super(4,5,1,20,1,"car");
    }

    public Car(int doors,int steering,int gear,int lights){
        super(4,5,1,20,1,"car");
        this.doors=doors;
        this.steering=steering;
        this.gear=gear;
        this.lights=lights;
    }

    public int getDoors() {
        return doors;
    }

    public int getSteering() {
        return steering;
    }

    public int getGear() {
        return gear;
    }

    public int getLights() {
        return lights;
    }
}
