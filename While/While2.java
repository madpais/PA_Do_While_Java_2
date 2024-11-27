/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while2;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class While2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o numero da tabuada");
        int tabuada = scanner.nextInt();
        int contador = 1;
        int resultado;
        
        while (contador <=10) {
        resultado = contador*tabuada;
        System.out.println(tabuada + " X " + contador + " = " + resultado);
        contador ++;    
    }
        scanner.close();
  }
}
