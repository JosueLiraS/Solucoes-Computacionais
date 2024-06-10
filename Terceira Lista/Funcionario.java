
package com.projetos.principal;


public class Funcionario implements Trabalhador {
    
    protected double salario;
    protected String departamento;
    
    public Funcionario( double salario, String departamento){
    this.salario=salario;
    this.departamento=departamento;
    }
    
    public void exibirInformacoes(){
        System.out.println("O salario e " + salario);
       System.out.println("O departamento e  " + departamento);
}
    @Override
    public void trabalhar() {
        System.out.println("O funcionario esta trabalhando.");
    }
    
    
    
}







