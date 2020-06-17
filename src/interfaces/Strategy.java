package interfaces;

public interface Strategy {

    // Metodo pra realizar o pagamento. Retorna se foi realizado com sucesso ou não.
    public boolean payment(double value);
}
