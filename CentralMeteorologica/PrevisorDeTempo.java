package CentralMeteorologicar;

import java.util.ArrayList;
import java.util.List;

public class PrevisorDeTempo implements CentralMeteorologicaListener {
    private List<Double> historicoTemperatura = new ArrayList<>();

    public double notificarNovaTemperatura(CentralEvent central, double temperatura) {
        if (central.getDados().equals(Dados.TEMPO)) {
            historicoTemperatura.add(temperatura);
            double soma = 0.0;
            for (double temperaturas : historicoTemperatura) {
                soma += temperaturas;
            }
            return soma / historicoTemperatura.size();
        }
        return 0.0;
    }
    @Override
    public double previsão(CentralEvent centralEvent, double dados) {
        return this.notificarNovaTemperatura(centralEvent,dados);
    }
}
