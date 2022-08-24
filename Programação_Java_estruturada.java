import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		 
		 int idade;
		 char sexo;
		 int acumuladorM=0;
		 int acumuladorF=0;
		 int quantidadeIdadeMm=0;
		 int quantidadeIdadeMf=0;
		 int contador=0;
		 int quantidadeMasculina=0;
		 int quantidadefeminina=0;
		 
		 do{//começo do do
		     System.out.println("Digite sua idade");
		     idade=keyboard.nextInt();
		     
		     System.out.println("Digite seu sexo (M) para masculino e (F) para feminino");
		     keyboard.nextLine();
		     sexo = keyboard.nextLine().charAt(0);
             sexo = Character.toUpperCase(sexo);
		     
		     if (sexo=='M'){
		        quantidadeMasculina=quantidadeMasculina+1;
		        acumuladorM=acumuladorM+idade;
		     }//fim do if 
		     
		     if(sexo=='F'){
		         quantidadefeminina=quantidadefeminina+1;
		         acumuladorF=acumuladorF+idade;
		     }//fim do if
	          
	          contador=contador+1;
	          
	          } while(contador<4);
	          
	          quantidadeIdadeMm=acumuladorM/quantidadeMasculina;
	          quantidadeIdadeMf=acumuladorF/quantidadefeminina;
	          
	       System.out.println("Quantidade de pessoas do sexo feminino:"+quantidadefeminina);
	       
	       System.out.println("Quandidade de pessoas do sexo masculino:"+quantidadeMasculina);
	       
	       System.out.println("idade média das pessoas do sexo feminino:"+quantidadeIdadeMf);
	       
	       System.out.println("idade média das pessoas do sexo masculino:"+quantidadeIdadeMm);
	   }
	}


