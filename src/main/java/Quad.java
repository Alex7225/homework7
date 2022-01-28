class Quad extends Shape1 implements Scalable {
    private static String name = "Quad";

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
