/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class ExemploLength {
    public static void main(String[] args) {
        String texto = "CursodeJAVA";
        int tamanho = texto.length();
        
        System.out.println("Texto: " + texto);
        System.out.println("Número de caracteres: " + tamanho);
        
        // Uso prático
        String senha = "123456789";
        if (senha.length() >= 8) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha precisa ter 8+ caracteres");
        }
    }
}