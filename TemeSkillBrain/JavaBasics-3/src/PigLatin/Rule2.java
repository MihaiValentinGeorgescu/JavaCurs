package PigLatin;

public class Rule2 extends BigBoiClass{

    public String metodaRegula2(String input){

        int nrConsoane = nrConsoaneConsecutive(input);
        String sufix = input.substring(0,nrConsoane);

        String substring = input.substring(nrConsoane) + sufix;

        substring = substring+ "ay";

        return substring;
    }
}
