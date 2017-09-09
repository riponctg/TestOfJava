package Encapsulation;

/**
 * Created by smhoque on 9/9/17.
 */
public class Student {
    private int studentID;
    private String studentName;
    private String studentEmail;
    private double studentPayment;
    private String studentPhone;

    public int getID(){
        return studentID;
    }
    public void setStudentID(int StudentID){
        this.studentID = StudentID;

    }
    public String getName(){
        return studentName;
    }
    public void setStudentName(String StudentName){
        this.studentName = StudentName;

    }
    public String getStudentEmail(){
        return studentEmail;
    }
    public void setStudentEmail(String StudentEmail){
        this.studentEmail = StudentEmail;
    }
    public double getStudentPayment(){
        return studentPayment;
    }
    public void setStudentPayment(double StudentPayment){
        this.studentPayment = StudentPayment;
    }
    public String getStudentPhone(){
        return studentPhone;
    }
    public void setStudentPhone(String StudentPhone){
        this.studentPhone = StudentPhone;
    }
}
