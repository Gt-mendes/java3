/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

public class ExemploComparacao {
    public static void main(String[] args) {
        String correta = "admin123";
        String digitada = "ADMIN123";
        
        // equals() - diferencia maiúscula/minúscula
        if (correta.equals(digitada)) {
            System.out.println("Login OK!");
        } else {
            System.out.println("Senha incorreta!");
        }
        
        // equalsIgnoreCase() - ignora maiúscula/minúscula
        if (correta.equalsIgnoreCase(digitada)) {
            System.out.println("Login OK (ignorando maiúsculas)!");
        }
        
        // ⚠️ Por que NÃO usar ==
        String a = "Java";
        String b = "Java";
        System.out.println("\nUsando ==: " + (a.equals(b)) + " (ERRADO!)");
        System.out.println("Usando equals(): " + a.equals(b) + " (CORRETO)");
    }
}