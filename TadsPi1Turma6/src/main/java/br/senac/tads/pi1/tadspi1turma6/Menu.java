/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.tadspi1turma6;


import static br.senac.tads.pi1.tadspi1turma6.TrabalhoRPG.PuzzlePorta;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
    public class Menu {

        public static int cenario(){
        
        int min = 1;
        int max = 3;
        
        Random input = new Random();
        
        int value = input.nextInt(max + min) + min;
                
        return value;

    }
        

    //pequeno puzzle para entrar em uma porta
    public static int PuzzlePorta(){
        
        int min = 1;
        int max = 9;
        
        Random input = new Random();
        
        int value = input.nextInt(max + min) + min;
        

        return value;

    }
        
        static int Entrada(){
        int n1;
        Scanner entrada = new Scanner (System.in);
        n1 = entrada.nextInt();
        return n1;
    }
    
    static int PlayerAC(int n1){
        //ope = onde o player esta //opp = oque o player pegou
        int n2, ope, opp;
        boolean laterna = false;
        ope = n1;
        
        System.out.println("---ações---");
        System.out.println("(1)andar");
        System.out.println("(2)investigar");
        System.out.println("(3)pegar item");
        System.out.println("(4)inventario");
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
                
            case 3:
                opp = POI(n1);
                if(opp == 1){
                    System.out.println("voce pegou a lanterna");
                    laterna = true;
                    break;
                }
                
            case 4:
                System.out.println("---=(INVENTARIO)=---");
                System.out.println("");
                
        }
        
        return ope;
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
        
        

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c1;
         do{
            System.out.println("=============================================================================");
            System.out.println("         _  _ _      _   _                          _                  \n" +
"        | \\| (_)__ _| |_| |_ _ __  __ _ _ _ ___    | |   ___  ___ _ __ \n" +
"        | .` | / _` | ' \\  _| '  \\/ _` | '_/ -_)   | |__/ _ \\/ _ \\ '_ \\\n" +
"        |_|\\_|_\\__, |_||_\\__|_|_|_\\__,_|_| \\___|   |____\\___/\\___/ .__/\n" +
"               |___/                                             |_|   \n" +
"                     _____ _             ___                \n" +
"                    |_   _| |_  ___     / __|__ _ _ __  ___ \n" +
"                      | | | ' \\/ -_)   | (_ / _` | '  \\/ -_)\n" +
"                      |_| |_||_\\___|    \\___\\__,_|_|_|_\\___| ");
            System.out.println("==============================================================================");
            System.out.println("                     *--Bem vindos ao menu principal--* \nSelecione uma das opções a seguir.");
            System.out.println("[1] Iniciar jogo");
            System.out.println("[2] Créditos");
            System.out.println("[3] Instruções");
            System.out.println("[4] Sair do jogo");
            c1 = input.nextInt();

        }while(c1 <1 || c1 >4);{
            if(c1 ==1){
            System.out.println("Iniciando o jogo");
            System.out.println("==========================================================================================================================================================");
            //introduçao a o enredo
                System.out.println("Inicio do Jogo \n\n" +
                        "...Acordo de um sono profundo em meu carro com uma leve dor na lateral da minha cabeça, tento identificar o local que estou,mas está escuro demais para ver qualquer coisa.\n "
                        + "A dor é quase como se eu tivesse sido atingido por algo, ainda não sei ao certo o que pode ter acontecido, mas com certeza poderia ter sido pior, afinal,ainda estou consciente.\n "
                        + "Olho em minha volta e não vejo nenhum sinal de vida, tão pouco a estrada a qual me levou até onde estou agora.\n" 
                        + " Ao reparar no capô do meu carro, noto que está saindo fumaça e, apesar dos pesares, isso não me preocupa,  a única coisa que consigo pensar é em como e porque eu fui parar ali.\n"                       
                        + " Em minha volta há apenas pinheiros e em frente ao meu carro há uma construção abandonada.\n "
                        + "Resolvo descer do carro e explorar o local afim de encontrar algo que possa me ajudar a entender o que aconteceu até então.\n"
                        + " Mas antes, preciso pegar meus cigarros e minha lanterna no porta luvas... e, claro, não posso esquecer do meu isqueiro.\n"
                        + " Desço do carro e sigo caminhando em direção a construção abandonada.\n");
            int b,c,a,d,e,f;
                           
            b = cenario();
            
                switch (b) {
                    case 1:
                        System.out.println("Ao me aproximar até o local me deparo com oque parece ser um velho posto abandonado,\n "
                                + "sem muitas opçoes resolvo entrar no local, entao percebo que o a uma velha porta em sua lateral, achei aquilo um pouco estranho entao resolvi ir ate la,\n"
                                + "quando me aproximo percebo que a um velho painel com um codigo bloqueando a porta, talvez eu posso decifrar esse codigo !");
                        int Pp1,Pp2,Pp3; // puzzle porta 1,2,3
        
                        System.out.println("==========================================================================================================================");
                        System.out.println("Neste painel estão os numeros de 1 a 9,talvez se eu acertar um desses números a porta irá se abrir !");
                        Pp2 = PuzzlePorta();
        
                        int cont = 2;
        
                    for(int i=0; i<= 2; i++){
                        System.out.println("\nNúmero:");
                        Pp1 = input.nextInt();

                        if (Pp1 == b){
                            System.out.println("Resposta correta \nA porta começa a se abrir lentamente.");
                            break;
                        }else{
                            System.out.println("Resposta incorreta, Tente novamente...");
                            System.out.println("Voce tem " + cont -- + " chances");
                        }
                        if(cont == -1){
                            System.out.println("\nParece que terei que achar outra maneira de entrar !\n");
                        }       
                    }                                            
                    a = PlayerAC(c1);
                        break;
                        
                    case 2:
                        System.out.println("Cenario 3 Cemiterio");
                        b = PlayerAC(c1);
                        break;
                    case 3:
                        System.out.println("Cenario 4 Floresta");
                        c = PlayerAC(c1);
                        break;
                    default:
                        System.out.println("Cenario 1 igreja ");
                        d = PlayerAC(c1);
                        break;
                    }
            }   
                                                 
            }if(c1 ==2){
                System.out.println("Desenvolvedores: Bruno Goncalves Pinheiro \n" +
                "Renato Souza de Carvalho\n" +
                "Eric Augusto de Jesus Silva\n" +
                "Victor Levenetz Mariano \n\nCentro Universitário Senac\n" +
                "Tecnologia em Analise e desenvolvimento de sistemas\n" +
                "Projeto Integrador I\n" +
                "Prof. Fernando Tsuda");                                
            }if (c1 == 3){
                System.out.println("Neste RPG textual você deverá seguir uma série de desafios para descobrir os mistérios que cercam a floresta.\n" +
                "Você devera explorar o mapa para lidar com alguns inimigos.\n" +
                "Por se tratar de um RPG textual todas as suas ações serão feitas com alguns comandos no seu teclado, que envolvem alguns desafios.\n" +
                "Esperamos que se divirta e descubra todos os segredos de Nightmare Loop the game.");
            }if(c1 == 4) {
                System.out.println("Saindo do jogo...");
                }
        }
}

    

            
