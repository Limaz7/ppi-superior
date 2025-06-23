package trabalho;
import java.util.Scanner;
public class decimal_binário {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		   System.out.print("Digite um número decimal: ");
		   int decimal = scanner.nextInt();
		   
		   if(decimal == 0 ) {
			   System.out.print("O número binário é: 0");
		   }else {
			   String Binario = "";
			   int temp = decimal;
			   
			   
			   while(temp > 0) {
				   int resto = temp % 2;
				   Binario = resto + Binario;
				   temp = temp / 2;
				   
				   
			   }
			   System.out.print("O número binário é: " + Binario);
		   }
		   
		   
}
	}
