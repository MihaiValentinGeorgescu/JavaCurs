package interfaces;

public class Persoana {
    public static void main(String[] args) {

        AntrenorHandball antrenorDeHandball = new AntrenorHandball();

        antrenorDeHandball.alearga();
        antrenorDeHandball.antreneaza();
        antrenorDeHandball.nrEchipe(4);
        antrenorDeHandball.sport("Handball");
        antrenorDeHandball.tipa();
        antrenorDeHandball.suteaza();

        System.out.println("obiect instructorDeCisco");
        System.out.println("---------------");
        InstructorCisco instructorDeCisco = new InstructorCisco();
        instructorDeCisco.numeInstructor("Stefan");
        instructorDeCisco.experientaRetelistica(10);

        System.out.println("obiect instructor");
        System.out.println("---------------");
        InstructorCisco instructor = new InstructorCisco();

        instructor.colecteaza();
        instructor.evalueazaExamen();
        instructor.preda();

        Instructor instructor1 = new InstructorCisco();
        instructor1.preda();

    }
}
