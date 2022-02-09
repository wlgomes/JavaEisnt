
package aplicacao;

import entidades.Funcionario;
import entidades.FuncTerc;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class Programa {
    private static List<Funcionario>listaFuncionarios=new ArrayList<>();
    private static List<FuncTerc>listaFuncTer=new ArrayList<>();
    public static void criaFuncionario(int numFunc){
        
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome=in.nextLine();
        System.out.println("Horas: ");
        int horas=in.nextInt();
        System.out.println("ValorHora: ");
        double valorHora=in.nextDouble();
        Funcionario objFunc =new Funcionario(nome,horas,valorHora);
        listaFuncionarios.add(objFunc);
        
    }
    public static void criaFuncionarioTer(int numFunc){
        
        Scanner in=new Scanner(System.in);
        
        
        System.out.println("Nome: ");
        String nome=in.nextLine();
        System.out.println("Horas: ");
        int horas=in.nextInt();
        System.out.println("ValorHora: ");
        double valorHora=in.nextDouble();
        System.out.println("Despesa Adicional: ");
        double despesaAdicional=in.nextDouble();
        FuncTerc objFunc =new FuncTerc(nome,horas,valorHora,despesaAdicional);
        listaFuncTer.add(objFunc);
        
    }      
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Introduza o numero de funcionarios: ");
        int numFunc=in.nextInt();
        
        for(int x=0;x<numFunc;x++){
          System.out.printf("Dados funcionário %d :\n ",x+1);
          System.out.printf("Terceirizado? (s/n): ");
          String opcao=in.nextLine();
          
          if(opcao=="n"){
              criaFuncionario(x);
          }else{
              criaFuncionarioTer(x);
          }  
        }
        System.out.println("Pagamentos funcionários: ");
        for (Funcionario objFunc : listaFuncionarios ){
            System.out.println(objFunc);
        }
        for (Funcionario objFunc : listaFuncTer ){
            System.out.println(objFunc);
        }
    }
}
    
    
