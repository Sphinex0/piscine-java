
public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;

    static final double KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
        name = "Soleil";
    }

    public CelestialObject(String name1, double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
        name = name1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public void setX(double new_value) {
        x = new_value;
    }

    public void setY(double new_value) {
        y = new_value;
    }

    public void setZ(double new_value) {
        z = new_value;
    }

    public void setName(String new_value) {
        name = new_value;
    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        return Math.sqrt(Math.pow(obj2.x-obj1.x,2)+Math.pow(obj2.y-obj1.y,2)+Math.pow(obj2.z-obj1.z,2));

    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

}
