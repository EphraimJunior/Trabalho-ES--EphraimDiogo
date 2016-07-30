
/**
 *
 * @author Ephraim e Diogo
 */
public class Filme {

public String nome;
public int ano;
public int classificacao;


    /**
    *
    * @return String - nome do filme
    */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome String - nome do filme
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
    *
    * @return int - ano de lançamento do filme 
    */
    public int getAno() {
        return ano;
    }
    /**
    *
    * @param ano int - ano de lançamento do filme 
    */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /**
    *
    * @return int - Classificação do filme  
    */
    public int getClassificacao() {
        return classificacao;
    }
    
    
     /**
    *
    * @param classificacao  int - Classificação do filme 
    */
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }


   
    
}
