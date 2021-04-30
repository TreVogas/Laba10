import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public static void readAllByteByArray(InputStream in) throws IOException{
        byte[] buff = new byte[5];
        while (true){
            int count = in.read(buff);
            if (count != -1){
                System.out.println("Count = " +count+",buff = " + Arrays.toString(buff)+",str" + new String(buff,0,count,"cp1251"));
            }
            else {
                break;
            }
        }
    }
    public static void main (String[] args) throws IOException{
        String fileName = "C:\\Users\\tretyakov\\Desktop\\Example2.txt";
        InputStream inFile = null;
        try{
            inFile = new FileInputStream(fileName);
            readAllByteByArray(inFile);
        } catch (IOException e){
            System.out.println("Mistake of openning-closing file" + fileName+e);
        } finally {
            if (inFile!=null){
                try{
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
