//package javaTTtutorials;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bridge {

    public static void main(String[] args) throws IOException{

        // initialising all the classes to null
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;

        try {
            inputStream = new FileInputStream("input.txt");
            inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII); 

            int d;

            while((d=FileInputStream.read))


            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(inputStream!=null) inputStream.close();
            if(inputStreamReader!=null) inputStreamReader.close();
            if(outputStream!=null) outputStream.close();
            if(outputStreamWriter!=null) outputStreamWriter.close();
        }


    }
    
}
