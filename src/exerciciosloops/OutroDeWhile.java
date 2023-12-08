package exerciciosloops;

import java.util.Scanner;

public class OutroDeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int back=0,front=0, mob=0,fs=0,total=0,media=0;
		int idade,identidade,prof;
		char op;
		System.out.println("\t Bem vindo ao programa demografico de funcionarios");
		System.out.println("\nEsse programa  tem o intuito de verificar a diversidade em nossa empresa");
		System.out.println("\nDeseja começar o  programa? S(Sim)/N(Não)");
		
		op = ler.next().charAt(0);
		while (op!='N'&&op!='S') {
			System.out.println("\nComando inválido");
			System.out.println("\nPor gentileza informar se deseja começar o  programa?Responda S(Sim)/N(Não)");
					op = ler.nextLine().charAt(0);

		}
		
		while (op!='N') {
			System.out.println("\nInformar a idade:");
			idade = ler.nextInt();
			System.out.println("\nInformar como se identifica dentre as opções abaixo");
			System.out.println("\n1- Mulher Cis");
			System.out.println("\n2- Homem Cis");
			System.out.println("\n3- Não Binário");
			System.out.println("\n4- Mulher Trans");
			System.out.println("\n5- Homem Trans");
			System.out.println("\n6- Outros");
			System.out.println("\nFavor escolher entre as opçõesde 1 a 6");
			identidade = ler.nextInt();
			System.out.println("\nInformar Ramo de Desenvolvimento");
			System.out.println("\n1- Backend");
			System.out.println("\n2- Frontend");
			System.out.println("\n3- Mobile");
			System.out.println("\n4- FullStack");
			System.out.println("\nFavor escolher entre as opções 1 a 4");
			prof = ler.nextInt();
			
			total++;
			media+=idade;
			if (prof==1) 
				back++;		
			else if((identidade==1||identidade==4)&&prof==2)
				front++;		
			else if((identidade==2||identidade==5)&&prof==3&&idade>40)
				mob++;
			else if(identidade==3&&prof==4&&idade<30)
				fs++;
			System.out.println("\nPor gentileza informar se deseja inserir outro participante?Responda N(Não) caso queira terminar");
			op = ler.next().charAt(0);
		}
		media=media/total;
		System.out.println("\nO número de pessoas desenvolvedoras Backend é "+back);
		System.out.println("\nO número de Mulheres Cis e Trans desenvolvedoras Frontend é "+front);
		System.out.println("\nO número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é "+front);
		System.out.println("\nO número de Não Binários desenvolvedores FullStack menores de 30 anos é "+fs);
		System.out.println("\nO número total de pessoas que responderam à pesquisa é "+total);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa é "+media);
		ler.close();
	}

}
