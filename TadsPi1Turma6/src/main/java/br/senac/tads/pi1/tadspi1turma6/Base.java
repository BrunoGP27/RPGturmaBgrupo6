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
public class Base {

    /**
     * @param args the command line arguments
     */
    
    
    static int Entrada(){
        int n1;
        Scanner entrada = new Scanner (System.in);
        n1 = entrada.nextInt();
        return n1;
    }
    
    static int PlayerAC(int n1){
        //PlayerAC = Ações do player
        //ope = onde o player esta //opi = oque o player investigou
        //os
        
        int n2, ope, opi, os;
        boolean lanterna = false;
        
        ope = n1;
        
        System.out.println("---ações---");
        System.out.println("(1)andar");
        System.out.println("(2)investigar");
        System.out.println("(3)inventario");
        System.out.println("oque voce ira fazer?:");
        n2 = Entrada();
        if(n2 <= 0 || n2 >= 5){
            do{
                System.out.println("resposta invalida");
                System.out.println("responda novamente");
                n2 = Entrada();
            }while(n2 <= 0 || n2 >= 4);
        }
        
        switch(n2){
            case 1:
                ope = POI(n1);
                break;
                
            case 2:
                opi = OSPV(n1);
                if(opi == 1){
                    MesaMarcada();
                }
                
        }
        
        return ope;
    }
    
    static int PlayerL(int n1){
        //playerl = luta do player
        int ac;
        System.out.println("voce se depara com essa criatura oque voce faz?");
        System.out.println("(1)bloquear");
        System.out.println("(2)esquivar");
        System.out.println("(3)contra atacar");
        ac = Entrada();
        if(ac <= 0 || ac >= 4){
            do{
                System.out.println("numero invalido");
                ac = Entrada();
            }while(ac <= 0 || ac >= 4);
        }
        if(ac == 1){System.out.println("voce bloquea");}
        if(ac == 2){System.out.println("voce esquiva");}
        if(ac == 3){System.out.println("voce ve uma brecha e ataca ele");}
        
        return ac;
    }
    
    static int POI(int n1){
        //poi = para onde ir
        //ops = onde player esta
        
        int ops = 0;
    
        if(n1 == 1){
            System.out.println("voce anda ate a velha cabana e entra");
            ops = 2;
        }
        
        return ops;
    }
    
    static int OSPV(int n1){
        //OSPV = oque player esta vendo
        //opp = oque player investigou//mesa = 1
        
        int opi = 0;
        
        if(n1 == 2){
            opi = 1;
        }
        
        return opi;
    }
    
    static boolean Lanterna(){
        System.out.println("voce usa a lanterna");
        return true;
    }

    static void MesaMarcada(){
            System.out.println("voces ve uma mesa e emcima dela o numero 9 marcado");
}

    public static void main(String[] args) {
        int x, n1, n2, pv;
        //n1 é em que parte do jogo estamos // pv = pontos de vida
        //1 para o inicio
        pv = 20;
        
        System.out.println("seu carro para de funcionar");
        n1 = 1;
        System.out.println("voce sai dele e avista uma cabana no meio da floresta");
        n1 = PlayerAC(n1);
        System.out.println("voce ve uma mesa e em cima dela tem um numero marcado");
        n1 = PlayerAC(n1);
        System.out.println("uma estranha criatura aparece para e tenta te atacar");
        
        
    }
    
}
        
