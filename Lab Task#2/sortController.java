package lab.task;

public class sortController {
    private sort model;
    private sortView view;
    int num;
	
    public sortController(sort model, sortView view){
	this.model = model;
	this.view = view;
    }
	
    public void setArrayDetails(){
        System.out.println("Enter an integer's");
        for(int i = 0;i<10;i++){
            model.setArray(view.vSetArray());
        }
    }
	
    public void updateView(){
        view.printArrayDetails(model.array);
    }
    
    public void sortArray(){
        System.out.println("Enter an integer's");
        for(int i = 0;i<10;i++){
            model.setArray(view.vSetArray());
        }
        model.bubbleSort(model.array);
        System.out.println("Sort Array : ");
        view.printArrayDetails(model.array);
    }
    
    public void searchInt(){
        System.out.println("Enter an integer's");
        for(int i = 0;i<10;i++){
            model.setArray(view.vSetArray());
        }
      
        int searchInt = model.SearchInt(view.vInt());
        
        if (searchInt == 1){
            System.out.println("Integer is present in a Array");
        }
        else if(searchInt == 0){
            System.out.println("Integer is not present in a Array");
        }
    }
}
