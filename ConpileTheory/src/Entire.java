import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entire {

	public static void main(String[] args) {

		AnnotationsHandle ano;
		try {
			ano = new AnnotationsHandle("E:\\doc\\c\\b.c", "E:\\doc\\c\\c.c");

			ano.annoHandle();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
