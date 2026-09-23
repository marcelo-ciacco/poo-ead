public class Podcast extends Conteudo{

    private String apresentador;

    public Podcast(String titulo, String apresentador, int duracao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
    }

    public void exibirInformacoes(){
        System.out.println("=====================================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Duracao: " + getDuracao() + " segundos");
        System.out.println("Reproducoes: " + getReproducao());
        System.out.println("=====================================");
    }

    public String getApresentador(){
        return apresentador;
    }

}
