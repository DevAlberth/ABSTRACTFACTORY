package ControleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxoEbac {
	
	static Scanner scan = new Scanner(System.in);
	
	static int nota1;
	static int nota2;
	static int nota3;
	static int nota4;
	
	static int notaFinal;
	static String continuar;
	static boolean ligado;
	
	
	public static void main(String[] args) {
		
		do {
		
		System.out.println("=============== BEM VINDO A CALCULADOR DE MEDIAS ===============");
		System.out.println("=============== DIGITE A NOTA 01 ===============");

		while(true) {
		
		nota1 = scan.nextInt();
		if (nota1 >=0 && nota1 <=10) {
			System.out.println("NOTA 01 CADASTRADA");
			break;
		}
		else {
			System.out.println("Nota deve ser entre 0 a 10");
		
		}
		
		}
		
		
		System.out.println("=============== DIGITE A NOTA 02 ===============");
		
		while(true) {
		
		nota2 = scan.nextInt();
		
		if (nota2 >=0 && nota2 <=10) {
			System.out.println("NOTA 02 CADASTRADA");;
			break;
		}
		else {
			System.out.println("Nota deve ser entre 0 a 10");
		
		}
		
		}
		
		System.out.println("=============== DIGITE A NOTA 03 ===============");
		
		while(true) {
		
		nota3 = scan.nextInt();
		
		if (nota3 >=0 && nota3 <=10) {
			System.out.println("NOTA 03 CADASTRADA");
			break;
		}
		else {
			System.out.println("Nota deve ser entre 0 a 10");
		
		}
		}
		
		System.out.println("=============== DIGITE A NOTA 04 ===============");
		
		while(true) {
		
		nota4 = scan.nextInt();
		if (nota4 >=0 && nota4 <=10) {
			System.out.println("NOTA 04 CADASTRADA");
			break;
		}
		else {
			System.out.println("Nota deve ser entre 0 a 10");
		
		}
		
		}
		
		notaFinal = (nota1 + nota2 + nota3 + nota4) /4;
		
		if(notaFinal >=0 && notaFinal <=5) {
			System.out.println("=============== ALUNO REPROVADO ===============");
			System.out.println("ALUNO TIROU: " + notaFinal);
		} else if (notaFinal >=5 && notaFinal <=7) {
			System.out.println("=============== ALUNO EM RECUPERAÇÃO ===============");
			System.out.println("ALUNO TIROU: " + notaFinal);
			
		} else if(notaFinal >=7 && notaFinal<=10) {
			System.out.println("=============== ALUNO APROVADO ===============");
			System.out.println("ALUNO TIROU: " + notaFinal);
		}
		
		
			System.out.println("DESEJA CONTINUAR CALCULANDO NOTAS? (S/N)");
			continuar = scan.next();
			if(continuar.equalsIgnoreCase("S")) {
				ligado = true;
				
			} else {
				ligado = false;
			}
			
		} while(ligado);
		
		System.out.println("============================== PROGRAMA ENCERRADO BY. ALBERTH");
		
		
		
	}


}
