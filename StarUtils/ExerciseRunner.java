public class ExerciseRunner {

    public static void main(String[] args) {
        CelestialObject celestialObject = new CelestialObject();
        CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
        CelestialObject earth1 = new CelestialObject("Terre", 1.1, 2.0, 2.0);
        CelestialObject celestialObject1 = new CelestialObject("Altair", 12.45, 328.8437, -328.3923);
        CelestialObject celestialObject2 = new CelestialObject("Altair", 12.45, 328.8437, -328.3923);
        CelestialObject celestialObject3 = new CelestialObject("Altair", 12.46, 328.8437, -328.3923);

        // System.out.println(earth.toString());
        // System.out.println(earth.equals(earth1));
        // System.out.println(earth.equals(celestialObject));

        // System.out.println("earth :" + earth.hashCode());
        // System.out.println("earth1 :" + earth1.hashCode());
        System.out.println("celestialObject1 :" + celestialObject1.hashCode());
        System.out.println("celestialObject3 :" + celestialObject3.hashCode());
        // System.out.println(celestialObject.hashCode());
    }
}