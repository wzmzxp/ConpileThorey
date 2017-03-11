import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileLockInterruptionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnnotationsHandle {
	String model[] = { "^\\n*$", "^//*", ".*//*.*/*/$" };
	FileHandle fileHandle = null;
	String s;


	public AnnotationsHandle(String sour, String point) throws FileNotFoundException {
		try {
			fileHandle = new FileHandle(sour, point);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean match(String str1, Pattern pattern) {
		// pattern.compile(str);
		Matcher matcher = pattern.matcher(str1);
		if (matcher.find())
			return true;
		else
			return false;
	}

	public void annoHandle() throws IOException {
		while ((s = fileHandle.in.readLine()) != null) {

			if (match(s.trim(), Pattern.compile(model[0]))) {
				continue;
			} else if (match(s.trim(), Pattern.compile(model[1]))) {

				continue;
			} else if (match(s.trim(), Pattern.compile(model[2]))) {

				StringBuffer ss = new StringBuffer(s);

				int start = ss.indexOf("/*");
				int end = ss.indexOf("*/");
				ss.delete(start, end);
				System.out.println(ss);
				continue;

			} else {
				fileHandle.print.println(s);
				//System.out.println(s);
			}

		}

		fileHandle.print.flush();
		fileHandle.print.close();
		fileHandle.in.close();
	}

}
