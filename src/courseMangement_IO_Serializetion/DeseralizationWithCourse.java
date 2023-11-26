package courseMangement_IO_Serializetion;

import Entity_Management.Course;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeseralizationWithCourse {

     public static void deseralizeCourseObjectToFile(String destinationFile){

         try(FileInputStream fin = new FileInputStream(destinationFile);
             ObjectInputStream objIn= new ObjectInputStream(fin)){

             Course[] echObj = (Course[]) objIn.readObject();

             for (Course elementObj:echObj) {
                 System.out.println(elementObj);
             }

         }
         catch (Exception e){
             System.out.println(e);
         }


     }
}
