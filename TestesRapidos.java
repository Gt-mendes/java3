/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class TestesRapidos {
    public static void main(String[] args) {
        // ================================================
        // TESTES RÁPIDOS - STRINGS EM JAVA
        // Complete os testes abaixo substituindo os "???"
        // ================================================
        
        System.out.println("=== TESTES RÁPIDOS - STRINGS ===\n");
        
        // TESTE 1: length()
        String texto1 = "CursodeJAVA";
        int tamanho = texto1.length();  // Complete com o método correto
        System.out.println("1. Tamanho de 'CursodeJAVA': " + tamanho);
        
        // TESTE 2: charAt()
        String palavra = "Java";
        char letra = palavra.charAt (0);  // Pegue o caractere na posição 0
        System.out.println("2. Primeira letra de 'Java': " + letra);
        
        // TESTE 3: substring()
        String texto = "Aprendendo Java";
        String parte = texto.substring(11);  // Extraia "Java" (posição 11 até o fim)
        System.out.println("3. Extraindo 'Java': " + parte);
        
        // TESTE 4: indexOf()
        String frase = "Java é incrível";
        int posicao = frase.indexOf("íncrivel");  // Encontre a posição de "incrível"
        System.out.println("4. Posição de 'incrível': " + posicao);
        
        // TESTE 5: toUpperCase()
        String nome = "joao";
        String maiusculo = nome.toUpperCase();  // Converta para MAIÚSCULO
        System.out.println("5. 'joao' em maiúsculo: " + maiusculo);
        
        // TESTE 6: toLowerCase()
        String sobrenome = "SILVA";
        String minusculo = sobrenome.toLowerCase();  // Converta para minúsculo
        System.out.println("6. 'SILVA' em minúsculo: " + minusculo);
        
        // TESTE 7: trim()
        String comEspacos = "  Java  ";
        String semEspacos = comEspacos.trim();  // Remova os espaços
        System.out.println("7. '  Java  ' sem espaços: '" + semEspacos + "'");
        
        // TESTE 8: equals()
        String senha1 = "admin123";
        String senha2 = "admin123";
        boolean iguais = senha1.equals(senha2);  // Compare se são iguais
        System.out.println("8. Senhas são iguais? " + iguais);
        
        // TESTE 9: replace()
        String telefone = "(11) 99999-8888";
        String numeros = telefone.replace("(", "")
                                 .replace(")", "")
                                 .replace(" ", "")
                                 .replace("-", "");
                               
        System.out.println("9. Telefone limpo: " + numeros);
        
        // TESTE 10: contains()
        String email = "usuario@email.com";
        boolean temArroba = email.contains("@");  // Verifique se contém "@"
        System.out.println("10. Email tem @? " + temArroba);
    }
}