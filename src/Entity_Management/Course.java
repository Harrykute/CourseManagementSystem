package Entity_Management;

public class Course {
    static int count=0;
      private int courseId;
      private String title;

    private int duration;
     private String provider;

     private int fees;

      public Course(){

      }
    public Course(int courseId, String title, int duration, String provider, int fees) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
        this.provider = provider;
        this.fees = fees;
        count++;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void display(){
        System.out.println("Course_Id : "+courseId);
        System.out.println("Title : "+ title);
        System.out.println("Duration of Course : "+ duration);
        System.out.println("Provider of Course : "+ provider);
        System.out.println(" Fees of Course : "+ fees);
        System.out.println("Count of Course :"+count);
    }

}
