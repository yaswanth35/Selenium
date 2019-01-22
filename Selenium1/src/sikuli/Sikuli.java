package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws Exception {
		
		//creating object of screen class
		
		Screen s = new Screen();
		
		Pattern VDI = new Pattern("VDI.png");
		
		s.wait(VDI,2000);
		
		s.click();
		
		
	}

}
