package tw.da.model;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("houseService")
public class HouseService {
	@Autowired
	private HouseDao hDao;

	public House select(int houseid) throws SQLException {
		return hDao.select(houseid);
	}
}
