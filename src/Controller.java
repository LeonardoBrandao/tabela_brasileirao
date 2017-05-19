// Classe package-private.

class Controller {

    private Tabela tabela;
    private Jogos jogos;

    Controller() {
        this.jogos = new Jogos();
        this.tabela = new Tabela(jogos);
    }
    void mostrarTabela() {
        tabela.mostrarTabela();
    }

    void criarNovaTabela() {
        this.jogos = new Jogos();
        jogos.limparJogos();
        jogos.adicionarJogos();
        this.tabela = new Tabela(jogos);
    }

    void attTabela() {
        jogos.adicionarJogos();
    }
}
