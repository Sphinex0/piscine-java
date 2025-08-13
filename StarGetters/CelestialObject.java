
public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;

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


}
