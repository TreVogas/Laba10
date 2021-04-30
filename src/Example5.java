import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of file ");
        String fname = sc.nextLine();
        try{
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Direct way to the file " + f1.getAbsolutePath());
            System.out.println("Enter the number of lines for the writing to the file");
            int n = sc.nextInt();
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for(int i=0;i<n;i++){
                System.out.println("Enter the line for the writing to the file ");
                String s = sc.nextLine();
                dOut.writeUTF(s+"\n");
            }
            dOut.flush();
            dOut.close();
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e){
            System.out.println("" + e);
        }
    }
}
