package leitorarquivofuncionarios;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LeitorArquivoFuncionarios {

    public static void main(String[] args) {
        List<Funcionarios> listaFuncionarios = new LinkedList<>();
        File arquivo = new File("dados.txt");
        int idadeTotal = 0;
        int contIdadesGeral = 0;
        double SalariaMulherresMaior25 = 0.0;
        int contIdadesMulheresMaiores25 = 0;
        try {

//faz a leitura do arquivo
            FileReader fr = new FileReader(arquivo);

            BufferedReader br = new BufferedReader(fr);

//equanto houver mais linhas
            while (br.ready()) {
//lê a proxima linha
                Funcionarios funcionario = new Funcionarios();
                funcionario.setNome(br.readLine());
                funcionario.setIdade(Short.parseShort(br.readLine()));
                funcionario.setGenero(br.readLine());
                funcionario.setSalario(Float.parseFloat(br.readLine()));

                listaFuncionarios.add(funcionario);
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (Funcionarios func : listaFuncionarios) {
            
            idadeTotal += (int)func.getIdade();
            contIdadesGeral++;
            if(func.isGenero().contentEquals("feminino") && func.getIdade()>25){
            contIdadesMulheresMaiores25++;
            SalariaMulherresMaior25+=func.getSalario();
                        }
                    }
System.out.println(idadeTotal/contIdadesGeral);
System.out.println(SalariaMulherresMaior25/contIdadesMulheresMaiores25);
    }
}
