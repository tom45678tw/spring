package tw.da.model;

public class workDao {
   private worker worker;
   
   public workDao (worker worker) {
	   this.worker=worker;
   }
   
   public void printResult() {
	   System.out.println(worker.getWorkerId()+":"+worker.getWorkerName());
   }
}
