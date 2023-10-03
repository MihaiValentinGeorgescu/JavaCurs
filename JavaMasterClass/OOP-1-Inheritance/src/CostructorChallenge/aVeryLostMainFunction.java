package CostructorChallenge;

public class aVeryLostMainFunction {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000, "ceva@.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCredit_limit());
        System.out.println(customer.getEmail_adress());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCredit_limit());
        System.out.println(customer2.getEmail_adress());

        Customer customer3 = new Customer("joel", "aweggr");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCredit_limit());
        System.out.println(customer3.getEmail_adress());
    }
}
