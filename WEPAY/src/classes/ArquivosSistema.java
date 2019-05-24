
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivosSistema {
    
    public void lerArquivo(String arquivo) throws IOException {
        
           FileReader fr = new FileReader(arquivo);//Abre o arquivo
           BufferedReader br = new BufferedReader(fr);//Faz a leitura do arquivo
                 while (br.ready()) {//enquanto houver mais linhas
                     String linha = br.readLine(); //lê a proxima linha
                     System.out.println(linha);//exibe o conteudo da linha
                 }
                 br.close();//fecha a leitura do arquivo
                 fr.close();//fecha o arquivo
    }
 
    public void escreverArquivo(String informacoes, String texto) throws IOException {
       File arquivo = new File(informacoes+".txt");
       try {
              if (!arquivo.exists()) {//Se não existe um arquivo, o arquivo é criado
                arquivo.createNewFile();//cria um arquivo (vazio)
              } 
              File[] arquivos = arquivo.listFiles();//caso haja um arquivo, é procurado.   
              FileWriter fw = new FileWriter(arquivo, true);//abre o arquivo para a escrita
              BufferedWriter bw = new BufferedWriter(fw);//abre o buffer para escrever no arquivo  
              bw.write(texto+"");//escreve no arquivo 
              bw.newLine();//joga o ponteiro para a proxima linha vazia do arquivo
              bw.close();//fecha o buffer de escrita
              fw.close();//fecha o arquivo
                 
            }catch (IOException ex){
                     ex.printStackTrace();
             }      
        
    }
}
