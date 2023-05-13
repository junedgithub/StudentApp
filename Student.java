package StudentApp;

public class Student {
    private int SRollNo;
    private String SName;
    private int SAge;

    private Subject s;

    public Student(int SRollNo, String SName, int SAge, Subject s) {
        this.SRollNo = SRollNo;
        this.SName = SName;
        this.SAge = SAge;
        this.s = s;
    }

    public Student()
    {

    }

    public Subject getS() {
        return s;
    }

    public void setS(Subject s) {
        this.s = s;
    }

    public int getSRollNo() {
        return SRollNo;
    }

    public void setSRollNo(int SRollNo) {
        this.SRollNo = SRollNo;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getSAge() {
        return SAge;
    }

    public void setSAge(int SAge) {
        this.SAge = SAge;
    }

    @Override
    public String toString() {
        return "SRollNo=" + SRollNo +
                ", SName='" + SName + '\'' +
                ", SAge=" + SAge +
                ", s=";
    }
}
