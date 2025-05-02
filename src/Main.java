//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isSenior;
        double price = 9.99;

        if (isStudent) {
            System.out.println("You get a student discount of 10%");
            price *= 0.9;
        } else {
            price *= 1;
        }
        System.out.println("The price of a ticket is: kes" + price );
    }
}

