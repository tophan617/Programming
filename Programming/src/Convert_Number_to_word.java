import java.util.Scanner;

public class Convert_Number_to_word {
	String thousand(int n) {
		switch (n) {
		case 1: 
			return "One thousand";
		case 2: 
			return "Two thousand";
		case 3: 
			return "Three thousand";
		case 4: 
			return "Four thousand";
		case 5: 
			return "Five thousand";
		case 6: 
			return "Six thousand";
		case 7: 
			return "Seven thousand";
		case 8: 
			return "Eight thousand";
		case 9: 
			return "Nine thousand";
		default:
			return "Invalid";
		}
	}	
	String hundred(int n) {
		switch (n) {
		case 1: 
			return "One hundred";
		case 2: 
			return "Two hundred";
		case 3: 
			return "Three hundred";
		case 4: 
			return "Four hundred";
		case 5: 
			return "Five hundred";
		case 6: 
			return "Six hundred";
		case 7: 
			return "Seven hundred";
		case 8: 
			return "Eight hundred";
		case 9: 
			return "Nine hundred";
		default:
			return "Invalid";
		}
	}
	String ten(int n) {
		switch (n) {
		case 10: 
			return "Ten";
		case 11: 
			return "Eleven";
		case 12: 
			return "Twelve";
		case 13: 
			return "Threeten";
		case 14: 
			return "Fourteen";
		case 15: 
			return "Fifteen";
		case 16: 
			return "SixTeen";
		case 17: 
			return "Seventeen";
		case 18: 
			return "Eighteen";
		case 19: 
			return "Nineteen";
		case 20: 
			return "Twenty";
		case 30: 
			return "Thirty";
		case 40: 
			return "Forty";
		case 50: 
			return "Fifty";
		case 60: 
			return "Sixty";
		case 70: 
			return "Seventy";
		case 80: 
			return "Eighty";
		case 90: 
			return "Ninety";
		default:
			return "Invalid";
		}
	}
	String number(int n) {
		switch (n) {
		case 0:
			return "";
		case 1: 
			return "One";
		case 2: 
			return "Two";
		case 3: 
			return "Three";
		case 4: 
			return "Four";
		case 5: 
			return "Five";
		case 6: 
			return "Six";
		case 7: 
			return "Seven";
		case 8: 
			return "Eight";
		case 9: 
			return "Nine";
		default:
			return "Invalid";
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=scanner.nextInt();
		while (number>0) {
			int res=number;
		}
	}
}
