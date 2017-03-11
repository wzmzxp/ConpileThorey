import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHandle {
	BufferedReader in = null;
	PrintWriter print=null;
	
	public FileHandle(String sour,String point) throws FileNotFoundException {
		 in = new BufferedReader(new FileReader(sour));
		 print=new PrintWriter(new File(point));
	}
	
}
