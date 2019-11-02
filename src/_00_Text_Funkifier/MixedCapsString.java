package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		for(int i = 1 ; i < s.length() ; i++ ) {
			
			for(int j = 65 ; j < 90 ; j++) {
				//replace with n+32
				
				if(s.charAt(i) == (char)j) {
					s2 = s2 + (char)(j+32);
				}
				else if(s.charAt(i) == (char)(j+32)) {
					s2 = s2 + (char)j;
				}
				else {
					
				}
			}
		}
		System.out.println(s2);
		return s2;
	
	}

}
