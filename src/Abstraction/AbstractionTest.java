package Abstraction;

/**
 * Created by smhoque on 9/8/17.
 */
public class AbstractionTest {
    public static void main(String[] args) {

        GeneralMotors generalMotors = new GeneralMotors();
        System.out.println(generalMotors.companyID);
        GeneralMotors.companyPurpose();

        Administrative administrative = new GeneralMotors();
        administrative.administrator();

        Department department = new GeneralMotors();
        department.departmentID();
        department.departmentName();
        department.departmentLocation();

        Employees employees = new GeneralMotors();
        employees.empName();
        employees.empDepartment();
        employees.empEmail();
        employees.empPhone();
        employees.departmentID();

        System.out.println(Department.departmentManager);
        System.out.println(Department.departmentManager.length());
        System.out.println(Employees.employeeID);
        System.out.println();
    }
}
