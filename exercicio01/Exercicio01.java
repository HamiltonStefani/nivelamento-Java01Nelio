package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf(" Products:\n Computer which price is $ %.2f \n Office desk, which price is %.2f \n\n", price1, price2);
		System.out.printf(" Record: %d years old,  code %d and gender '%c' \n\n",age, code, gender );
		System.out.printf(" Measue with eight decimal places:%.8f \n Rouded (three decimal places):%.3f \n US decimal point: %.3f \n", measure, measure, measure);
	}

}
