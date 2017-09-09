package Abstraction;

/**
 * Created by smhoque on 9/8/17.
 */
public class GeneralMotors extends  Employees implements Department, Administrative{
    public int companyID = 777;
    public static void companyPurpose(){
        System.out.println("Buying and selling Car");
    }
    @Override
    public void empName() {
        System.out.println("Employee Name is: Samanta" );
    }

    @Override
    public void empEmail() {
        System.out.println("Samanta email address is: samanta@gmail.com");
    }

    @Override
    public void departmentID() {
        System.out.println("Samanta department ID is: 888");
    }

    @Override
    public void departmentName() {
        System.out.println("Samanta department name is: Finance");
    }

    @Override
    public void departmentLocation() {
        System.out.println("Samanta department location is: Fourth Floor");
    }

    @Override
    public void administrator() {
        System.out.println("Samanta Administrator is: Bolton");

    }
}
