package CentralMeteorologica;

public class CentralEvent {
    private Dados dados;
    private EstacaoMeteorologica estacao;

    public CentralEvent(EstacaoMeteorologica estacao, Dados dados){
        this.estacao = estacao;
        this.dados = dados;
    }

    public Dados getDados() {
        return dados;
    }

    public EstacaoMeteorologica getEstacao() {
        return estacao;
    }
}
