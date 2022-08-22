/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progSist2_aplicando2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author rsd14
 */
public class TestaArquivo2 {
    public static void main(String[] args){
        try{
            InputStreamReader isr;
            BufferedReader br;
            try (InputStream is = new FileInputStream("alunos.txt")) {
                isr = new InputStreamReader(is);
                br = new BufferedReader (isr);
                String linha;
                ArrayList<Double> notas;
                notas = new ArrayList<>();
                int i = 0;
                while(i!=5){
                    linha = br.readLine();
                    String vetString[];
                    vetString = linha.split(";");
                    notas.add(Double.valueOf(vetString[2]));
                    /*if(null == linha){
                    break;
                    }*/
                    i++;
                }
                Double somatoria = 0.0;
                Double mediaSala = 0.0;
                for (int j = 0; j < notas.size(); j++){
                    somatoria += notas.get(j);
                }
                mediaSala = somatoria / notas.size();
                System.out.println("Media das notas = "+mediaSala);
                for (int k = 0; k < notas.size(); k++){
                    if(notas.get(k)>= mediaSala)
                        System.out.println("Nota maior ou igual a media => "+notas.get(k));
                }
                
            }
            isr.close();
            br.close();
        }
        catch(IOException ex){
                System.out.println("Erro na abertura do arquivo");
        }
        System.out.println("Fim de programa");
    }
}
