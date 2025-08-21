/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeiroProgramaVisualCrud;

/**
 *
 * @author Yonday
 */
public class Clt extends Pessoa {
    
        private final int cpf;
    private double salario;

    public int getCpf() {
        return cpf;
    }

    public Clt(String nome, int idade, double salario, int cpf) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ListaTrabalhadores.Clt{" +
                "salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
