import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the word: ");
         String word = sc.nextLine();

         String urlStr = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;

        try{
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder  response = new StringBuilder();
            String line;

            while((line = reader.readLine())!=null){
                response.append(line);
            }
            reader.close();
            String result = response.toString();
            System.out.println("Result: "+result);

             String defKey = "\"definition\":\"";
            int defIndex = result.indexOf(defKey);
            if (defIndex != -1) {
                int defEnd = result.indexOf("\"", defIndex + defKey.length());
                String definition = result.substring(defIndex + defKey.length(), defEnd);
                System.out.println("Definition: " + definition);
            } else {
                System.out.println("No definition found for '" + word + "'");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

   
}