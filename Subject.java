package StudentApp;

public class Subject {
    private int SId;
    private String SName;
    private double SFees;

    public Subject(int SId, String SName, double SFees) {
        this.SId = SId;
        this.SName = SName;
        this.SFees = SFees;
    }

    public Subject()
    {

    }

    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public double getSFees() {
        return SFees;
    }

    public void setSFees(double SFees) {
        this.SFees = SFees;
    }
}
