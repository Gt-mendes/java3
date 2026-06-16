/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

import java.util.Scanner;

public class DesafioNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        nome = nome.trim();
        
        int posicao = nome.indexOf(" ");
        
        String primeiroNome = nome.substring(0, posicao);
        String sobrenome = nome.substring(posicao + 1);
        
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Sobrenome: " + sobrenome);
        // Seu código aqui...

        scanner.close();
    }
}