package WrappersEBAC;

public class Wrappers {
	
	static int idade = 15;
	
	public static void main(String[] args) {
		
		System.out.println("SUA IDADE É: " + idade);
		
		Integer idadeObj = Integer.valueOf(idade);
		
		System.out.println("SUA IDADE EM INTEGER: " + idade);
		
	}

}
