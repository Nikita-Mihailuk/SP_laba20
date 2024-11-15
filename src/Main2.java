import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader( new FileReader("file.txt"))){

            String read = bf.readLine();

            read = read.replaceAll("(Q|R|W)(1|2|4)", ".");
            read = read.replaceAll("Q|R|W|1|2|4", " ");

            String[] array = read.split("\s");

            int maxLength = 0;
            for (String n: array) {
                if(n.length() > maxLength) maxLength = n.length();
            }

            System.out.println(read);
            System.out.println(maxLength);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}