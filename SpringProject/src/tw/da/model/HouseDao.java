package tw.da.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("houseDao")
public class HouseDao {
    @Autowired
	private DataSource dataSource=null;
    
    public House select(int houseId) throws SQLException {
    	Connection conn = dataSource.getConnection();
    	String sql="select * from House where houseid=?";
    	PreparedStatement stmt = conn.prepareStatement(sql);
    	stmt.setInt(1, houseId);
    	ResultSet rs = stmt.executeQuery();
    	House hBean=null;
    	if(rs.next()) {
    		hBean=new House();
    		hBean.setHouseid(rs.getInt(1));
    		hBean.setHousename(rs.getString(2));
    	}
    	    rs.close();
    		stmt.close();
    		conn.close();
    		return hBean;
    	 	
    }
}
