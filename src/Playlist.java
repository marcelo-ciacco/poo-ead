import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome){
        if(nome == null || nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarMusica(Musica musica){

        if(musica == null){
            System.out.println("Música Inválida!");
            return;
        }

        musicas.add(musica);
    }

    public void exibirMusicas(){
        System.out.println("Playlist: " + nome);

        for(Musica musica : musicas){
            System.out.println(musica.getTitulo() + " - " + musica.getArtista());
        }
    }

    public void reproduzirMusica(int indice){

        Musica musica = musicas.get(indice);
        musica.reproduzir();

    }

}
