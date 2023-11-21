package Entity_Management;

public class AvgDurationClass extends CourseDataCalculator{
    @Override
    public  float doCalculation(Course[] allCourses) {

        int totalduration =0;

        for (int i = 0; i <allCourses.length ; i++) {

            totalduration = totalduration + allCourses[i].getDuration();

        }
        float  avgOfduration= totalduration/ allCourses.length;
        return avgOfduration;
    }
}
