//package javaTTtutorials;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class code2 {

    public static void main(String[] args) throws IOException{

        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("test.txt"); // runtime error for this one
            out = new FileWriter("output.txt");

            int d;
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

// I tried running the code with using IOException, FileReader and FileWrite Classes throw the compilation error:
// error: unreported exception FileNotFoundException; must be caught or declared to be thrown


// package javaTTtutorials;

// import java.io.FileReader;
// import java.io.FileWriter;
// //import java.io.IOException;

// public class code2 {
//     public static void main(String args) {

        
//         FileReader in = new FileReader("input.txt");
//         FileWriter   out = new FileWriter("output.txt");

//             int d;
//             while ((d = in.read())!=-1){
//                 out.write(d);
//             }
         
       
//             if(in!=null) in.close();
//             if(out!=null) out.close();
        
//     }
// }
