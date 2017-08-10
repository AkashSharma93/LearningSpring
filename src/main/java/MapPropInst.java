import java.util.Map;
import java.util.Properties;

/**
 * Created by akash on 10/08/17.
 */
public class MapPropInst {
    private Map<String, Guitar> map;
    private Properties prop;

    public void setMap(Map<String, Guitar> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public void print() {
        for (String key: map.keySet()) System.out.println(key + " " + map.get(key));
        for (Object key: prop.keySet()) System.out.println(key + " " + prop.getProperty((String) key));
    }
}
