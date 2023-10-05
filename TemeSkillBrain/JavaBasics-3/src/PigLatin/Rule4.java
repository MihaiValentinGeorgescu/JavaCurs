package PigLatin;

public class Rule4 extends BigBoiClass{

    public String metodaRegula4(String input){
        String prefix = "";
        int k=0;
        int index = 0;
        if( input.length() == 2 && input.charAt(1) == 'y') {
            input = String.valueOf(input.charAt(1) + input.charAt(0));
        }else{
            for (int i = 0; i < input.length(); i++) {
                char litera = input.charAt(i);
                if (isConsonant(litera)) {
                    prefix = prefix + litera;
                    k++;
                } else {
                    if (litera == 'y') {
                        index = i;
                        break;

                    }
                }
            }
        }

        String cuvinnou = input.substring(0, index) + input.substring(index+1);
        cuvinnou = cuvinnou.substring(k-1);
        cuvinnou = cuvinnou + prefix + "ay";
        return cuvinnou;
    }
}
