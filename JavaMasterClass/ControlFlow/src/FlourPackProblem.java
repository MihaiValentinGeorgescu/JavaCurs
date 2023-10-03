public class FlourPackProblem {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 9;

        if(canPack(a,b,c)){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if( bigCount*5 + smallCount*2 >= goal){
            return true;
        }

        return false;
    }
}
