package ProdutoEmEstoques;
public class ProdutoEmEstoque {
    private String Nome;
    private float Valor;
    private int Quantidade;
    private float Total;

    private int ValorTotalEstoque;
    private int AdcEstoque;
    private int AttAdcEstoque;
    private int AttDelAdcEstoque;
    private int DelEstoque;

    public int getDelEstoque() {
        return DelEstoque;
    }

    public void setDelEstoque(int delEstoque) {
        DelEstoque = delEstoque;
    }

    public int getAttDelAdcEstoque(int DelEstoque, int AttAdcEstoque) {
        AttDelAdcEstoque = AttAdcEstoque - DelEstoque;
        return AttDelAdcEstoque;
    }

    public void setAttDelAdcEstoque(int attDelAdcEstoque) {
        AttDelAdcEstoque = attDelAdcEstoque;
    }

    public int getAttAdcEstoque(int Quantidade, int AdcEstoque) {
        AttAdcEstoque = Quantidade + AdcEstoque;
        return AttAdcEstoque;
    }

    public void setAttAdcEstoque(int attAdcEstoque) {
        AttAdcEstoque = attAdcEstoque;
    }

    public float getTotal(float Valor, int Quantidade) {
        Total = Valor * Quantidade;
        return Total;
    }

    public int getAdcEstoque() {
        return AdcEstoque;
    }

    public void setAdcEstoque(int adcEstoque) {
        AdcEstoque = adcEstoque;
    }

    public void setTotal(float total) {
        Total = total;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public int getValorTotalEstoque() {
        return ValorTotalEstoque;
    }

    public void setValorTotalEstoque(int valorTotalEstoque) {
        ValorTotalEstoque = valorTotalEstoque;
    }
}


