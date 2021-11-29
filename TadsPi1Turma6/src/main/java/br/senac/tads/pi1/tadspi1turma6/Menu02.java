/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.tadspi1turma6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Menu02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();{
        int c1, randomize;
         do{      
            System.out.println("==================================");
            System.out.println("[[[[Looping Nightmare The Game]]]]");
            System.out.println("==================================");
            System.out.println("Bem vindos ao menu do jogo, \n por favor selecione uma das opções a seguir.");
            System.out.println("1) ---: Iniciar jogo");
            System.out.println("2) ---: Carregar jogo");
            System.out.println("3) ---: Créditos");
            System.out.println("4) ---: Sair do jogo");
            c1 = input.nextInt();
        }while(c1 <1 || c1 >4);{
            if(c1 ==1){
                System.out.println("Iniciando o jogo"); 
                randomize = gerador.nextInt(4);
        //imprime um numero inteiro aleatórios entre 0 e 4 totalizando 5 numeros
        // e o 1 indica quantos numeros serao imprimidos na funcao
        for (int i = 0; i < 1; i++) { 
        }if (randomize == 0) 
                System.out.println("cenario 1");{
                
        }if (randomize == 1)
                System.out.println("cenario 2");{
        }if (randomize == 2)
                System.out.println("Cenario 3");{
        }if (randomize == 3)
                System.out.println("Cenario 4");{
            
        
         
    
            }if(c1 ==2){
                System.out.println("Carregando jogo");
            }if(c1 ==3) {
                System.out.println("Jogo desenvolvido pelo grupo 6");
            if(c1 ==1){
                System.out.println("Iniciando o jogo");               
            }if(c1 ==2){
                System.out.println("Carregando jogo");
            }if(c1 ==3) {
                System.out.println("Jogo desenvolvido pelo grupo 6");
            }if(c1 ==4) {
                System.out.println("Saindo do jogo");
            }
            }
            }
        }
    }
    }
}