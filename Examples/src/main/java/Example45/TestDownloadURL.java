package Example45;

import java.net.URL;
import java.util.Scanner;

public class TestDownloadURL {

    public static void main(String[] args) {

        // TODO Write a try/catch block 
    }

    /** TODO Remove the throws Exception and replace it with the specific exception */
    // checked exception ==> you must declare
    public static String queryURL(String urlString) throws Exception {
        // Create a URL object
        URL url = new URL(urlString);

        // read the URL stream into the Scanner object
        Scanner input = new Scanner(url.openStream());
        String out = "";
        while (input.hasNext()){
            out = out + input.nextLine() + "\n";
        }
        return out;
    }

}



