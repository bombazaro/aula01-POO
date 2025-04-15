package ads.poo;

public class Caneta {
    // atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    // métodos
    public void definirCor(String c) {
        cor = c;
    }

    public void definirNivelTinta(double n){
        nivelTinta = n;
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public String isCor(){
        return cor;
    }
}
