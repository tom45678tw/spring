package tw.da.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="roomService")
public class RoomService {
     @Autowired
	 private RoomDao roomDao;
	 
	 public void showDatails() {
		roomDao.showDatails();
	 }
}
