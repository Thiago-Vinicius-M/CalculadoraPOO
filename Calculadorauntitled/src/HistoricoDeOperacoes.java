import java.util.ArrayList;
import java.util.List;

public class HistoricoDeOperacoes {
    private List<OperacaoRealizada> operacoes = new ArrayList<>();

    public void adicionar(OperacaoRealizada operacao) {
        operacoes.add(operacao);
    }

}
