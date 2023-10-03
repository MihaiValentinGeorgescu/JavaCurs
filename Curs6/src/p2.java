public class p2 {
    private String text1 = "exemplu";
    private String text2;

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText1(String variabila1){
        this.text1 = variabila1;
    }
    public void setText2(String variabila2){
        this.text2 = variabila2;
    }

    public void displayMessage(){
        System.out.println(text1+text2);
    }

    public static void main(String[] args) {
        p2 encapsulationClass = new p2();
        encapsulationClass.setText1("ana are ");
        encapsulationClass.setText2("mere wosii");
        encapsulationClass.displayMessage();

        encapsulationClass.setText2("ana nu mai are ");
        System.out.println(encapsulationClass.getText2());
    }

}
