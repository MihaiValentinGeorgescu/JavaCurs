package PigLatin;

public class aVeryLostMainFunction {
    public static void main(String[] args) {
        Rule1 regula1 = new Rule1();
        Rule2 regula2 = new Rule2();
        Rule3 regula3 = new Rule3();
        Rule4 regula4 = new Rule4();

        String cuvint1 = "aqule";
        System.out.println(regula1.metodaRegula1(cuvint1));
        String cuvint2 = "xqule";
        System.out.println(regula2.metodaRegula2(cuvint2));
        String cuvint3 = "xqyle";
        System.out.println(regula3.metodaRegula3(cuvint3));
        String cuvint4 = "mdy";
        System.out.println(regula4.metodaRegula4(cuvint4));
    }
}
