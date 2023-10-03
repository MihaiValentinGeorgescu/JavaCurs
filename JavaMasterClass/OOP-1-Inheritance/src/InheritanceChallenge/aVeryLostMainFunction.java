package InheritanceChallenge;

public class aVeryLostMainFunction {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1976", "01/03/2023");
        System.out.println(tim);
        System.out.println("age = " + tim.getAge());
        System.out.println("pay = " + tim.collectpay());

        SalariedEmployee  joe = new SalariedEmployee("Joe", "11/04/1976", "03/07/2023", 34000);
        System.out.println(tim);
        System.out.println("age = " + tim.getAge());
        System.out.println("pay = " + tim.collectpay());
        System.out.println("joe s paycheck = " + joe.collectPay());

        joe.retire();
        System.out.println("joes pension = " + joe.collectPay());

        Worker eu = new Worker("eu", "11/04/1976");
        System.out.println(eu);
        System.out.println("pay = " + eu.collectpay());
        System.out.println("age = " + eu.getAge());

        HourlyEmployee Mary = new HourlyEmployee("Mary", "05/02/2000", "05/02/2019", 30);
        System.out.println(Mary);
        System.out.println("Mary's paycheck = " + Mary.collectPay());
        System.out.println("Marys hollydays pay = " + Mary.getDoublePay());

    }
}
