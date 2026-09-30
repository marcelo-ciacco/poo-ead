import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<Reproduzivel> itens;

    public Playlist(String nome){
        if(nome == null || nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarItem(Reproduzivel reproduzivel){
        itens.add(reproduzivel);
    }

    /*public void adicionarMusica(Musica musica){

        if(musica == null){
            System.out.println("Música Inválida!");
            return;
        }

        itens.add(musica);
    }*/

   /* public void exibirConteudos(){
        System.out.println("Playlist: " + nome);

        for(Reproduzivel reproduzivel : itens){
            //System.out.println(conteudo.getTitulo() + " - ");
        }
    }*/

   /* public void reproduzirConteudo(int indice){

        Conteudo conteudo = conteudos.get(indice);
        conteudo.reproduzir();

    }*/

    public void reproduzirLista(){

        System.out.println("Playlist: " + nome);

        for(Reproduzivel item : itens){

          /*  if(item instanceof AnuncioAudio anuncio){
                System.out.println("ANUNCIANDO O LOJISTA: " + anuncio.getMensagem());
            }*/

            item.reproduzir();

           /* if(item instanceof Conteudo conteudo){
                System.out.println("Quantidade já reproduzida" + conteudo.getReproducao());
            }*/

        }

    }

}
