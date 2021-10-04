
/**
 * Clase Zapatillas
 * 
 * @author Hugo Peña (Academia Universitas) 
 * @version 03/10/2021
 */
public class Zapatillas
{
    // Variables de la clase zapatillas
    private String modelo;
    private Tipo tipo;
    private double valor;
    
    //Métodos de la clase zapatillas
    /**
     * Constructor de la clase Zapatillas
     * @param modelo: Contiene el modelo de las zapatillas
     * @param tipo: Contiene el tipo de las zapatillas: Pueden ser 
     * "agarre" o "amortiguación"
     * @param valor: Contiene el valor de agarre o amortiguacion de las zapatillas
     */
    public Zapatillas(String modelo, Tipo tipo, double valor)
    {
        this.modelo = modelo;
        this.tipo = tipo;
        this.valor = valor;
    }
   
  
    /**
     * Método GET del atributo modelo
     * @return modelo: Modelo de la zapatilla
     */
    public String getModelo(){
        return this.modelo;
    }

    /**
     * Método SET del atributo modelo
     * @param modelo: Modelo de la zapatilla
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    /**
     * Método GET del atributo tipo
     * @return tipo: Tipo de la zapatilla
     */
    public Tipo getTipo(){
        return this.tipo;
    }

    /**
     * Método SET del atributo tipo
     * @param modelo: Tipo de la zapatilla
     */
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    /**
     * Método GET del atributo valor
     * @return valor: Valor de "agarre" o "amortiguacion"
     */
    public double getValor(){
        return this.valor;
    }
    
    /**
     * Método SET del atributo valor
     * @param valor: Valor de "agarre" o "amortiguacion"
     */
    public void setValor(double valor){
        this.valor = valor;
    }
    
    /**
     * Método calcularValorSaque: Calcula el valor de saque de las zapatillas
     * @return valorSaque: Será el doble del atributo valor cuando las zapatillas 
     * sean de tipo "amortiguacion" y serán igual al atributo valor en caso contrario
     */
    public double calcularValorSaque(){
        if(tipo==Tipo.AMORTIGUACION)return this.valor*2;
        else return this.valor;
    }
    
    /**
     * Método calcularValorResto: Calcula el valor de resto de las zapatillas
     * @return valorResto: Será igual a la multiplicacion del atributo valor por
     * 1.5 cuando las zapatillas sean de tipo "agarre" y será igual al atributo
     * valor en caso contrario
     */
    public double calcularValorResto(){
        if(tipo==Tipo.AGARRE) return this.valor*1.5;
        else return this.valor;
    }
}
