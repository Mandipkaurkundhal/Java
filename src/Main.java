import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
//create input and output stream objects
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            //Files objects
            File inputFile = new File("/Users/mandipkaur/Desktop/Input.docx");
            File outFile = new File("/Users/mandipkaur/Desktop/Output.docx");
            //Initialize input and output streams
            inStream = new FileInputStream(inputFile);
            outStream = new FileOutputStream(outFile);
            //The buffer size for reading data
            byte[] buffer = new byte[1024];
            int length;
            //Copy data to another file
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            // Closing the input/output file streams
            inStream.close();
            outStream.close();
            System.out.println("Written Content to another file.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }}
