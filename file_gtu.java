import java.io.*;
import java.util.Random;
public class file_gtu {
public static void main(String[] args) {
Random r = new Random();

try {
FileOutputStream fw = new FileOutputStream(new File("123.txt"));
PrintWriter pw = new PrintWriter(fw, true);
for (int i = 0; i < 150; i++) {
pw.print(r.nextInt(100) + "");
}
System.out.print("Data Appended");
} catch (IOException io) {
System.out.println("Cannot create the file.");
// io.printStackTrace();
}
}
}