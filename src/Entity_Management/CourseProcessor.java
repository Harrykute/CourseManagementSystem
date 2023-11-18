package Entity_Management;

public class CourseProcessor {
     public static void printShortDurationCourseNames(Course[] courses){

          for (int i = 0; i <courses.length ; i++) {

               if(courses[i].getDuration()<40){
                    System.out.println(courses[i].getTitle());
               }
          }

     }
}
