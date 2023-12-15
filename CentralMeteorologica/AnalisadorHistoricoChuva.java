package CentralMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorHistoricoChuva implements CentralMeteorologicaListener{
    private List<Double> historicoPressão = new ArrayList<>();
    public double notificarNovaPressao(CentralEvent central, double pressao) {
        if (central.getDados().equals(Dados.CHUVA)){historicoPressão.add(pressao);
            double soma = 0.0;
            for (double pressoes : historicoPressão){
                soma+=pressoes;
            }
            double pressaoFinal = soma/historicoPressão.size();

            return pressaoFinal;
        }
        return 0.0;
    }

    @Override
    public double previsão(CentralEvent centralEvent, double dados) {
        return this.notificarNovaPressao(centralEvent, dados);
    }
}
