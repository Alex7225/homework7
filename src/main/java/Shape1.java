abstract class Shape1 {
    public String name;
    int r, g, b;
    int x, y, z;

    String getName() {
        System.out.println("name is: " + name);
        return null;
    }

    Shape1(String name) {
        this.name = name;
    }

    Shape1() {
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
