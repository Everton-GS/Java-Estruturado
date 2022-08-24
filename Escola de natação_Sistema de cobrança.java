/******************************************************************************

A escola de natação Nado a Jato precisa alterar o seu sistema de
cobrança para calcular o valor dos juros das parcelas em atraso. O
valor dos juros é cobrado conforme os dias de atraso, obedecendo a
tabela abaixo:

Elabore um programa para receber os dados necessários, calcular e
mostrar o valor dos juros e o valor do pagamento.

Dias % de Juros
Até 30       5%
De 31 a 60  10%
Acima de 60  15%

*******************************************************************************/
import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		
		int dias;
		double parcelas;
		double juros;
		double total;
		System.out.println("Digite a quantidade de dias que atrasou o pagamento.");
		dias=keyboard.nextInt();
		
		System.out.println("Digite o valor da parcela.");
		parcelas=keyboard.nextDouble();
		
		if(dias<=30){
		    
		   juros=(parcelas*0.05);
		   total=parcelas+juros;
		   System.out.println("\nValor da parcela:" +parcelas+"\nvalor com o juros pelos dias atrasados  "+juros+"\nvalor total da parcela com o juros:" +total);
		    
		}if(dias>=31 && dias<60){
		    
		    juros=(parcelas*0.10);
		    total=parcelas+juros;
		    System.out.println("\nValor da parcela:" +parcelas+"\nvalor com o juros pelos dias atrasados: "+juros+"\nvalor total da parcela com o juros:" +total);
		    
		}if(dias>60){
		    juros=(parcelas*0.15);
		    total=parcelas+juros;
		    System.out.println("\nvalor da parcela:" +parcelas+"\nvalor com o juros pelos dias atrasados  "+juros+"\nvalor total da parcela com o juros:" +total);
		    
		}


	}
}

