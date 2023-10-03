package interfaces;

public class InstructorCisco implements Instructor {

    public void experientaRetelistica(int nrAni){
        System.out.println("Instructorul are: " + nrAni + " experienta");
    }

    public void numeInstructor(String nume){
        System.out.println("Numele instructorului este: " + nume);
    }


    @Override
    public void preda() {
        System.out.println("Instructorul preda");
    }

    @Override
    public void colecteaza() {
        System.out.println("instructorul colecteaza lucrarile");
    }

    @Override
    public void evalueazaExamen() {
        System.out.println("Instructorul evalueaza examene");
    }
}
