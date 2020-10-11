public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cards;
    private String biosName;

    public Motherboard(String model, String manufacturer, int ramSlots, int cards, String biosName) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cards = cards;
        this.biosName = biosName;
    }


    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is loading at the moment...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCards() {
        return cards;
    }

    public String getBiosName() {
        return biosName;
    }
}
