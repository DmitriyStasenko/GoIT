package module6.Task2;

/**
 * Created by Дима on 05.12.2016.
 */
public class Randomstring {

    public static void main(String[] args) {
    String line = "Test testing";
       char letter = 't';

        System.out.println(deleteletter(line,letter));



    }



    private static String deleteletter(String line, char letter) {

        String resultLine = "";


        for (char charItem : line.toCharArray())
            if (charItem != letter) {
                resultLine = resultLine + charItem;

            }
            return resultLine;
    }

}