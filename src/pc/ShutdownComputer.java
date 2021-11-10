package pc;

import java.io.IOException;
import java.util.Scanner;

public class ShutdownComputer {

	public static void main(String[] args) throws IOException {
		
		Scanner Scanner =new  Scanner (System.in);
		Double timeInseconds =Scanner.nextDouble();
		Runtime runtime =Runtime .getRuntime();
		Process P= runtime.exec("shutdown-s-t"+timeInseconds);
		System.exit(1);
	
	}

}
