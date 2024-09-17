package edu.luiz.segundasemana;
// public class MinhaClasse {
//     public static void main(String[] args) {
//         final String BR = "Brasil"; // não pode ser alterado
//         int ano  = 2021; // pode ser alterado

//     }
// }

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Luiz";
        String segundoNome = "Eduardo";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}