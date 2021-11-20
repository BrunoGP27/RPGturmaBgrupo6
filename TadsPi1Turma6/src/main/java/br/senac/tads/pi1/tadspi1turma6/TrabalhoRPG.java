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
public class TrabalhoRPG {

    //pequeno puzzle para entrar em uma porta
    public static int PuzzlePorta(){
        
        int min = 1;
        int max = 9;
        
        Random input = new Random();
        
        int value = input.nextInt(max + min) + min;
        
        
        return value;

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("=============================================================");
        System.out.println("aparentemente tem um pequeno painel nessa porta com 9 numeros,\ntalvez se eu acertar um desses números a porta irá se abrir !");
        b = PuzzlePorta();
        
        int cont = 2;
        
        for(int i=0; i<= 2; i++){
            System.out.println("\nNúmero:");
            a = input.nextInt();
            
            if (a == b){
                System.out.println("Resposta correta \nA porta começa a se abrir lentamente.");
                break;
            }else{
                System.out.println("Resposta incorreta, Tente novamente...");
                System.out.println("Voce tem " + cont -- + " chances");
            }
            if(cont == -1){
                System.out.println("\nParece que terei que achar outra maneira de entrar");
            }
        }
    }
    
}

