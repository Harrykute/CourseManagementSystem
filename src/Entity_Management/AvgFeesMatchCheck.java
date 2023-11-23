package Entity_Management;

public class AvgFeesMatchCheck implements CourseInfoProcessor{


    @Override
    public float processCourseInfo(Course[] courses, CourseInfo courseInfo) {

       /*int total=0;
       int count=0;

        for (int i = 0; i <courses.length ; i++) {
            CourseInfo info = new CourseInfo(courses[i].getProvider(),courses[i].getDuration());
            if(courseInfo.equals(info)){
                total=total + courses[i].getFees();
                 count++;

            }
        }*/


        int total=0;
        int count=0;
        for (int i = 0; i <courses.length ; i++) {
            if((courses[i].getProvider().equals(courseInfo.getProviderName())) && (courses[i].getDuration() == courseInfo.getDuration())){

                total=total + courses[i].getFees();
                count++ ;
            }
        }

        float avg= (float) total/count;

        return avg;
    }
}
