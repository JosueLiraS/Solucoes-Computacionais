

package com.projetos.principal;



import com.projetos.principal.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              
        
        
      Empresa empresa=new Empresa();
    
       empresa.adicionarTrabalhador(new Gerente (90,"Leandro",909));      
       empresa.adicionarTrabalhador(new Funcionario(98,"Operacional"));
   
    
   
    ArrayList<Pessoa> listapessoa = new ArrayList<>();
    listapessoa.add(new Pessoa("Luiza"));
    listapessoa.add(new Pessoa("Isabel", 7));   
    listapessoa.add(new Estudante("Maria", 23, "Engenharia"));
    listapessoa.add(new Estudante("Felipe", 45, "Matematica"));
    
    
    
    
     for (Pessoa pessoas : listapessoa) {
            pessoas.exibirInformacoes();
        }
   
   
    System.out.println("  ");
    
    ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
    listaVeiculo.add(new Carro());
    listaVeiculo.add(new Moto());
    
    for(Veiculo veiculo: listaVeiculo ){
    veiculo.mover();
    }
    
    
    
   

    
    
   
   
    
    
    
    
    
    
  
        
        
      
     
      
      
       
       
       
        
       
}
    
     
    
    
}
