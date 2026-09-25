import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<Conteudo> conteudos;

    public Playlist(String nome){
        if(nome == null || nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
        this.conteudos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarMusica(Musica musica){

        if(musica == null){
            System.out.println("Música Inválida!");
            return;
        }

        conteudos.add(musica);
    }

    public void exibirConteudos(){
        System.out.println("Playlist: " + nome);

        for(Conteudo conteudo : conteudos){
            System.out.println(conteudo.getTitulo() + " - ");
        }
    }

    public void reproduzirConteudo(int indice){

        Conteudo conteudo = conteudos.get(indice);
        conteudo.reproduzir();

    }

}
