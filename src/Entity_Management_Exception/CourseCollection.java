package Entity_Management_Exception;

import Entity_Management.Course;

public class CourseCollection {

    private static Course[] availableCourses ;


    public static void setAvailableCourses(Course[] availableCourses) {
        CourseCollection.availableCourses = availableCourses;

    }

    static {

        //availableCourses[0] = new Course("Java",500,"Udemy",500);
    }

    public static void printCourseNames(String provider) throws ProviderNotFoundException {

         int position=-1;
         int size = availableCourses.length;

        for (int i = 0; i <size ; i++) {
            String CourseProvider = availableCourses[i].getProvider();
            if(CourseProvider.equals(provider)){
                position = i;
                System.out.println(availableCourses[i].getTitle());
            }
        }
        if(position == -1){
            String error = "The entered Provider is Invalid , Try to put valid Provider";
            ProviderNotFoundException pnfe= new ProviderNotFoundException(error,provider);
            throw pnfe;
        }


    }






}
