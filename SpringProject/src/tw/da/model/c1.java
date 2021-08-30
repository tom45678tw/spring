package tw.da.model;

public class c1 {

	
	 private LoginDAO logindao; //這裡第一個字不刑大寫
	   private int num;
	   
	


	public LoginDAO getLogindao() {
		return logindao;
	}

	public void setLogindao(LoginDAO logindao) {
		this.logindao = logindao;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void cc1(int num) {

		this.num = num;
	}

	public c1(LoginDAO logindao) {
		this.logindao=logindao;
			
		}

	public boolean checkLogin(String user,String pwd) {
		 return logindao.checkLogin(user, pwd);
	 }


	
}
