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
				
		context.close();
	} 

}
