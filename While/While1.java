/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while1;
import java.util.Scanner;   

/**
 *
 * @author pedro
 */
public class While1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira numeros inteiros:");
        int number = scanner.nextInt();
        int soma = 0;
        int contpos = 0;
        
        while (number >= 1) {
           contpos += number;
           System.out.println("Digite outro numero:");
           number = scanner.nextInt();
        }
        if (number <=0) {
            System.out.println("Este numero e negativo.");
            return;
        }
        System.out.println("A soma dos numeros dos positivos e " + contpos);
        scanner.close();
    }
}
