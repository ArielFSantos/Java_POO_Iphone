package com.mycompany.iphone_poo;
import java.util.Scanner;
import Main.ReprodutorMusical;
import Main.AparelhoTelefonico;
import Main.Navegador;
public class IPhone_POO {
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        ReprodutorMusical ReprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico AparelhoTelefonico = new AparelhoTelefonico();
        Navegador Navegador = new Navegador();
        
        
        int choice = 4;
        do{
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Telefonia");
                System.out.println("2 - Internet");
                System.out.println("3 - Musica");
                System.out.println("0 - Sair");
                
                choice = read.nextInt();
                read.nextLine(); 
                
                switch (choice){
                    case 1:{
                        do{
                            System.out.println("Escolha uma opção:");
                            System.out.println("1 - Ligar");
                            System.out.println("2 - Atender");
                            System.out.println("3 - Correio de Vóz");
                            System.out.println("0 - Sair");
                            
                            choice = read.nextInt();
                            read.nextLine(); 

                            switch(choice){
                                case 1:{
                                    AparelhoTelefonico.ligar();
                                    
                                }
                                case 2:{
                                    AparelhoTelefonico.atender();
                                        
                                }
                                case 3:{
                                    AparelhoTelefonico.correio();
                                    
                                }
                            }
                        }while (choice != 0);
                    }
                }
                
        }while (choice != 0);
       
        
        
    
}
}
