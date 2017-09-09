package Abstraction;

/**
 * Created by smhoque on 9/8/17.
 */
public abstract class Employees implements Department{

    Employees(){
        System.out.print("This Abstract class Constractor" + "\n");
    }
    public void departmentID(){
        System.out.println("This is some implementation of Interface by abstract class");

    }

    public static int employeeID = 111;
    public abstract void empName();
    public abstract void empEmail();

    public void empPhone(){
        System.out.println("5712342345");
    }
    public void empDepartment(){
        System.out.println("Finance");

    }

}
