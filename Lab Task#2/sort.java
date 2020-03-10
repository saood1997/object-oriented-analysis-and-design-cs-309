
package lab.task;

public class sort {
    int[] array = new int[10];
    private int count = 0;
	
    public void setArray(int val){
	array[count] = val;
        count++;
    }
    
    public void bubbleSort(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]){ 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    }
    
    public int SearchInt(int number){
        for(int i = 0;i<10;i++){
            if(array[i]==number){
                return 1;
            }
        }
        return 0;
      }
    
   
}
