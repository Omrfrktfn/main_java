package javaders.day43Lambda;

public class Course {
    /*
    pojo class :
    1-private variableler
    2-parametreli ve parametresiz constructorlar
    3-getter ve setter'lar
    4-toString methodu.
    barindiran class'lara POJO class denir.
    POJO : plain Old Java Object
     */

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course() {//default constructor hic bir sey secmeden olusturdugumuz constructor'dir

    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
