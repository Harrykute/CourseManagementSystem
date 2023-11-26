package Entity_Management_Course_IO;

import Entity_Management.Course;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CourseIO {
     private Course[] courses;
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public  void createCourseDataFile(String destinationFile){

       try(FileOutputStream fout = new FileOutputStream(destinationFile,true) ;
           BufferedOutputStream bout =new BufferedOutputStream(fout)){

           StringBuilder courseFileData = new StringBuilder();

           for (Course course:courses) {
              String str = course.toString();
              courseFileData.append(str+"\n");
           }
              String data = courseFileData.toString();

              byte[] DataFromObject = data.getBytes();

           bout.write(DataFromObject);
           System.out.println("Data Succesfull transfer ");
       }
       catch (Exception e){
           System.out.println();
       }
    }

    }
 /*class ABC {
    public static void main(String[] args) {

        Course c2 = new Course(1, "SAP", 35, "Coursera", 500);
        Course c3 = new Course(2, "Java", 55, "Udemy", 500);

        Course[] courses = new Course[2];
        courses[0] = c2;
        courses[1] = c3;


        CourseIO cio = new CourseIO();
        cio.setCourses(courses);

        String filePath="DataObject.txt";
        cio.createCourseDataFile(filePath);

        System.out.println("Data added");
    }
  }*/


