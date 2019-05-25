
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivosSistema {
    
    public void lerArquivo(String arquivo) throws FileNotFoundException, IOException{
        
           FileReader fr = new FileReader(arquivo);//Abre o arquivoSistema
           BufferedReader br = new BufferedReader(fr);//Faz a leitura do arquivoSistema
                 while (br.ready()) {//enquanto houver mais linhas
                     String linha = br.readLine(); //lê a proxima linha
                     System.out.println(linha);//exibe o conteudo da linha
                 }
                 br.close();//fecha a leitura do arquivoSistema
                 fr.close();//fecha o arquivoSistema
    }
 
    public void escreverArquivo(String arquivo, String texto) throws IOException {
       File arquivoSistema = new File(arquivo+".txt");
       try {
              if (!arquivoSistema.exists()) {//Se não existe um arquivoSistema, o arquivoSistema é criado
                arquivoSistema.createNewFile();//cria um arquivoSistema (vazio)
              } 
              File[] arquivos = arquivoSistema.listFiles();//caso haja um arquivoSistema, é procurado.   
              FileWriter fw = new FileWriter(arquivoSistema, true);//abre o arquivoSistema para a escrita
              BufferedWriter bw = new BufferedWriter(fw);//abre o buffer para escrever no arquivoSistema  
              bw.write(texto+"");//escreve no arquivoSistema 
              bw.newLine();//joga o ponteiro para a proxima linha vazia do arquivoSistema
              bw.close();//fecha o buffer de escrita
              fw.close();//fecha o arquivoSistema
                 
            }catch (IOException ex){
                     ex.printStackTrace();
             }      
        
    }
    
    public void apagarArquivo(String arquivo) throws IOException{
        File arquivoSistema = new File(arquivo+".txt");
        if (!arquivoSistema.exists()) {//Se não existe um arquivoSistema, o arquivoSistema é criado
                arquivoSistema.createNewFile();//cria um arquivoSistema (vazio)
        } 
        File[] arquivos = arquivoSistema.listFiles();//caso haja um arquivoSistema, é procurado.   
             FileWriter fw = new FileWriter(arquivoSistema, true);//abre o arquivoSistema para a escrita
             BufferedWriter bw = new BufferedWriter(fw);//abre o buffer para escrever no arquivoSistema 
             FileReader fr = new FileReader(arquivo);//Abre o arquivoSistema
             BufferedReader br = new BufferedReader(fr);//Faz a leitura do arquivoSistema
             while (br.ready()) {//enquanto houver mais linhas  
                     bw.write("");
                     br.readLine();//lê a proxima linha
             }
             bw.newLine();//joga o ponteiro para a proxima linha vazia do arquivoSistema
             bw.close();//fecha o buffer de escrita
             fw.close();//fecha o arquivoSistema
             br.close();//fecha a leitura do arquivoSistema
             fr.close();//fecha o arquivoSistema
    }
    
    public void DeletarArquivo(String arquivo){
        
    }
}
