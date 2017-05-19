public class Jogo {
    private String timeA;
    private String timeB;
    private int golsTimeA;
    private int golsTimeB;
    private int cartaoAmareloA;
    private int cartaoAmareloB;
    private int cartaoVermelhoA;
    private int cartaoVermelhoB;
    String resultado;

    public Jogo(String timeA, String timeB, int golsTimeA, int golsTimeB, int cartaoAmareloA, int cartaoAmareloB, int cartaoVermelhoA, int cartaoVermelhoB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
        this.cartaoAmareloA = cartaoAmareloA;
        this.cartaoAmareloB = cartaoAmareloB;
        this.cartaoVermelhoA = cartaoVermelhoA;
        this.cartaoVermelhoB = cartaoVermelhoB;
        if(this.golsTimeA > this.golsTimeB) { this.resultado = timeA; }
        else if(this.golsTimeB > this.golsTimeA) { this.resultado = timeB; }
        else { this.resultado = "empate"; }
    }

    public String getTimeA() {
        return timeA;
    }

    public String getTimeB() {
        return timeB;
    }

    public int getGolsTimeA() {
        return golsTimeA;
    }

    public int getGolsTimeB() {
        return golsTimeB;
    }

    public int getCartaoAmareloA() {
        return cartaoAmareloA;
    }

    public int getCartaoAmareloB() {
        return cartaoAmareloB;
    }

    public int getCartaoVermelhoA() {
        return cartaoVermelhoA;
    }

    public int getCartaoVermelhoB() {
        return cartaoVermelhoB;
    }
}
