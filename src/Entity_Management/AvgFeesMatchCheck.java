package Entity_Management;

public class AvgFeesMatchCheck implements CourseInfoProcessor{


    @Override
    public float processCourseInfo(Course[] courses, CourseInfo courseInfo) {

       int total=0;
       int count=0;
        for (int i = 0; i <courses.length ; i++) {
            if((courses[i].getProvider().equals(courseInfo.getProviderName())) && (courses[i].getDuration() == courseInfo.getDuration())){

                total=total + courses[i].getFees();
                 count++ ;
            }
        }

       /* for (Course lst: courses) {
            CourseInfo info = new CourseInfo(lst.getProvider(),lst.getDuration());
             if(courseInfo. ){

             }
        }*/

        float avg= total/count;

        return avg;
    }
}
