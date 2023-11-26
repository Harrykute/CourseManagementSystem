package courseMangement_IO_Serializetion;

import Entity_Management.Course;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeralizationWithCourse {


    public static void seralizeCourseObjectToFile(Course[] courses,String destinationFile){ // create method for seralize all courses into file

        // now we are using try resourses and Create object of FileOutputStream and ObjectOutput
        try(FileOutputStream fout = new FileOutputStream(destinationFile);
            ObjectOutputStream objOut= new ObjectOutputStream(fout)){

            objOut.writeObject(courses);

        }
        catch (FileNotFoundException e){
            System.out.println("file Not Found ");
        }
        catch (IOException e){
            System.out.println(e);
        }




    }


}
