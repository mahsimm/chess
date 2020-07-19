
package chess;
import java.io.*;
import java.util.*;

public class NewClass {
    public static void main(String[] args) throws IOException {
Scanner in=new Scanner(System.in);
File file =new File("C:\\Users\\NIMA\\Documents\\NetBeansProjects\\Chess\\src\\chess\\Users.txt");
FileWriter fileWriter=new FileWriter(file);
        try (BufferedWriter Writer=new BufferedWriter(fileWriter)){
            Writer.write("salam");
        } catch (Exception e) {
        }
    }
}
