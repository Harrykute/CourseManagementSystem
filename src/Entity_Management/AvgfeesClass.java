package Entity_Management;

public class AvgfeesClass extends CourseDataCalculator{

    @Override
    public float doCalculation(Course[] allCourses) {
        int totalfees =0;

        for (int i = 0; i <allCourses.length ; i++) {

            totalfees = totalfees + allCourses[i].getFees();
        }
        float  avgOfFees= totalfees/ allCourses.length;
        return avgOfFees;

    }
}
