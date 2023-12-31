package Entity_Management;
import Entity_Management_Course_IO.CourseIO;
import Entity_Management_Exception.CourseCollection;
import Entity_Management_Exception.ProviderNotFoundException;
import courseMangement_IO_Serializetion.DeseralizationWithCourse;
import courseMangement_IO_Serializetion.SeralizationWithCourse;

import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class CourseMain {
    public static void main1(String[] args) {

        Course c1 = new Course();
        c1.setCourseId(1);
        c1.setTitle("Java Course ");
        c1.setDuration(20);
        c1.setProvider("Udemy");
        c1.setFees(389);


        System.out.println(" Using getter setter method for printing the o/p");
        System.out.println("Course_Id : " + c1.getCourseId());
        System.out.println("Title : " + c1.getTitle());
        System.out.println("Duration of Course : " + c1.getDuration());
        System.out.println("Provider of Course : " + c1.getProvider());
        System.out.println("Fees of Course : " + c1.getFees());

        System.out.println();
        System.out.println("Using Constructor Intialization ");
        Course c2 = new Course(2, "SAP", 35, "Coursera", 500);
        c2.display();

        Course c3 = new Course(3, "Hotel Mangement", 122, "Sppu", 5000);

        Course c4 = new Course(4, "C++", 32, "Edureka", 300);

        System.out.println("through Arraylist ");

       /* ArrayList<Course> lst=new ArrayList<Course>();
          lst.add(c1);
          lst.add(c2);
          lst.add(c3);
          lst.add(c4);

           //using For each loop
        System.out.println("Using For each loop ");
        for (Course cou: lst) {
            cou.display();
        }*/

         //using courseId auto generated
        Course c5 = new Course( "C++", 50, "Edureka", 300);

         c5.display();

        Course c6 = new Course( "Java", 30, "Edureka", 600);
         //c6.setTitle("lax");
         c6.display();


         Course[] courses = new Course[6];
         courses[0]=c1;
         courses[1]=c2;
         courses[2]=c3;
         courses[3]=c4;
         courses[4]=c5;
         courses[5]=c6;

          //using for loop to acces object
        System.out.println();
       /* System.out.println("using for to display each object ");
        for (int i = 0; i <courses.length ; i++) {
            courses[i].display();
            System.out.println();
        }*/

        System.out.println(" the duration of course having less than 40 hours duration below ");
        CourseProcessor.printShortDurationCourseNames(courses);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Courses size ");
        int sizeOb=sc.nextInt();
        Course[] courses2=new Course[sizeOb];

        for (int i = 0; i < courses2.length ; i++) {

            System.out.println("enter the course title " + (i+1) );
            String title = sc.next();
            System.out.println("Enter the duration of course "+ (i+1) );
            int duration=sc.nextInt();
            System.out.println("Enter the provider of Course " + (i+1) );
            String provider = sc.next();
            System.out.println("Enter the fees of course "+(i+1));
            int fees = sc.nextInt();
            courses2[i]=new Course(title,duration,provider,fees);
            System.out.println();

        }

        System.out.println("printing courses");
        for (Course lst:courses2) {
            lst.display();
            System.out.println();
        }

        System.out.println(" the average duration of all courses ");
        AvgDurationClass avgclsDuration= new AvgDurationClass();
        float AvgofDuration = avgclsDuration.doCalculation(courses2);
        System.out.println( " Avg = "+ AvgofDuration);

        System.out.println("The Average Fees of all courses ");
        AvgfeesClass avgclsFees = new AvgfeesClass();
        float Avgoffees = avgclsFees.doCalculation(courses2);
        System.out.println("Avg " + Avgoffees);

        CourseInfo courseInfo = new CourseInfo("Udemy",55);
        TotalCountMatch t =new TotalCountMatch();

        int count = (int) t.processCourseInfo(courses2,courseInfo);

       System.out.println("count of Match object " + count);

         AvgFeesMatchCheck avgMche = new AvgFeesMatchCheck();
          float avg= avgMche.processCourseInfo(courses2,courseInfo);
        System.out.println("Avg of Match object " + avg);


        CourseCollection.setAvailableCourses(courses2);
            try{
            System.out.println();
            System.out.println("Enter the Provider name to Match with All given Object");
            String ProviderName = sc.next();
            System.out.println("Printing Title Of Match Given Provider ");
            CourseCollection.printCourseNames(ProviderName);
        }
        catch (ProviderNotFoundException ex){
            System.out.println(ex);
        }

       /* System.out.println("Do You want Load Object Data Into txtFile");
        System.out.println("Enter the Yes or No !");
        String yes=sc.next();
         if(yes.equals("Yes")){
             CourseIO cio= new CourseIO();
             cio.setCourses(courses2);
             System.out.println("Enter the file Name");
             String filePath= sc.next();
             cio.createCourseDataFile(filePath);
         }
         else if(No.equals("No")){
             System.out.println("Thank You ! ");
         }
         else {
             System.out.println("Enter the Valid Yes And No !");
         }*/

        System.out.println("Enter the Destination File To Store entire object to File ");
        String fileName= sc.next();
        String destinationFie="./src/courseMangement_IO_Serializetion/"+fileName+".txt";
        SeralizationWithCourse.seralizeCourseObjectToFile(courses2,destinationFie);

        System.out.println("Enter the File name For Retrive ALl CourseData Object from File ");
        String TargetfileName= sc.next();
        String TargetdestinationFie="./src/courseMangement_IO_Serializetion/"+TargetfileName+".txt";
        DeseralizationWithCourse.deseralizeCourseObjectToFile(TargetdestinationFie);



    }
}
