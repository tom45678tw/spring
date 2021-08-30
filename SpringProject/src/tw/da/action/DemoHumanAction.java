package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.Human;

public class DemoHumanAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		  Human human = context.getBean("human1", Human.class);
		System.out.println(human.getName() + ":" + human.getAge()); 
		
		 Human human2 = context.getBean("human2", Human.class);
			System.out.println(human2.getName() + ":" + human2.getAge()); 
			
			 Human human3 = context.getBean("human3", Human.class);
			
			 System.out.println(human3.getName() + ":" + human3.getAge()); 
				
           Human h = new Human();	
			h.setName("ss");
			h.setAge(18);
			System.out.println(h.getName()+h.getAge());
			
			
		Human c3 = context.getBean("hu",Human.class);
				
		System.out.println(c3.getName()+":"+c3.getAge());
		
		
		Human s1 = context.getBean("s1",Human.class);
		System.out.println(s1.getName()+":"+s1.getAge());
		context.close();
	} 

}
