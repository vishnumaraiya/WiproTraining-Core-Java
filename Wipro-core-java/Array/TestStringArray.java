package Array;

public class TestStringArray {

	public static void main(String[] args) {
		
		String[] names = {"A", "B", "C", "D"};
		
		// display name using for loop
		
		for(int i=0 ;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		// for each = read the array
		for(String i : names) {
			System.out.println(i);
		}
		
		//Display the name character by character
		
		for(int r=0 ;r<names.length; r++)
			for(int c=0 ;c<names[r].length();c++) {
				System.out.println(names[r].charAt(c));
			}
	}

}
