package ConsInJava;

/**
 * Created by smhoque on 9/8/17.
 */
public class ConstructorTest  {

    public static void main(String [] args){
        UsingConstructor usingConstructor = new UsingConstructor();

        UsingConstructor usingConstructorOne = new UsingConstructor("OS X");
        System.out.println("Laptop Name is: " + usingConstructorOne.laptopName);

        UsingConstructor usingConstructorTwo = new UsingConstructor("Linux", 900.99);
        System.out.println("LapTop Name is: " + usingConstructorTwo.laptopName + " Price is: " + usingConstructorTwo.price);

        UsingConstructor usingConstructorThree = new UsingConstructor("Windows", 800.99, "8GB");
        System.out.println("LapTop Name is: " + usingConstructorThree.laptopName + " Price is: " + usingConstructorThree.price
                           + "Memory is: " + usingConstructorThree.memory);
        UsingConstructor usingConstructorFour = new UsingConstructor(1,"Ubunto", 700.99, "4GB");
        usingConstructorFour.display();
    }
}
