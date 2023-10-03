package PersonChallenge;

public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isTeen(){
        if( this.age > 12 && this.age < 20 ){
            return true;
        }else{
            return false;
        }
    }
}
