import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		String input = null;
		boolean running = true;
		
		println("Welcome to MathTest program. Type help to see command-list.");
		
		while (running) {
			input = getInput(">");
			if (input.equals("start")) {
				println("You typed start");
			} else if (input.equals("instructions")) {
				println("You typed instructions");
			} else if (input.equals("exit")) {
				running = false;
				println("Goodbye.");
			} else if (input.equals("help")) {
				showHelp();
			} else {
				println("Unknown command.");
			}
		}
	}
	
	public static void showHelp() {
		showMenu("HELP", 20);
		println("start - begin the test.");
		println("instructions - show test instructions.");
		println("help - see help menu.");
		println("exit - exit the program.");
	}
	
	public static String getInput(String prompt) {
		Scanner inputReader = new Scanner(System.in);
		print(prompt);
		return inputReader.nextLine();
	}
	
	public static void showMenu(String title, int stars) {
		showStars(stars);
		println("\t" + title);
		showStars(stars);
	}
	
	public static void showStars(int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++)
			sb.append('*');
		println(sb.toString());
	}
	
	public static void print(String s) {
		System.out.print(s);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
	
	public static void println() {
		System.out.println();
	}
	
}
