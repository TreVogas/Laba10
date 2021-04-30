import java.io.*;
import java.net.URL;

public class Example8 {
    public static void readAllByByte(Reader in) throws IOException{
        while (true){
            int oneByte = in.read();
            if (oneByte!=-1){
                System.out.println((char)oneByte);
            }
            else {
                System.out.println("\n" + "End");
                break;
            }
        }
    }
    public static void main(String[] args){
        try{
            InputStream inFile = new FileInputStream("C:\\Users\\tretyakov\\Desktop\\test.txt");
            Reader rFile = new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.println("\n\n");
            inFile.close();
            rFile.close();

            InputStream inURL = new URL("http://rosalind.info/problems/list-view/").openStream();
            Reader rURL = new InputStreamReader(inURL, "cp1251");
            readAllByByte(rURL);
            System.out.println("\n\n");
            inURL.close();
            rURL.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray,"cp1251");
            readAllByByte(rArray);
            System.out.println("\n\n");
            inArray.close();
            rArray.close();
        }catch (IOException e){
            System.out.println("Mistake!!!" + e);
        }
    }
}
