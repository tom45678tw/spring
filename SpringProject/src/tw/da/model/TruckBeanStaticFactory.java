package tw.da.model;

import java.util.HashMap;
import java.util.Map;

public class TruckBeanStaticFactory {
    private static Map<Integer, TruchBean> map = new HashMap<Integer, TruchBean>();
    
    //static block 
    static {
    	map.put(1, new TruchBean(3,"ford"));
    	map.put(2, new TruchBean(4,"nissan"));
    }
    
    public static TruchBean getTruckBean(int id) {
    	return map.get(id);
    }
}
