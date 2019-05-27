
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosSistema {
    
    public void criarArquivo(String arquivo){
       File arquivoSistema = new File(arquivo+".txt");
       try {
            if(!arquivoSistema.exists()) {//Se não existe um arquivoSistema, o arquivoSistema é criado
              arquivoSistema.createNewFile();//cria um arquivoSistema (vazio)
            }      
       }catch (IOException ex){
              ex.printStackTrace();
       }          
    }
    
    public String lerArquivo(String arquivo) throws FileNotFoundException, IOException{ //Funcao para ler de um arquivo
              FileReader fr = new FileReader(arquivo+".txt");//Abre o arquivoSistema
              BufferedReader br = new BufferedReader(fr);//Faz a leitura do arquivoSistema
              String retorno="";//inicializa o retorno com vazio
              while(br.ready()) {//enquanto houver mais linhas
                String linha = br.readLine(); //lê a proxima linha
                retorno +=linha+"\n";//recebe o texto que foi lido.
                System.out.println(linha);//exibe o conteudo da linha
              }
              br.close();//fecha a leitura do arquivoSistema
              fr.close();//fecha o arquivoSistema
              return retorno;//retorna o texto
    }
 
    public void escreverArquivo(String arquivo, String texto) throws IOException  {//funcao para ercrever em um arquivo
              File arquivoSistema = new File(arquivo+".txt");//Abre o arquivo no sistema
              File[] arquivos = arquivoSistema.listFiles();//caso haja um arquivoSistema, é procurado.   
              FileWriter fw = new FileWriter(arquivoSistema, true);//abre o arquivoSistema para a escrita
              BufferedWriter bw = new BufferedWriter(fw);//abre o buffer para escrever no arquivoSistema  
              bw.write(texto+"");//escreve no arquivoSistema 
              bw.newLine();//joga o ponteiro para a proxima linha vazia do arquivoSistema
              bw.close();//fecha o buffer de escrita
              fw.close();//fecha o arquivoSistema   
    }
    
    public void DeletarArquivo(String arquivo){
      File file = new File(arquivo+".txt");
      if ( file.exists()) {
       file.delete();
      }  
    }
}
