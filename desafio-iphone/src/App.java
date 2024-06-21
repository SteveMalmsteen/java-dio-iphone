public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical tocador = new Iphone();
        tocador.tocar();
        AparelhoTelefonico tel = new Iphone();
        tel.ligar("(21) 98765-4321");
        NavegadorInternet browser = new Iphone();
        browser.exibirPagina("www.boadica.com.br");
    }
}
