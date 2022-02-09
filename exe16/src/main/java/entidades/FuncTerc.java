
package entidades;


public class FuncTerc extends Funcionario{

   private double taxa;

    public FuncTerc(String nome, int horas, double valorHora, double taxaExtra) {
        super(nome, horas, valorHora);
        this.taxa = taxaExtra;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public double pagamento()
    {
        return super.pagamento() + (taxa * 1.1);
    }
    
       
    @Override
    public String toString(){
        return getNome()
                +" - €"+pagamento();
    }
    
    
}
