package Chapter_1;
/**
 * 
 * @author SM
 *Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)
 */
public class Assig_1_2 {

	public static void reverse(char[] str) {
		int head = 0;
		int tail = str.length - 2;
		while (head < tail) {
			char temp = str[head];
			str[head] = str[tail];
			str[tail] = temp;
			head++;
			tail--;

		}

	}

	public static void main (String[] args)
	{
		
		char[] test = {1,2,3,4,5,6,7,8,9,0};
		reverse(test);
		System.out.println(test);
		
	}
}
