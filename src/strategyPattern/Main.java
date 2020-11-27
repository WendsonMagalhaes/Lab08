package strategyPattern;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		ControllerFormatting contollerFormatting;
		
		contollerFormatting = new ControllerFormatting (new CapsLock());
		String text = sr.nextLine();
		System.out.println(contollerFormatting.formatText(text));
		
		contollerFormatting= new ControllerFormatting(new LowerCase());
		System.out.println(contollerFormatting.formatText(text));
		
		contollerFormatting = new ControllerFormatting(new Bold());
		System.out.println(contollerFormatting.formatText(text));
		
		contollerFormatting = new ControllerFormatting(new Italic());
		
		System.out.println(contollerFormatting.formatText(text));
	}
}