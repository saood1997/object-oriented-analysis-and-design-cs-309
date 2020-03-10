package pkj;

public class Main {
	public static void main(String[] args) {
		view v1 = new view();
		model m1 = new model();
		Controller c1 = new Controller(m1,v1);
		c1.setdata();	
	}
}
