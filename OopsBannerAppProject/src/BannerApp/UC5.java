package BannerApp;
//Modular banner printing using function
public class UC5 {

	public static void main(String[] args) {
		String[] banner= {
				"**** **** **** ****","*  * *  * *  * *   ","*  * *  * **** ****","*  * *  * *       *","**** **** *    ****"};
		printBanner(banner);

	}
	
	public static void printBanner(String[] pattern) {
		for(String banner:pattern) {
			System.out.println(banner);
		}
	}

}
