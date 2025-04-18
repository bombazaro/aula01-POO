package ads.poo;

public class App {
    public static void main(String[] args) {
        Caneta bic = new Caneta();

        //Define a cor
        bic.definirCor("Preto");

        //Coloca o nivel de tinta em 100
        bic.definirNivelTinta(100);

        //Fala qual a cor da caneta
        System.out.println(bic.obterCor());

        //abre a caneta
        bic.abrirFechar();

        //desenha e adiciona a quantidade de _
        System.out.println(bic.desenhar(1));
        System.out.println(bic.desenhar(6));
        System.out.println(bic.desenhar(5));

        //mostra o nível de tinta
        System.out.println(bic.obterNivelTinta());

    }
}
