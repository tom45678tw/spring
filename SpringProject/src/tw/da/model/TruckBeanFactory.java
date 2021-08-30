package tw.da.model;

import java.util.HashMap;
import java.util.Map;

public class TruckBeanFactory {
  
	
	    private Map<Integer, TruchBean> map = new HashMap<Integer, TruchBean>();

		public void setMap(Map<Integer, TruchBean> map) {
			this.map = map;
		} 
	     
		public TruchBean getTruckBean(int id) {
			return map.get(id);
		}
		 
}
