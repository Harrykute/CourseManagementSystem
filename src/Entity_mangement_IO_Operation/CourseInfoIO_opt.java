package Entity_mangement_IO_Operation;

import java.io.*;
import java.util.Scanner;


public class CourseInfoIO_opt {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
      //  String filePath = "CourseInfoIO.txt";
        System.out.println("Enter the filePath to read : ");
        String filePath = sc.next();

        System.out.println("Enter the destination File : ");
        String destinationfile = sc.next();

       try(FileInputStream fin = new FileInputStream(filePath);
           BufferedInputStream bin = new BufferedInputStream(fin);

           FileOutputStream fout = new FileOutputStream(destinationfile,true);
           BufferedOutputStream bout = new BufferedOutputStream(fout))
       {

          //String Prefiledata;
           StringBuilder preFileData = new StringBuilder();


           while (true){
                int data = bin.read();
                if(data==-1){
                    break;}
                    char ch = (char)data;
                    preFileData.append(ch);
                }
                 String str = preFileData.toString();
                 byte[] DataFromfilepath = str.getBytes();

                 bout.write(DataFromfilepath);
               System.out.println("Data Succesfull transfer ");
       }
       catch (FileNotFoundException e){
           System.out.println("file Not fond with given name " + filePath);
       }
       catch (IOException e){
           e.printStackTrace();
       }

    }
}
