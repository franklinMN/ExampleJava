// import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterExample {
    public static void main( String[] args ) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\Franssova\\Desktop\\samplejava.txt", true);
        PrintWriter pw = new PrintWriter( fw );

        pw.append( "Name : Franklin Maria Nayagam S\n" );
        pw.append( "DOB: 13/05/1998\n" );
        pw.append( "Gender: Male\n" );
        pw.append( "Gender: Male\n" );

        pw.flush();
        pw.close();
        fw.close();
    }
}