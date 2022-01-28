class Quad extends Shape1 implements Scalable {
    private static String name = "Quad";

    @Override
    public String getName() {
        System.out.println("name is: " + name);
        return name;
    }

    @Override
    public void zoomIn() {

    }

    @Override
    public void zoomOut() {

    }
}
