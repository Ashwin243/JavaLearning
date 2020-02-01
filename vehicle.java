public class vehicle {
    private int wheels;
    private int seat;
    private int horn;
    private int size;
    private int brakes;
    private String name;

    public vehicle(){
        this(5,0,0,0,0,"Default vehicle");
    }
    public vehicle(int wheels){
        this(wheels,0,0,0,0,"Default vehicle");
    }
    public vehicle(int wheels,int size,String name){
        this(wheels,0,0,size,0,name);
    }
 public vehicle(int wheels,int seat,int horn,int size,int brakes,String name){
     this.wheels=wheels;
     this.seat=seat;
     this.horn=horn;
     this.size=size;
     this.brakes=brakes;
     this.name=name;
 }

 public void getSpeed(){
     System.out.println("Speed of vehicle = "+(getWheels()*10));
 }

    public int getWheels() {
        return wheels;
    }

    public int getSeat() {
        return seat;
    }

    public int getHorn() {
        return horn;
    }

    public int getSize() {
        return size;
    }

    public int getBrakes() {
        return brakes;
    }

    public String getName() {
        return name;
    }
}
