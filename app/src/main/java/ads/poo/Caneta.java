package ads.poo;

public class Caneta {
    // atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private String desenhar;

    // métodos
    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }

    public void definirNivelTinta(double n) {
        nivelTinta = (n > 100 || n < 0) ? 100 : n;
    }

    public double obterNivelTinta() {
        return nivelTinta;
    }

    public void abrirFechar() {
        aberta = !aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String desenhar(int d) {
        if (aberta) {
            StringBuilder desenho = new StringBuilder();
            for (int i = 0; i < d; i++) {
                if (nivelTinta > 9) {
                    desenho.append("_ ");
                    nivelTinta = nivelTinta - 10;
                } else {
                    return desenho.toString();
                }
            }
            return desenho.toString();
        } else {
            return "";
        }
    }
}
