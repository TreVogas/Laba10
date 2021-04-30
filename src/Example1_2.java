import java.io.*;
import java.util.Random;
import java.util.Scanner;

/*
Задание 2. Создать проект, позволяющий из одного, предварительно созданного программными средствами файла, переписать
данные, соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
В результирующий файл переписать вторую строку и положительные числа.
 */
public class Example1_2 {
    public static void main(String[] args) throws IOException {
        try{
            Random random = new Random();
            Scanner sc = new Scanner(System.in, "cp1251");
            File newFile = new File("newFile.txt");
            File newFile2 = new File("newFile2.txt");
            newFile.delete();
            newFile.createNewFile();
            newFile2.createNewFile();
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(newFile.getAbsolutePath()));
            sc.nextLine();
            System.out.println("Enter the line");
            String s = sc.nextLine();
            dOut.writeUTF(s);
            System.out.println("Enter the numbers");
            for(int i = 0;i<5;i++){
                dOut.writeFloat(sc.nextFloat());
                }
            dOut.flush();
            dOut.close();
            BufferedReader br = null;
            BufferedWriter bw = null;
            br = new BufferedReader(new InputStreamReader(new FileInputStream("newFile.txt"),"cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("newFile2.txt"),"cp1251"));
        } catch(IOException e){
            System.out.println("Mistake!!!"+e);
        }
    }
}
