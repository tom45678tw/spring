package tw.da.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
               
@Repository(value="roomDao") //Setter DI <bean id=roomDao class="tw.da.RoomDao">
public class RoomDao {
//     @Autowired @Qualifier("room")   //@第一招
	 private Room room;
	 
     public RoomDao() {           //以下兩個 RoomDao() 是第二招 Cunstructor DI
    	 
     }
     
     public RoomDao(@Qualifier("room") Room room) {
    	 this.room=room;
     }
	 public void showDatails() {
		 System.out.println(room.getId()+":"+room.getName()+":"+room.getSize());
	 }
}
