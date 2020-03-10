
package lab.task;

import java.io.*; 
import java.util.Scanner;

public class LabTask {
    
    public static void main(String[] args) {
	sort model = new sort();
        sortView view = new sortView();
	sortController controller = new sortController(model, view);
        System.out.println("1 : For to Enter Array and Print Array");
        System.out.println("2 : For to Enter Array and Sort Array");
        System.out.println("3 : For to Enter Array and Search Integer in Array");
        int val;
        Scanner s = new Scanner(System.in);
        val = s.nextInt();
        if(val == 1){
            controller.setArrayDetails();
            controller.updateView();
        }
        if(val == 2){
            controller.sortArray();
        }
        
        
        if(val == 3){
            controller.searchInt();
        }
        
    }
    
}
