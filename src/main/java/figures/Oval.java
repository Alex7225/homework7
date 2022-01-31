package figures;

public class Oval extends Shape implements Scalable {
    private static String name = "Oval";

    public Oval() {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("name is: " + name);
        return name;
    }

    @Override
    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    @Override
    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }

    public void color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
