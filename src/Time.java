import java.util.List;

public class Time {

    private int vitorias;
    private int pontos;
    private int gols;
    private int golsSofridos;
    private int saldoGols;
    private int cartoesA;
    private int cartoesV;
    private String nome;
    private int partidas;

    Time(String time, Jogos todosJogos) {
        List<Jogo> jogos = todosJogos.retornarJogosTime(time);

        this.nome = time;
        this.partidas = jogos.size();

        for(Jogo jogo: jogos) {
            if(jogo.getTimeA().equals(time)) {
                this.gols += jogo.getGolsTimeA();
                this.golsSofridos += jogo.getGolsTimeB();
                this.cartoesA += jogo.getCartaoAmareloA();
                this.cartoesV += jogo.getCartaoVermelhoA();
            } else {
                this.gols += jogo.getGolsTimeB();
                this.golsSofridos += jogo.getGolsTimeA();
                this.cartoesA += jogo.getCartaoAmareloB();
                this.cartoesV += jogo.getCartaoVermelhoB();
            }

            if(jogo.resultado.equals(time)) { this.pontos += 3; this.vitorias += 1; }
            else if(jogo.resultado.equals("empate")) { this.pontos += 1; }

        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getPontos() {
        return pontos;
    }

    public int getGols() {
        return gols;
    }

    public int getCartoesA() {
        return cartoesA;
    }

    public int getCartoesV() {
        return cartoesV;
    }

    public String getNome() {
        return nome;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public int getSaldoGols() {
        return gols-golsSofridos;
    }
}
