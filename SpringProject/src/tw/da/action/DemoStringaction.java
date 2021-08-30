package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoStringaction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
    String stro0=context.getBean("string0", String.class);
    System.out.println(stro0);
    
    String stro1=context.getBean("string1", String.class);
    System.out.println(stro1);
    String stro2=context.getBean("string2", String.class);
    System.out.println(stro2);
      context.close();
	}

}
