package pkj;

public class Controller {
	private view v1;
	private model m1;
	boolean flag;
	public Controller(model m1,view v1) {
		this.m1 = m1;
		this.v1 = v1;
	}
	public void setdata() {
		flag = m1.verify_email_address(v1.getdata());
		v1.show(flag);
	}
	
}