package Colletions_EBAC01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListaPessoas {
	
	Scanner scan = new Scanner(System.in);
	
	List<Pessoa> listaPessoaMasculina = new ArrayList<>();
	List<Pessoa> listaPessoaFeminina = new ArrayList<>();
	

	
	public void AddNaListaPessoas() {

//		listaPessoaMasculina.sort(Comparator.comparing(Pessoa::getNome));
//		listaPessoaFeminina.sort(Comparator.comparing(Pessoa::getNome));
//		
		
		boolean flag = true;
		String condicao = null;
		
		while(flag){
			
			System.out.println("Digite o Nome, Genero (M/F): ");
			
			boolean aprovado = false;
			String nome = scan.nextLine();
			String genero = scan.nextLine();
			
			
			do {
				
			if(genero.equalsIgnoreCase("m")) {
			listaPessoaMasculina.add(new Pessoa (nome, genero));
				aprovado = true;
				break;
				
			} else if (genero.equalsIgnoreCase("f")){
				listaPessoaFeminina.add(new Pessoa (nome, genero));
				aprovado = true;
				break;
	
			} else {
				System.out.println("GENERO NÃO INFORMADO");
				break;
			}
			}while (aprovado == false);
			System.out.println("Deseja adicionar mais pessoas? S/N");
			
			condicao = scan.nextLine();
			
			
			if(condicao.equalsIgnoreCase("n")) {
				flag = false;
				
			}
		}
		
		
		
		
	
	}
	
	public void ExibirLista() {
		
		listaPessoaMasculina.sort(Comparator.comparing(Pessoa::getNome));
		listaPessoaFeminina.sort(Comparator.comparing(Pessoa::getNome));

			System.out.println("========================= LISTA DE PESSOAS MASCULINAS =========================");
			//System.out.println(listaPessoaMasculina);
		
			
			for(Pessoa p : listaPessoaMasculina) {
				
				System.out.println("Nome: " + p.getNome() + " Genero: " + p.getGenero());
			}
			
			System.out.println("========================= LISTA DE PESSOAS FEMININAS =========================");
			//System.out.println(listaPessoaFeminina);
		
			
			for(Pessoa p : listaPessoaFeminina) {
				
				System.out.println("Nome: " + p.getNome() + " Genero: " + p.getGenero());
			}
		
	}

}
