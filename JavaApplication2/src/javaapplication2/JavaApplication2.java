/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Gustavo Yamashita Matimoto
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota do 1° bimestre: ");
        double nota1 = sc.nextDouble();
        
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida!");
        }
        else {
            System.out.print("Digite quantidade de falta(s) do 1° bimestre: ");
            int faltas1 = sc.nextInt();
            
            if (faltas1 < 0 || faltas1 == 0) {
                System.out.println("Falta(s) inválida(s)!");
            }
            
            else {
                System.out.print("Digite a nota do 2° bimestre: ");
                double nota2 = sc.nextDouble();
            
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida!");
                }
                
                else {
                    System.out.print("Digite quantidade de falta(s) do 2° bimestre: ");
                    int faltas2 = sc.nextInt();
            
                    if (faltas2 < 0 || faltas2 == 0) {
                        System.out.println("Falta(s) inválida(s)!");
                    }
                    
                    else {
                        System.out.print("Digite a nota do 3° bimestre: ");
                        double nota3 = sc.nextDouble();
            
                        if (nota3 < 0 || nota3 > 10) {
                            System.out.println("Nota inválida!");
                        }
                        
                        else {
                            System.out.print("Digite quantidade de falta(s) do 3° bimestre: ");
                            int faltas3 = sc.nextInt();
            
                            if (faltas3 < 0 || faltas3 == 0) {
                                System.out.println("Falta(s) inválida(s)!");
                            }
                            
                            else {
                                System.out.print("Digite a nota do 4° bimestre: ");
                                double nota4 = sc.nextDouble();
            
                                if (nota4 < 0 || nota4 > 10) {
                                    System.out.println("Nota inválida!");
                                }
                                
                                else {
                                    System.out.print("Digite quantidade de falta(s) do 4° bimestre: ");
                                    int faltas4 = sc.nextInt();
            
                                    if (faltas4 < 0 || faltas4 == 0) {
                                        System.out.println("Falta(s) inválida(s)!");
                                    }
                                    
                                    else {
                                        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
                                        int totalFaltas = faltas1 + faltas2 + faltas3 + faltas4;
                                        
                                        if(mediaNotas >= 7.0 && mediaNotas <= 10.0 && totalFaltas <= 36) {
                                            System.out.printf("Aprovado(a) | nota: %.2f | faltas: %d%n", mediaNotas, totalFaltas);
                                        }
                                        
                                        else if (mediaNotas >= 4.0 && mediaNotas <= 7.0 && totalFaltas <= 36) {
                                            System.out.printf("Exame final | nota: %.2f | faltas: %d%n", mediaNotas, totalFaltas);
                                        }
                                        else if (mediaNotas < 4.0 || totalFaltas > 36) {
                                            System.out.printf("Reprovado(a) | nota: %.2f | faltas: %d%n", mediaNotas, totalFaltas);
                                        }
                                        else {
                                            System.out.println("ERRO!");
                                        }
                                    }
                                } 
                            }
                        }
                    }
                }
            }
        }
    }
}
