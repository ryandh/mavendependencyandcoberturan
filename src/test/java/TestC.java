import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class TestC {

	@Test
	public void testReadLine() throws IOException {
		//this will load test source files
		assertEquals(4,  Program.C.LoadFile());
	}

}
