/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class ExemploTransformacao {
    public static void main(String[] args) {
        String texto = "   Java é Incrível   ";
        
        System.out.println("Original: '" + texto + "'");
        System.out.println("trim(): '" + texto.trim() + "'");
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        
        // replace() - limpar telefone
        String telefone = "(11) 99999-8888";
        String numeros = telefone.replace("(", "")
                                 .replace(")", "")
                                 .replace("-", "")
                                 .replace(" ", "");
        System.out.println("\nTelefone: " + telefone);
        System.out.println("Apenas números: " + numeros);
    }
}