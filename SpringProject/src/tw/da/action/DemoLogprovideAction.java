package tw.da.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.util.logprovider;

public class DemoLogprovideAction {

	public static void main(String[] args) {
      ApplicationContext contex = new ClassPathXmlApplicationContext("beans.config.xml");
	
       logprovider Logprovider= (logprovider)contex.getBean("logProvider");
       Logprovider.log("step1");
	  ((ConfigurableApplicationContext)contex).close();
	}

}
