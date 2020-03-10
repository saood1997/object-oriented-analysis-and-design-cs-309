
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.*; 
import java.lang.*;

public class task
{
    public static void main(String[] args) throws IOException 
    { 
        char c;
        int index,index1,ch;
        String first,second,third,str,str1;
        int size = 0;
        int countLine = 0;
        int countIndex = 7;
        String array[];
        int found[];
        String st = "";
        String stri = "";
        boolean sqFound;
        FileReader fr=null;
        try
        {
            fr = new FileReader("test.txt"); 
        }
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        }
        // read from FileReader till the end of file 
        array = new String[26];
        found = new int[countIndex];
        while ((ch=fr.read())!=-1){
            if ((char)ch != '\n'){
                st += (char)ch;
            }
            else{
                array[countLine] = st;
                countLine += 1;
                st = "";
            }
        }
        //Finding the index of lines which contains "f8"
        for(int i = 0;i<countLine;i++){ 
            sqFound = array[i].contains("f8");
            if(sqFound==true){
                found[size]=i;
                size += 1;
            }
        }
        //initilizing a String with zero's of length equal to on line.
        for (int j = 0;j<array.length;j++) {
                    stri += 0;
        }

        //Replacing the String with zero's which contains "f8" using indexes.
        for(int i=0;i<countIndex;i++){
            if(i!=countIndex-1){
                if(found[i+1]-found[i]>1){
                    if(found[i+1]-found[i]<countLine){
                        index = found[i];
                        array[index-1]=stri;
                        array[index]=stri;
                        array[index+1]=stri;
                    }
                }
                else if (found[i+1]-found[i]<=1){
                    index = found[i];
                    index1 = found[i+1];
                    array[index-1]=stri;
                    array[index]=stri;
                    array[index+1]=stri;
                    array[index1+1]=stri;
                }
            }
            else if (i == countIndex-1) {
                if(found[i]-found[i-1]>1){
                    index = found[i];
                    array[index-1]=stri;
                    array[index]=stri;
                    array[index+1]=stri;
                }
                else if (found[i]-found[i-1]<=1){
                    index = found[i-1];
                    index1 = found[i];
                    array[index-1]=stri;
                    array[index]=stri;
                    array[index+1]=stri;
            }
            }
            
        }
        fr.close();

        //writing the array in output.txt file which cantains zero's.
        try 
        {
            FileWriter fw=new FileWriter("/home/saood/Desktop/output.txt");
            for (int j=0;j<countLine;j++){
                str1 = array[j];
                fw.write(str1);
                fw.write('\n');
            }
        fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("File Created Sucessfully");
    }
        
} 