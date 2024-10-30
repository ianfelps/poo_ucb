public class Juros{

    // atributos
    private double quantia_original, taxa_anual, quantia_deposito;
    private int numero_anos;

    // metodos
    public void setQuantiaOriginal(double quantia){ // setter
        this.quantia_original = quantia;
    }

    public double getQuantiaOriginal(){ // getter
        return this.quantia_original;
    }

    public void setTaxaAnual(double taxa){ // setter
        this.taxa_anual = taxa / 100; // dividir por cem pois o usuario inseriu o valor em %
    }

    public double getTaxaAnual(){ // getter
        return this.taxa_anual;
    }

    public void setNumeroAnos(int anos){ // setter
        this.numero_anos = anos;
    }

    public int getNumeroAnos(){ // getter
        return this.numero_anos;
    }

    public double calcularQuantiaDeposito(){ // metodo para calcular o juros final
        // quantiaFinal = quantiaOriginal * (1 + taxaAnual)^anos
        this.quantia_deposito = this.quantia_original * Math.pow((1 + this.taxa_anual), this.numero_anos);
        return this.quantia_deposito;
    }
}