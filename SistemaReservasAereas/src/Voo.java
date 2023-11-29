import java.util.ArrayList;

public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private String dataHoraPartida;
    private int numTotalAssentos;
    private ArrayList<String> assentosDisponiveis;

    public Voo(String numeroVoo, String origem, String destino, String dataHoraPartida, int numTotalAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.numTotalAssentos = numTotalAssentos;
        this.assentosDisponiveis = new ArrayList<>();
        for (int i = 1; i <= numTotalAssentos; i++) {
            assentosDisponiveis.add(Integer.toString(i));
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public int getNumTotalAssentos() {
        return numTotalAssentos;
    }

    public int getNumAssentosDisponiveis() {
        return assentosDisponiveis.size();
    }

    public boolean reservarAssento(String assento) {
        if (assentosDisponiveis.contains(assento)) {
            assentosDisponiveis.remove(assento);
            System.out.println("Assento " + assento + " reservado com sucesso.");
            return true;
        } else {
            System.out.println("Assento " + assento + " indisponível.");
            return false;
        }
    }
}

