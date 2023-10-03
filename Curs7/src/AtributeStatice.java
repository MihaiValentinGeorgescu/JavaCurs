public class AtributeStatice {

    public static int oddNumber = 2;
    public int primeNumber = 3;

    public static void main(String[] args) {
        AtributeStatice obiect1 = new AtributeStatice();
        AtributeStatice obiect2 = new AtributeStatice();

        System.out.println(oddNumber);
        obiect1.oddNumber = 10;
        obiect2.oddNumber = 15;

        System.out.println(oddNumber);
        obiect1.primeNumber = 100;
        obiect2.primeNumber = 200;

        System.out.println(obiect1.primeNumber);
        obiect1.primeNumber = 1000;
        System.out.println(obiect2.primeNumber);
        System.out.println(obiect1.primeNumber);

    }
}





