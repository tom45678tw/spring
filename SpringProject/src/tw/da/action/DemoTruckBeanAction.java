package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.TruchBean;
import tw.da.model.TruckBeanFactory;

public class DemoTruckBeanAction {
 
	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
	TruchBean f = context.getBean("fordTruck",TruchBean.class);
	System.out.println(f.getId()+" "+f.getBreand());
	 
	TruchBean f2 = context.getBean("nissanTruck",TruchBean.class);
	System.out.println(f2.getId()+" "+f2.getBreand());
	
	TruchBean su = context.getBean("subaruTruck",TruchBean.class);
	System.out.println(su.getId()+":"+su.getBreand());
	
	TruchBean su2 = context.getBean("ferrariTruck",TruchBean.class);
	System.out.println(su2.getId()+":"+su2.getBreand());
	
	TruchBean s1 = context.getBean("ss1",TruchBean.class);
	 System.out.println(s1.getId()+":"+s1.getBreand());
	}

}
