package Entity_Management;

import java.util.ArrayList;

public class CourseMain {

    public static void main(String[] args) {

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
        Course c2 = new Course(2, "SAP", 3, "Coursera", 500);
        c2.display();

        Course c3 = new Course(3, "Hotel Mangement", 122, "Sppu", 5000);

        Course c4 = new Course(4, "C++", 3, "Edureka", 300);

        System.out.println("through Arraylist ");
        
        ArrayList<Course> lst=new ArrayList<Course>();
          lst.add(c1);
          lst.add(c2);
          lst.add(c3);
          lst.add(c4);

           //using For each loop
        /*System.out.println("Using For each loop ");
        for (Course cou: lst) {
            cou.display();
        }*/







    }
}
