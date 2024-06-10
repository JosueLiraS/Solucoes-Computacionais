
package com.projetos.principal;



public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(double salario,String departamento, double bonus){
        super(salario, departamento);
        this.bonus=bonus;   
        
      
    }
    
     @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("O Bonus e " + bonus);
    }
    
    @Override
    public void trabalhar() {
        System.out.println("O gerente esta trabalhando.");
    }
    
}

