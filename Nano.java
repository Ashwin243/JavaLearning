public class Nano extends Car {
    private int roadServiceMonths;

    public Nano(int roadServiceMonths) {
        super("Nano", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
