/**
 *
 * @author Ephraim e Diogo
 */
public class Func extends Pessoa{
    
    public String carteiraTrab;
    public String setor;
    public int cargaHor;

    
    /**
    *
    * @return String - Carteira de trabalho
    */
    public String getCarteiraTrab() {
        return carteiraTrab;
    }

    /**
    *
    * @param carteiraTrab  String - Carteira de trabalho
    */
    public void setCarteiraTrab(String carteiraTrab) {
        this.carteiraTrab = carteiraTrab;
    }

    /**
    *
    * @return String - Setor onde atua esse trabalhador
    */
    public String getSetor() {
        return setor;
    }

    /**
    *
    * @param setor String - Setor onde atua esse trabalhador
    */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
    *
    * @return int - Carga horaria do funcionario 
    */
    public int getCargaHor() {
        return cargaHor;
    }

    /**
    *
    * @param cargaHor int - Carga horaria do funcionario 
    */
    public void setCargaHor(int cargaHor) {
        this.cargaHor = cargaHor;
    }
    
    
    
}
