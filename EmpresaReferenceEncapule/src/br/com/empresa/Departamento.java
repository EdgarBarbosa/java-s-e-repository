/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa;

/**
 *
 * @author edgar
 */
public class Departamento {

    private String nome;
    private Pessoa pessoas[];
    private Pessoa vazio[];
    private int posicoesLivres = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoas(String rg) {
        for (int i = 0; (i < pessoas.length - posicoesLivres); i++) {
            if (pessoas[i].getRg().equals(rg)) {
                return pessoas[i];
            }
        }
        return null;
    }

    public void addPessoa(Pessoa pessoa) {
        if (posicoesLivres > 0) {
            pessoas[pessoas.length - posicoesLivres] = pessoa;
            posicoesLivres--;
        } else {
            Pessoa novoArray[] = new Pessoa[pessoas.length + 1];
            novoArray[pessoas.length - posicoesLivres] = pessoa;
            for (int i = 0; i < pessoas.length; i++) {
                novoArray[i] = pessoas[i];
            }
            novoArray[novoArray.length - 1] = pessoa;
            pessoas = novoArray;
        }

    }

    public void removePessoa(Pessoa pessoa) {
        String rgPessoa = pessoa.getRg();
        int i = 0;
        while (i < pessoas.length - posicoesLivres) {
            if (pessoas[i].getRg().equals(rgPessoa)) {
                pessoas[i] = pessoas[pessoas.length - 1 - posicoesLivres];
                pessoas[pessoas.length - 1 - posicoesLivres] = null;
                posicoesLivres++;
                //if(pessoas[0]==null){ pessoas=vazio;}
            }
            i++;
        }
    }

    public void imprime() {

        System.out.println("-------------------------------");
        System.out.println("DEPARTAMENTO:" + nome);
        if (pessoas != null) {
            int i = 0;
            while ((i < pessoas.length)) {
                if (pessoas[i] != null) {
                    System.out.println(pessoas[i].getNome());
                    System.out.println(pessoas[i].getRg());
                } else {
                    System.out.println("posição livre");
                }
                i++;

            }

        } else {
            System.out.println("Departamento vazio");
        }
        System.out.println("-------------------------------");
    }
}
