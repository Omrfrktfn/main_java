package introduction.OkulYonetim;

public class Student extends Person{

    private String scholNum;

    private String classes;

    public Student(String nameSurname, String tcNum, int age, String scholNum, String classes) {
        super(nameSurname, tcNum, age);
        this.scholNum = scholNum;
        this.classes = classes;
    }

    public String getScholNum() {
        return scholNum;
    }

    public void setScholNum(String scholNum) {
        this.scholNum = scholNum;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
