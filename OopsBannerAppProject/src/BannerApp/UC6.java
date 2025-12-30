package BannerApp;

//Stores banner character pattern in a class
class CharacterPattern{
	private String[] pattern;

	public CharacterPattern(String[] pattern) {
		super();
		this.pattern = pattern;
	}

	public String[] getPattern() {
		return pattern;
	}
}

public class UC6 {
	public static void main(String[] args) {
		String[] pattern= {"**** **** **** ****","*  * *  * *  * *   ","*  * *  * **** ****","*  * *  * *       *","**** **** *    ****"};
		CharacterPattern cp=new CharacterPattern(pattern);
		printBanner(cp.getPattern());
	}

	public static  void printBanner(String[] pattern) {
		for(String banner:pattern) {
			System.out.println(banner);
		}
	}
}
