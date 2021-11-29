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
public class FuncoesPuzzle {
    
    public static int FuncoesPuzzle(){
        int a = 0,b,c,light;
        Scanner input = new Scanner(System.in);
        System.out.println("Assim que voce entra no comeca a escutar algumas risadas, sem entender muito bem oque esta acontecente, decidi seguir o som"
                + "para ver quem estava dando aquela risada."
                + "De repente me deparo com um palhaco assustador vindo em minha direcao, muita assutado resolvi correr... ");
        System.out.println("---ações---");
        
        switch(a){
            case 1:
                System.out.println("[1] Entrar em um quarto escuro");
                break;
            case 2:
                System.out.println("[2] Tentar atacar o inimigo");
                break;
            case 3:
                System.out.println("[3] Correr até um local escuro que parece ser um banheiro");
                do{      
                    System.out.println("========================================================================================================");
                    System.out.println("''Ao prosseguir voce entra em um lugar escuro,e encontra luzes com diferentes potencias jogadas no chao");
                    System.out.println("Mais acima, tambem existe o lugar onde eram para estas luzes estarem.");
                    System.out.println("existe um manual eletrico do ligamento correto das luzes e da energia local''");
                    System.out.println("========================================================================================================");
                    System.out.println(" ''B deve ter a metade da voltagem de D\n" +
                                        "A+B nao devem exceder c\n" +
                                        "a voltagem de D nao deve exceder a de A''");
                    System.out.println("========================================================================================================");
                    System.out.println("Voce se organizando separa as luzes em numeros,1, 2, 3 e 4");
                    System.out.println("Sendo a luz 1 com 125W de potencia");
                    System.out.println("Sendo a luz 2 com 750W de potencia");
                    System.out.println("Sendo a luz 3 com 500W de potencia");
                    System.out.println("Sendo a luz 4 com 250W de potencia");
                    System.out.println("Sabendo que 4 lampadas podem formar 24 combinacoes diferentes \n escolha uma alternativa que indique corretamente de acordo com o manual a potencia das lampadas");
                    System.out.println("1)-1234" +
                                       "      2)-1243" +
                                       "      3)-1324" +
                                       "      4)-1342" +
                                       "      5)-1423" +
                                       "      6)-1432\n" +
                                       "7)-2134" +
                                       "      8)-2143" +
                                       "      9)-2314" +
                                       "     10)-2341" +
                                       "     11)-2413" +
                                       "     12)-2431\n" +
                                       "13)-3124" +
                                       "     14)-3142" +
                                       "     15)-3214" +
                                       "     16)-3241" +
                                       "     17)-3412" +
                                       "     18)-3421\n" +
                                       "19)-4123" +
                                       "     20)-4132" +
                                       "     21)-4213" +
                                       "     22)-4231" +
                                       "     23)-4312" +
                                       "     24)-4321");
            light = input.nextInt();
            }while(light <13 || light >13);{
                if(light ==13){
                System.out.println("Parabens");                                                        
                }         
            } 

    }
        
    return a;
    }
}