/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temastrings;

import java.util.Scanner;

public class DesafioCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF (formato XXX.XXX.XXX-XX): ");
        String cpf = scanner.nextLine();

        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        
        System.out.println("CPF sem formatação: " + cpf);

        scanner.close();
    }
}