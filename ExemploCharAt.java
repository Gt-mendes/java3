/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class ExemploCharAt {
    public static void main(String[] args) {
        String palavra = "CursodeJAVA";
        
        System.out.println("Palavra: " + palavra);
        System.out.println("Primeira letra (pos 0): " + palavra.charAt(0));
        System.out.println("Quarta letra (pos 3): " + palavra.charAt(3));
        System.out.println("Oitava letra (pos 7): " + palavra.charAt(7));
        
        // Percorrendo todas as letras
        System.out.print("Letras: ");
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + " ");
        }
    }
}