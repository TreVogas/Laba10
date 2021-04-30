import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void readAllByByte(InputStream in) throws IOException {
    while (true){
        int oneByte = in.read();
        if (oneByte != -1){
            System.out.print((char) oneByte);
        }
        else {
            System.out.println("\n" + "end");
            break;
        }
    }
    }
    public static void main (String[] args) throws IOException{
        try{
            InputStream inFile = new FileInputStream("C:\\Users\\tretyakov\\Desktop\\Example.txt");
            readAllByByte(inFile);
            System.out.println("\n\n");
            inFile.close();
            InputStream inURL = new URL("http://google.com").openStream();
            readAllByByte(inURL);
            System.out.println("\n\n");
            inURL.close();
            InputStream inArray = new ByteArrayInputStream(new byte[]{7,7,7,7,7});
            readAllByByte(inArray);
            System.out.println("\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Mistake!!!" + e);
        }
    }
}
