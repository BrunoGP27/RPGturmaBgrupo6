/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.tadspi1turma6;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Puzzle2 {

    //puzzle para derrotar o 1 inimigo
    
    public static int puzzleCemiterio(){
        
        
        int x = 4;
        int y = 10;
        int z = 13;
        int w = 0;
        
        w = x+y+z;
         
        return w;
        
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Ao entrar no cemiterio me deparei com uma grande sepultura, quando me aproximei do portão da sepultura, escutei vozes de criaças pedindo socorro, "
                + "\nassutado com a situação decidi me aproximar do local para investigar melhor oque estava acontecendo.");
        System.out.println("Então percebo que o portao esta trancada, com um cadeado. \nlogo acima do cadeado esta um pequena nota com a seguinte frase, "
                + "'O INDIVIDUO QUE ESTA NESTE TÚMULO, DEVERA PAGAR POR TODOS OS PECADOS DOS DEMAIS' ");  
        System.out.println("==========================================================================================================================");
        System.out.println("Você então decide explorar o cemiterio, e encontra os seguintes túmulos");                               
        System.out.println("Túmulo 1, Alfred XIII");
        System.out.println("Túmulo 2, Jason IV");
        System.out.println("Túmulo 3, Ronald XIII");
        System.out.println("==========================================================================================================================");
        System.out.println("Para abrir o cadeado voce deve fazer a soma dos numeros.");
        
        int a,b,c;
        System.out.println("Digite a resposta");
        a = input.nextInt();
        b = puzzleCemiterio();
        
        if (a == b){
            System.out.println("Certa resposta, o cadeado se destranca e o portão se abre!");
        }else{
            System.out.println("A porta não abre");
        }
            
    }
}
    

                
            
        
