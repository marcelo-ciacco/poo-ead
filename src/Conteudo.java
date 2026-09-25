public abstract class Conteudo {

    private String titulo;
    private int duracao;
    private int reproducao;

    public Conteudo(String titulo, int duracao){
        if( titulo == null || titulo.isBlank() ){
            System.out.println("Título inválido");
            return;
        }
        this.titulo = titulo;

        if( duracao <= 0 ){
            System.out.println("Duração inválido");
            return;
        }
        this.duracao = duracao;

        this.reproducao = 0;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo: " + titulo);
        reproducao++; //reproducao = reproducao + 1
    }

    public void reproduzir(int quantidade){
        if(quantidade <= 0){
            System.out.println("Quantidade inválida");
            return;
        }

        for( int i=0; i < quantidade; i++){
            reproduzir();
        }
    }

    public abstract void exibirDetalhes();

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public int getReproducao(){
        return reproducao;
    }

}
