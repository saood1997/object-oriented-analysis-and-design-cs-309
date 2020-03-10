package pkg;

public class StudentController {
	
	private studentView view;
	private StudentModel model;
	
	public StudentController(studentView view, StudentModel model) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
	}
	
	public void controller() {
		view.showData(null);
		model.connection();
		while(true) {
			System.out.println("");
			if(view.flag) {
				view.flag1 = true;
				view.showData(model.search(view.sName));
				view.flag = false;
				view.flag1 = false;
			}
		}
		
	}

}
