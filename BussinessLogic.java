package StudentApp;

import jdk.nashorn.internal.runtime.ScriptRuntime;

import java.util.ArrayList;
import java.util.List;

public class BussinessLogic {
   public static List<Student> students = new ArrayList<>();
    public void addStudent(int sRollNo,String sName,int sAge,Subject sub){
        Student s = new Student();
        s.setSRollNo(sRollNo);
        s.setSName(sName);
        s.setSAge(sAge);
        s.setS(sub);
        students.add(s);
    }

    public Subject addSubject(int sId,String sName,double sFees)
    {
        Subject sub = new Subject();
        sub.setSId(sId);
        sub.setSName(sName);
        sub.setSFees(sFees);
        return sub;
    }

    public void displayStudent(){
        for (Student s: students)
        {
            System.out.println(s.getSRollNo());
            System.out.println(s.getSName());
            System.out.println(s.getSAge());
            System.out.println(s.getS().getSId());
            System.out.println(s.getS().getSName());
            System.out.println(s.getS().getSFees());
        }
    }


    public void removeStudent(int RollNo) {
        for (int i=0;i<students.size();i++)
        {
            if (RollNo==students.get(i).getSRollNo())
            {
                students.remove(students.get(i));
            }
        }
    }

    public void updateStudentSubject(int rollNo,String sName) {
        for (int i=0;i<students.size();i++)
        {
            if (rollNo==students.get(i).getSRollNo())
            {
                students.get(i).getS().setSName(sName);
            }
        }

    }

    public void searchStudent(int rollNo) {
        for (int i =0;i<students.size();i++)
        {
            if (rollNo==students.get(i).getSRollNo())
            {
                System.out.println(students.get(i).getSRollNo());
                System.out.println(students.get(i).getSName());
                System.out.println(students.get(i).getSAge());
                System.out.println(students.get(i).getS().getSId());
                System.out.println(students.get(i).getS().getSName());
                System.out.println(students.get(i).getS().getSFees());
            }
        }
    }

    public void displayStudentBySubject(String sub) {
        for (int i=0;i<students.size();i++)
        {
            if (sub.equals(students.get(i).getS().getSName()))
            {
                System.out.println(students.get(i).getSRollNo());
                System.out.println(students.get(i).getSRollNo());
                System.out.println(students.get(i).getSName());
                System.out.println(students.get(i).getSAge());
                System.out.println(students.get(i).getS().getSId());
                System.out.println(students.get(i).getS().getSName());
                System.out.println(students.get(i).getS().getSFees());
            }
        }
    }
}
