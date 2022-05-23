
public class ToREverseString {

	public static void main(String[] args) {

		String name = "Tek School";
		StringBuilder build = new StringBuilder(name);
		System.out.println(build.reverse());

		System.out.println("====================");

		String Schoolname = "Tek School";
		for (int i = Schoolname.length() - 1; i >= 0; i--) {
			System.out.print(Schoolname.charAt(i));
			//System.out.println(Schoolname.length());
		 }
		
		
		
		// Counting the Characters
		String str = "Tek Schoo is located in VA";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
