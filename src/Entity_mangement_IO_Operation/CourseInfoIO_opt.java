package Entity_mangement_IO_Operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class CourseInfoIO_opt {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
      //  String filePath = "CourseInfoIO.txt";
        System.out.println("Enter the filePath to read : ");
        String filePath = sc.next();

        System.out.println("Enter the destination File : ");
        String destinationfile = sc.next();

       try(FileInputStream fin = new FileInputStream(filePath); FileOutputStream fout = new FileOutputStream(destinationfile)) {

           String Prefiledata;
           while (true){
                int data = fin.read();
                if(data==-1){
                    break;
                }
                char ch = (char)data;
                 Prefiledata = String.valueOf(ch);
                 byte[] DataFromfilepath = Prefiledata.getBytes();
                 fout.write(DataFromfilepath);
               System.out.println("Data Succesfull transfer ");

            }
       }
       catch (FileNotFoundException e){
           System.out.println("file Not fond with given name " + filePath);
       }
       catch (IOException e){
           e.printStackTrace();
       }

    }



}
