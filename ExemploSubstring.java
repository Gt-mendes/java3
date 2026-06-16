/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class ExemploSubstring {
    public static void main(String[] args) {
        String texto = "CursodeJAVA";
        
        System.out.println("Texto: " + texto);
        System.out.println("Do índice 3 ao fim: " + texto.substring(3));
        System.out.println("Do índice 2 ao 5: " + texto.substring(2, 5));
        
        // Exemplo prático: extrair domínio do email
        String email = "usuario@email.com";
        int posArroba = email.indexOf("@");
        String dominio = email.substring(posArroba + 1);
        System.out.println("\nEmail: " + email);
        System.out.println("Domínio: " + dominio);
    }
}