

/**
 *
 * @author Ephraim e Diogo
 */
public class Cliente extends Pessoa{
    
    public double codCliente;
    public String preferencia;
    public String desconto;

    
    /**
    *
    * @return double - codigo do cliente
    */
    public double getCodCliente() {
        return codCliente;
    }

     /**
     * 
     * @param codCliente  double - codigo do cliente
     */
    public void setCodCliente(double codCliente) {
        this.codCliente = codCliente;
    }

    /**
    *
    * @return String - preferencias sobre genêro de filme 
    */
    public String getPreferencia() {
        return preferencia;
    }

     /**
     * 
     * @param preferencia  String - preferencias sobre genêro de filme 
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    /**
    *
    * @return String - Descontos para clientes 
    */
    public String getDesconto() {
        return desconto;
    }

     /**
     * 
     * @param desconto String - Descontos para clientes 
     */
    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }
    
    
    
}
