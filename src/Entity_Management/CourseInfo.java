package Entity_Management;

import java.util.Objects;

public class CourseInfo {


    private String ProviderName;
    private int Duration;

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String providerName) {
        ProviderName = providerName;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public CourseInfo(String providerName, int duration) {
        ProviderName = providerName;
        Duration = duration;
    }

    public CourseInfo() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseInfo that = (CourseInfo) o;
        return Duration == that.Duration && Objects.equals(ProviderName, that.ProviderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProviderName, Duration);
    }
}
