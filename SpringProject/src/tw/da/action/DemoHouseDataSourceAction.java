package tw.da.action;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.House;
import tw.da.model.HouseService;

public class DemoHouseDataSourceAction {

	public static void main(String[] args) throws SQLException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
	   
		  HouseService h = context.getBean("houseService",HouseService.class);
		  House hB = h.select(1003);
		  System.out.println(hB.getHouseid()+":"+hB.getHousename());
		context.close();
	
	   
	}

}
