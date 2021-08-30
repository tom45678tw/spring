package tw.da.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.da.model.TreeBean;

public class damoTreeBeanAction {

	public static void main(String[] args) {
     ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.config.xml");
                  TreeBean tree = con.getBean("tree",TreeBean.class);
                  System.out.println(tree.getName()+":"+tree.getAge());
                  con.close();
	}

}
