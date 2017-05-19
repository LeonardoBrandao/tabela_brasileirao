import java.util.ArrayList;
import java.util.List;

public class Tabela {

    private List<Time> times = new ArrayList<>();
    private Jogos jogos;

    public Tabela(Jogos jogos) {
        this.jogos = jogos;
        List<String> clubes = jogos.getJogos();
        for(String clube: clubes) {
            times.add(new Time(clube, jogos));
        }
    }

    public void mostrarTabela() {
        List<String> clubes = jogos.getJogos();
        times.clear();
        for(String clube: clubes) {
            times.add(new Time(clube, jogos));
        }


        String leftAlignFormat = "| %-7s | %-25s | %-5d | %-8d | %-2d | %-2d | %-4d | %-6d |%n";

        System.out.println();
        System.out.format("+---------+---------------------------+-------+----------+----+----+------+--------+%n");
        System.out.format("| Posição | Time                      | Jogos | Vitórias | GP | GC |  SG  | Pontos |%n");
        System.out.format("+---------+---------------------------+-------+----------+----+----+------+--------+%n");
        for(Time time: times) {

            System.out.format(
                    leftAlignFormat,
                    times.indexOf(time)+1,
                    time.getNome(),
                    time.getPartidas(),
                    time.getVitorias(),
                    time.getGols(),
                    time.getGolsSofridos(),
                    time.getSaldoGols(),
                    time.getPontos()
                    );
        }
        System.out.format("+---------+---------------------------+-------+----------+----+----+------+--------+%n\n");

    }
}
