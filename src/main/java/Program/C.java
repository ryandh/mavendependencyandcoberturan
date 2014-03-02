package Program;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C {
	public static void main(String[] args) throws IOException {
		// String yourname=arg(args,0,"yourname");

		LoadFile();
	}

	public static int LoadFile() throws IOException {
		Logger logger = LoggerFactory.getLogger(C.class);
		logger.warn("You get hacked");

		InputStream input = C.class.getClassLoader().getResourceAsStream(
				"demo.xml");
		List<String> result = IOUtils.readLines(input);
		System.out.println(result.size());
		return result.size();
	}
}
