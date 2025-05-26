import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try {
            File Obj = new File("test.txt");
            Scanner Reader = new Scanner(Obj);
            Integer count=0;
            FileWriter Writer= new FileWriter("update.txt");
          while (Reader.hasNext()) {
                String data = Reader.next();
                char first=Character.toLowerCase(data.charAt(0));
                if(first=='a' || first=='e' || first=='i' || first=='o'|| first=='u'){
                    count++;
                }
            }
            Writer.write("Number of vowels in the text file is: "+count);
            System.out.println("Number of vowels in the text file is: "+count);
            Writer.close();
            Reader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}