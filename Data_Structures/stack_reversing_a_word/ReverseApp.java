package stack_reversing_a_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {

	public static void main(String[] args) throws IOException {

		// Scanner input = new Scanner(System.in);

		String input, output;

		while (true) {
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();
			if (input.equals(""))
				break;

			Reverser rev = new Reverser(input);
			output = rev.doRev();// use it
			System.out.println("Reversed: " + output);

		}

	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String b = bfr.readLine();
		return b;

	}

}
