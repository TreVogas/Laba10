import java.io.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\tretyakov\\Desktop\\2.txt"),"cp1251"));
            out = new PrintWriter("C:\\Users\\tretyakov\\Desktop\\test.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine())!=null){
                lineCount++;
                System.out.println(lineCount+": "+s);
                out.write(lineCount+": " + s);
            }
        } catch (IOException e){
            System.out.println("Mistake!!!" + e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
