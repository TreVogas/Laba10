import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException{
        Reader in = null;
        Writer out = null;
        try{
            in = new FileReader("C:\\Users\\tretyakov\\Desktop\\Example.txt");
            out = new FileWriter("C:\\Users\\tretyakov\\Desktop\\Example3.txt");
            int oneByte;
            while ((oneByte = in.read())!=-1){
                out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }
        } catch (IOException e){
            System.out.println("Mistake!!!" + e);
        }
        finally {
            in.close();
            out.close();
        }
    }
}
