public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar Música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar Música: " + musica);
    }

}
