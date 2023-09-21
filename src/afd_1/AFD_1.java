
package afd_1;

import java.util.Scanner;

public class AFD_1 {
    int CONT ;
    char PALAVRA[];
    public static void main(String[] args) {
        AFD_1 AUT = new AFD_1();
        String SENTENCA;
        Scanner ENTRADA = new Scanner(System.in);
        System.out.println("Insira a entrada para o Autômato: ");
        SENTENCA = ENTRADA.nextLine();
        AUT.PALAVRA = SENTENCA.toCharArray();
        AUT.Iniciar();
   }
    public void Iniciar(){
        CONT = 0;
        q0();
    }
    public void q0(){
        if(CONT < PALAVRA.length){
            if(PALAVRA[CONT] == 'a'){
            CONT++;
            q1();
            } else if (PALAVRA[CONT] == 'c'){
                qf();
            } else {
                qerro();
            }
        } else {qerro();}
    
    }
    public void q1(){
         if(CONT < PALAVRA.length){
            if(PALAVRA[CONT] == 'b'){
            CONT++;
            q2();            
            } else {
                qerro();
            }
        } else {qerro();}
    }
    public void q2(){
         if(CONT < PALAVRA.length){
            if(PALAVRA[CONT] == 'b'){
            CONT++;
            q0();
            } else {
               qerro();
            }
         } else {qerro();}
    } 
    public void qf(){
        System.out.println("Palavra validada com sucesso pelo Autômato! Estado Final.");
    }
    public void qerro(){
        System.out.println("Palavra não passou na validação do Autômato.");
    }
        
    
       
    
}
