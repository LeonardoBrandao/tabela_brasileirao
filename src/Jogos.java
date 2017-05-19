import java.util.*;

class Jogos {
    private Scanner sc = new Scanner(System.in);
    private List<Jogo> jogos = new ArrayList<>();


    void adicionarJogos() {
        System.out.println("1 - Adicionar jogo pelo console\n2 - Ler arquivo de jogos");
        String opt = sc.nextLine();
        int op = Integer.parseInt(opt);
        if(op == 1) {
            while (true) {
                System.out.println("Digite o time A (mando de campo): ");
                String timeA = sc.nextLine();
                System.out.println("Digite o time B: ");
                String timeB = sc.nextLine();
                System.out.println("Digite o numero de gols do time A: ");
                int golsTimeA = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o numero de gols do time B: ");
                int golsTimeB = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o numero de cartoes amarelos do time A: ");
                int cartAmarA = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o numero de cartoes amarelos do time B: ");
                int cartAmarB = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o numero de cartoes vermelhos do time A: ");
                int cartVermA = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o numero de cartoes vermelhos do time B: ");
                int cartVermB = Integer.parseInt(sc.nextLine());

                Jogo jogo = new Jogo(timeA, timeB, golsTimeA, golsTimeB, cartAmarA, cartAmarB, cartVermA, cartVermB);

                jogos.add(jogo);

                System.out.println("Continuar Adicionando? [y/N]");
                String cont = sc.nextLine();

                if(cont.equals("N") || cont.equals("n")){
                    break;
                }
            }
        }
//          else {
//            //TODO ler arquivo
//        }
    }

    List<Jogo> retornarJogosTime(String time){

        List<Jogo> jogosTime = new ArrayList<>();

        for(Jogo jogo: jogos) {
            if(jogo.getTimeA().equals(time) || jogo.getTimeB().equals(time)){
                jogosTime.add(jogo);
            }
        }
        return jogosTime;
    }

    List<String> getJogos() {
        List<String> clubes = new ArrayList<>();
        for(Jogo jogo: jogos) {
            if(!clubes.contains(jogo.getTimeA())) {
                clubes.add(jogo.getTimeA());
            }
            if(!clubes.contains(jogo.getTimeB())) {
                clubes.add(jogo.getTimeB());
            }
        }
        return clubes;
    }

    void limparJogos() {
        jogos.clear();
    }
}
