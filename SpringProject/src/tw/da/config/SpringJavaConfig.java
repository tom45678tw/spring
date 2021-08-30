package tw.da.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import tw.da.model.workDao;


 
@Configuration //beans.config.xml
public class SpringJavaConfig {
	
	   @Bean  //<bean id="worker" class="tw.leonchen.model.Worker"/>
		public tw.da.model.worker worker() {
			tw.da.model.worker worker = new tw.da.model.worker();
			worker.setWorkerId(001);
			worker.setWorkerName("tom");
			return worker;
		}
	   @Bean(value="wDao1") //呼叫只能用wDao1 就不能用workDao了
	   public workDao workerDao() {
		   workDao wDao = new workDao(worker());
		   return wDao;
	   }
	}

