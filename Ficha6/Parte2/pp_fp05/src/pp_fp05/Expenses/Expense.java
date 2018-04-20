package pp_fp05.Expenses;

import java.util.Date;

/**
 * @author Isabel Silva
 */
public class Expense {
   /**
    * Numero de identificação da despesa ({@link Expense})
    */ 
    private int number;
    /** 
     * Tipo da despesa ({@link Expense})
     */
    private String type;
    /**
     * Valor da despesa ({@link Expense})
     */
    private float value;
    /**
     * Data da despesa ({@link Expense})
     */
    private Date data;
    /**
     * Tipo de Moeda ({@link Expense})
     */
    private String Moeda;
    /**
     * Metodo construtor para a criação de uma instância de @Expense, tendo por
     * base todos os atributos de despesa ({@link Expense})
     * 
     * @param tempNumber Numero da despesa ({@link Expense})
     * @param tempType Tipo de despesa ({@link Expense})
     * @param tempValue Valor em euros da despesa realizada ({@link Expense})
     * @param tempDate Data({@link Expense}) da despesa realizada
     * ({@link Expense})
     */
    
    Expense(int tempNumber, String tempType, float tempValue, Date tempDate){
        this.number = tempNumber;
        this.type = tempType;
        this.value = tempValue;
        this.data = tempDate;
    }
    Expense(int tempNumber, String tempType, float tempValue, Date tempDate, String currencyType){
        if(currencyType.equals(this.Moeda)){
            this.number = tempNumber;
            this.type = tempType;
            this.value = tempValue;
            this.data = tempDate;
            this.Moeda = currencyType;
        }
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public float getValue() {
        return this.value;
    }

    public Date getData() {
        return this.data;
    }

    public String getMoeda() {
        return this.Moeda;
    }

    public void setMoeda(String Moeda) {
        this.Moeda = Moeda;
    }
    
}
