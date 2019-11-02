package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		String h = "";
		for(int i = s.length() ; i > 0 ; i--) {
			h = s.substring(i-1, i);
			System.out.println(h);
			s2 = s2 + h;
		}
		return s2;
	}

}
