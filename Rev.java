package TestYantra_programming;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String st="My name is ty.your name is king";
		String[] s = st.split(".");
		for (int i = 0; i < s.length; i++) {
			
			String sf = s[0];
			for (int j = sf.length()-1; j>=0; j--) {
				System.out.print(sf.charAt(j));
			}
			System.out.print(s[1]);
		}
		
	}

}
