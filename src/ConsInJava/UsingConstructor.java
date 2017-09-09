package ConsInJava;

/**
 * Created by smhoque on 9/8/17.
 */
public class UsingConstructor {
    String laptopName;
    double price;
    String memory;
    int number;

    UsingConstructor() {
        System.out.println("Non Parameterize Constructor");

    }
    UsingConstructor(String laptopName) {
        this.laptopName = laptopName;

    }
    UsingConstructor(String laptopName, double price) {
        this.laptopName = laptopName;
        this.price = price;

    }
    UsingConstructor(String laptopName, double price, String memory) {
        this.laptopName = laptopName;
        this.price = price;
        this.memory = memory;
    }
    UsingConstructor(int number, String laptopName, double price, String memory) {
        this.laptopName = laptopName;
        this.price = price;
        this.memory = memory;
        this.number = number;
    }
    public void display(){
        System.out.println(number + " " + laptopName + " " + price + " " + memory);
    }
}
