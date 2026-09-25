public class Musica extends Conteudo {

    private String artista;

    //atributos => características
    //private String titulo;
    //private String artista;
    //private int duracao;
    //private int reproducao;
    /*
        tipos primitivos
        char => caractere sempre entre aspas ''
        int => inteiro;
        float/double => decimais;
        boolean => lógico (V/F);
    */

    //construtor
    /*Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.reproducao = 0;
    }*/
    Musica(String titulo, String artista, int duracao){
        super(titulo, duracao);
        if( artista == null || artista.isBlank() ){
            System.out.println("Artista inválido");
            return;
        }
        this.artista = artista;
    }

    //getter e setter
    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        if( artista == null || artista.isBlank() ){
            System.out.println("Artista inválido");
            return;
        }
        this.artista = artista;
    }

   public void exibirInformacoes(){
        System.out.println("=====================================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Duracao: " + getDuracao() + " segundos");
        System.out.println("Reproducoes: " + getReproducao());
        System.out.println("=====================================");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes de musica");
    }

}
