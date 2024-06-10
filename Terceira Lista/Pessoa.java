
package com.projetos.principal;


public class Pessoa {
   //Adicione os atributos privados nome (String) e idade (int) 
   private String nome;   
   private int idade;
   
   // Crie um construtor que inicialize esses atributos
   public Pessoa(String nome, int idade){
       this.nome=nome;
       this.idade=idade;  
  
 }  
  
   public Pessoa(String nome){ 
       
       this.nome=nome;
       this.idade=0;
       
             
       
  
 } 
     
   //Adicione métodos getNome, setNome, getIdade e setIdade.
   public String getNome(){
   return nome;
   }
   
   public void setNome(String nome){
   this.nome=nome;
   
  // System.out.printf("%n Meu nome e %s%n",nome);
    }
   
     public int getIdade(){
       return idade;  
   
   }     
   
   public void setIdade(int idade){
    this.idade=idade;
  // System.out.printf("%n Minha idade e %d%n",idade);
   
   }
   
   
   
   // Método exibirInformacoes
    public  void exibirInformacoes() {
       System.out.println(" ");
       System.out.println("O nome da pessoa e " + nome);
       System.out.println("A idade da pessoa e " + idade);
    }
    
    
    
    
    
   
    
}
    


   

    



    
    
    
    
    
    
    
    
        

    
   
    
    
    
    
       


    
   
    

