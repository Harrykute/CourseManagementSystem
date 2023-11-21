package Entity_Management;

public class TotalCountMatch implements CourseInfoProcessor{


    @Override
    public float processCourseInfo(Course[] courses, CourseInfo courseInfo) {


        float count=0;
        for (int i = 0; i <courses.length ; i++) {
            if((courses[i].getProvider().equals(courseInfo.getProviderName())) && (courses[i].getDuration() == courseInfo.getDuration())){
                count ++;
            }
        }

        return count;
    }
}
