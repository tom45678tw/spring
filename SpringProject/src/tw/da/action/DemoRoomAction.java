package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.Room;
import tw.da.model.RoomService;

public class DemoRoomAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
                   
		Room room1 = context.getBean("room2",Room.class);
		  room1.setId(1002);
		  room1.setName("Hello");
		  room1.setSize("small");
		RoomService room = context.getBean("roomService",RoomService.class);
	          room.showDatails();
	          context.close();
	}

}
