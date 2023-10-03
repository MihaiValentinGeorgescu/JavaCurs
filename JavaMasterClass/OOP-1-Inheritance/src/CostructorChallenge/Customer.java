package CostructorChallenge;

public class Customer {

    String name;

    int credit_limit;

    String email_adress;

    public String getName(){
        return this.name;
    }

    public int getCredit_limit(){
        return this.credit_limit;
    }

    public String getEmail_adress(){
        return this.email_adress;
    }

    public Customer(String name, int limit, String email){
        this.credit_limit = limit;
        this.email_adress = email;
        this.name = name;
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }

    public Customer(){
        this("nimeni", "nimanui@gmail.com");
    }



}
