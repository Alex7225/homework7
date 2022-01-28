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
}
