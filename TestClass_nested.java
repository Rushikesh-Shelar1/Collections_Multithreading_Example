package javaprojects;

//example for anonymous class
abstract class ProKabadi{
	abstract void winner();
}


public class TestClass_nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProKabadi win_2024 =new ProKabadi() {
			void winner() {
				System.out.println("Puneri Paltan");
			}
		};
		win_2024.winner();
		
		ProKabadi win_2023 =new ProKabadi() {
			void winner() {
				System.out.println("Jaipur Panthers");
			}
		};
		win_2023.winner();
	}

}
