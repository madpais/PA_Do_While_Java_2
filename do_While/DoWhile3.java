/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile3;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class DoWhile3 {

    public static void main(String[] args) {
    System.out.print("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        
         do{
             System.out.println(N--);
         }
        while(N!=0);
       scanner.close();
        
    }
}