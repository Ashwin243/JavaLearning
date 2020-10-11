public class Dimensions {
    private int height;
    private int width;
    private int depth;

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double volumeOfThing(int height,int width, int depth) {
        this.height = getHeight();
        this.width = getWidth();
        this.depth = getDepth();
        double volume = Math.round(height * width * depth);
        return volume;
    }

    public double volumeOfThing() {
        this.height = getHeight();
        this.width = getWidth();
        this.depth = getDepth();
        double volume = Math.round(height * width * depth);
        return volume;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
