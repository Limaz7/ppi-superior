import java.util.Scanner;

public class binario_decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número binário: ");
        String binario = scanner.nextLine();
        
        int decimal = 0;
        int potencia = 1; // Começa com 2^0 = 1
        int indice = binario.length() - 1; // Começa pelo último dígito
        
        // Verifica se a entrada é válida
        boolean entradaValida = true;
        for (int i = 0; i < binario.length(); i++) {
            char c = binario.charAt(i);
            if (c != '0' && c != '1') {
                entradaValida = false;
                break;
            }
        }
        
        if (!entradaValida) {
            System.out.println("Entrada inválida! Digite apenas 0s e 1s.");
        } else {
            while (indice >= 0) {
                char digito = binario.charAt(indice);
                
                if (digito == '1') {
                    decimal += potencia;
                }
                // else if (digito == '0') não faz nada
                
                potencia *= 2; // Aumenta a potência para a próxima posição
                indice--; // Move para o próximo dígito à esquerda
            }
            
            System.out.println("O número decimal é: " + decimal);
        }
        
        scanner.close();
    }
}