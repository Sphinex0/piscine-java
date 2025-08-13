import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }

    public Map<String, Double> computeMassRepartition() {
        Map<String, Double> res = new HashMap<>();
        res.put("Star", 0.);
        res.put("Planet", 0.);
        res.put("Other", 0.);
        for (CelestialObject obj : celestialObjects) {

        }
        return new HashMap<>();
    }

}
