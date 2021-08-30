package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.LoginDAO;
import tw.da.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {
           ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.config.xml");
	           LoginDAO loginDAO = Context.getBean("LoginDAO",LoginDAO.class);
	            boolean rs = loginDAO.checkLogin("john", "test213");
	            System.out.println(rs);
	            LoginService da = Context.getBean("LoginService1",LoginService.class);
	           boolean ck = da.checkLogin("mary", "123test");
	           System.out.println(ck);
	           
	           LoginService b = Context.getBean("LoginService2",LoginService.class);
	           boolean b1 = b.checkLogin("john", "text132");
	           System.out.println(b1);
	           Context.close();
	            
	}

}
