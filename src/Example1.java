import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("I was born");
                System.out.println("Direct way to me = " + f1.getAbsolutePath());
            }
            File f2 = new File("C:\\Users\\tretyakov\\Desktop");
            f2.createNewFile();
            System.out.println("Direct way to another me = " + f2.getAbsolutePath());
            File f3 = new File("C\\Path1\\Path2\\Path3");
            f3.mkdirs();
            System.out.println("Direct way to f3 = " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Mistake!!!" + e);
        }
    }
}