public class MusicaoAoVivo extends Musica {

    private String localDoShow;

    MusicaoAoVivo(String titulo, String artista, int duracao) {
        super(titulo, artista, duracao);
    }

    public String getLocalDoShow(){
        return localDoShow;
    }

    public void setLocalDoShow(String localDoShow){
        this.localDoShow = localDoShow;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=====================================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Duracao: " + getDuracao() + " segundos");
        System.out.println("Reproducoes: " + getReproducao());
        System.out.println("Local do Show: " + localDoShow);
        System.out.println("=====================================");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reprodução de musica ao vivo");
    }


}
