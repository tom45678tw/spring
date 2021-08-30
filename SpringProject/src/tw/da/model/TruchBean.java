package tw.da.model;

public class TruchBean {
 private int id;
 private String breand;
 
	public TruchBean() {
	}
	public TruchBean(int id,String breand) {
		this.id=id;
		this.breand=breand;
	}
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getBreand() {
		return breand;
	}
	public void setBreand(String breand) {
		this.breand = breand;
	}

}
