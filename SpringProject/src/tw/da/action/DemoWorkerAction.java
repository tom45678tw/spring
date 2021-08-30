package tw.da.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tw.da.config.SpringJavaConfig;
import tw.da.model.workDao;
import tw.da.model.worker;

public class DemoWorkerAction {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
	     worker worker = context.getBean("worker",worker.class);
	     System.out.println(worker.getWorkerId()+":"+worker.getWorkerName());
		
	      workDao wDao1 = context.getBean("wDao1",workDao.class);
	       wDao1.printResult();
	     context.close();
	}

}
