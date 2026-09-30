public class AnuncioAudio implements Reproduzivel {

    private String mensagem;

    public AnuncioAudio(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }

    @Override
    public void reproduzir() {
        System.out.println("Publicidade: " + mensagem);
    }
}
