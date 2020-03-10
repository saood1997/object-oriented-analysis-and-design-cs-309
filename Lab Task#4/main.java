package pkg;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentView view = new studentView();
		StudentModel model = new StudentModel();
		StudentController control = new StudentController(view,model);
		control.controller();
	}
}
