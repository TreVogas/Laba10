import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter out = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\tretyakov\\Desktop\\test.txt"));
            out = new BufferedWriter(new FileWriter("C:\\Users\\tretyakov\\Desktop\\Example3.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": "+s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Mistake" +e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
