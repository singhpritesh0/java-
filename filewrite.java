import java.io.*;
public class filewrite {
public static void main(String args[])throws IOException {

File file1 = new File("pk.txt");
// A file is created
file1.createNewFile();
// Object of FileWriter is created
FileWriter writer1 = new FileWriter(file1);
// Contents are written to the file
writer1.write("Hello connection i am really happy to share my achivement to you all which is I complete by sourse succefully eith this institute thannks to the professor which hlp me to get this");
writer1.flush();
writer1.close();
// Object of filereader is created
FileReader read = new FileReader(file1);
char [] a1 = new char[50];
read.read(a1); // array contents are read
for(char ch : a1)
System.out.print(ch); // characters are printed one by one
read.close();
}
}