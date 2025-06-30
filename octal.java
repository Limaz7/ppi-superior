package ppi;

import java.util.Scanner;

public class octal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Selecione uma das opções: 1 = Octal para decimal, 2 = Decimal para octal, 3 = Octal para binario");
        int alter = sc.nextInt();

        if (alter == 1) {
            System.out.println("Escolha o valor em octal que será convertido:");
            String strvocta = sc.next();

            int qtdalgar = strvocta.length();

            for (int i = 0; i < qtdalgar; i++) {
                char caractere = strvocta.charAt(i);

                double pot = Math.pow(8, qtdalgar - 1 - i);

                int valor = Character.getNumericValue(caractere);
                double result = valor * pot;
            
                total += result;
                
            }
            System.out.println("Seu numero em decimal é: "+total);
        }
        
        if (alter == 2) {
            System.out.println("Escolha o valor em decimal que será convertido:");
            int strvocta = sc.nextInt();
            int resto;
            int resultado = strvocta;
            String octal = "";
            while (resultado > 0) {
            	
            	resto = resultado % 8;
            	resultado = resultado / 8;
            	System.out.println(resto);
            	octal = resto + octal;
            	
            }
           
            System.out.println("Seu numero em octal é: "+octal);
        } 
        
        if (alter == 3) {
        	String octal = "";
        	  System.out.println("Escolha o valor em octal que será convertido:");
              String strvocta = sc.next();

              int qtdalgar = strvocta.length();

              for (int i = 0; i < qtdalgar; i++) {
                  char caractere = strvocta.charAt(i);
        
                  double pot = Math.pow(8, qtdalgar - 1 - i);
              
                  int valor = Character.getNumericValue(caractere);
                  double result = valor * pot;
     
                  total += result;
               


      			

              }
              
              while(total > 0) {

    				int resto = total % 2;

    				 octal = resto + octal;

    				total /= 2;

    			}

    			

    			System.out.println("Binario: " + octal);
                
                
                
      	
      }
              
             
              }
    
    }

