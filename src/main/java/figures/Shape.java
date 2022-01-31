package figures;

public abstract class Shape {
    private String name;
    protected int r, g, b;
    protected int x, y, z;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

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