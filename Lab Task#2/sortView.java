
package lab.task;

import java.io.*; 
import java.util.Scanner;

public class sortView {

    public int vSetArray(){
	int val;
        Scanner s = new Scanner(System.in);
        val = s.nextInt();
	return val;
    }
    
    public int vInt(){
        System.out.println("Enter integer to Search in Array");
        int val;
        Scanner s = new Scanner(System.in);
        val = s.nextInt();
	return val;
    }
    
    public void printArrayDetails(int num[]){
	System.out.println("Array Detail");
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
  
}
