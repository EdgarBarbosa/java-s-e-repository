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
public class TestaDepartamento {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João Marcondes Trindade");
        pessoa1.setRg("55.569.888-4");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Marcos Juarez Cervilha");
        pessoa2.setRg("22.555.895-8");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Cristina Marcelina Dias");
        pessoa3.setRg("42.587.125-4");

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Thiago Avelange Tornelli");
        pessoa4.setRg("11.888.145-1");

        Pessoa pessoasDepartamento[] = {pessoa1, pessoa2, pessoa3};

        Departamento departamento1 = new Departamento();
        Departamento vazio = new Departamento();
        departamento1.setNome("Informática");
        departamento1.imprime();

        departamento1.setPessoas(pessoasDepartamento);
        departamento1.imprime();

        departamento1.imprime();
        departamento1.addPessoa(pessoa4);
        departamento1.imprime();

        departamento1.removePessoa(pessoa1);
        departamento1.imprime();

        departamento1.removePessoa(pessoa3);
        departamento1.removePessoa(pessoa2);
        departamento1.removePessoa(pessoa1);
        departamento1.removePessoa(pessoa4);
        departamento1.imprime();
    }
}
