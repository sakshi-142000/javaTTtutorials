// learning byteStream classes here
// not very efficient as program invests most of the time reading bytes one each time in the loop
// represents a kind of low-level I/O that you should avoid
// character streams are better
// So why talk about byte streams? Because all other stream types are built on byte streams.
// https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class code1{
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c ; // reading the next byte

            while((c=in.read())!=-1){
                out.write(c); // not that write expects an int
                System.out.print((char)c);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(in != null){
                in.close(); // avoiding resource leaks by closing both the streams
            }
            if(out!=null){
                out.close();
            }
        }
    }
}

/*
 * One possible error is that our program was unable to open one or both files. 
 * When that happens, the stream variables, in and out corresponding to the file never changes from its initial null value. 
 * That's why we need to make sure that each stream variable contains an object reference (not equal to null, so as to avoid nullPointer exception)
 * before invoking close.
 * 
 * 
 */
