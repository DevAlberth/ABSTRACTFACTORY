/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeiroProgramaVisualCrud;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yonday
 */
public class ListaTrabalhadores {
    List<Clt> clts = new ArrayList<>();

    public void addPessoa(String nome,int idade, double salario, int cpf){
        clts.add(new Clt(nome,idade,salario, cpf));
    }

    public void removerPessoa(int cpf){

    Clt pessoaRemover = null;
        for(Clt lt : clts){
            if (cpf == lt.getCpf()){
                pessoaRemover = lt;
                clts.remove(pessoaRemover);
                break;
            }
        }
    }

    public void mostraLista(){
        for (Clt lt : clts){
            System.out.println("Nome: " + lt.nome + "Salario: " + lt.getSalario() + "Cpf: " + lt.getCpf());
        }
    }
    
    
}
