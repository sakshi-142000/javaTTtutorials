package javaTTtutorials;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class code {

    public static void main(String[] args) throws IOException{

        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("Input.txt"); // runtime error for this one
            out = new FileWriter("Output.txt");

            int d; // note that here the integer variable d stores character in it's last 16digits rather than a byte 
            while ((d = in.read())!=-1){
                out.write(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(in!=null) in.close();
            if(out!=null) out.close();
        }
    }
}