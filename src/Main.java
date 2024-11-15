import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader( new FileReader("file.txt"))){

            String read = bf.readLine();

            read = read.replaceAll("AB|CB", ".");
            read = read.replaceAll("A|B|C", " ");

            String[] array = read.split("\s");

            int maxLength = 0;
            for (String n: array) {
                if(n.length() > maxLength) maxLength = n.length();
            }

            System.out.println(maxLength);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}