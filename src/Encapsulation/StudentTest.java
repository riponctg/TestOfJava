package Encapsulation;

/**
 * Created by smhoque on 9/9/17.
 */
public class StudentTest {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudentID(111);
        student.setStudentName("Samanta");
        student.setStudentEmail("samanta@gmail.com");
        student.setStudentPayment(999.99);
        student.setStudentPhone("7033455678");
        System.out.println("Student ID is: " + student.getID() +  "\n" +" Student Name is: " + student.getName() + "\n" + " Student Email is: "
                           + student.getStudentEmail() + "\n" + " Student payment is: " +  student.getStudentPayment() + "\n" +
                             " Student phone is: " + student.getStudentPhone());
    }
}
