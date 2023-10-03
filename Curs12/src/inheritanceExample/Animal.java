package inheritanceExample;

public class Animal extends AlteActiuni{
    public void alearga(){
        System.out.println("Animalu alearga");
    }

    public void scoateSunet(){
        System.out.println("Animalul scoate un anumit sunet");
    }

    public void zgarieAsAnimal() {
        super.zgarie();
    }
}
