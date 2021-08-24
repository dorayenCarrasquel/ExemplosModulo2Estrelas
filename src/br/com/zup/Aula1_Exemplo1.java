package br.com.zup;

public class Aula1_Exemplo1 {
    public static void main(String[] args) {
        //Declarando as Variáveis
        int idadeDoUsuario = 18;

        //Printando as variáveis declaradas
        String nomeDoUsuario = "Leticia";
        System.out.print("O nome do usuario é: ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é: ");
        System.out.print(idadeDoUsuario);
        System.out.println(" anos");

        //Printando de forma concatenada as variáveis declaradas
        System.out.print("Olá, menu nome é "+nomeDoUsuario);
    }
}
