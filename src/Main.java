//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Musica musica1 = new Musica("Numb","Linking Park", 325);

    Musica musica2 = new Musica("Imagine", "John Lennon", 180);

    Podcast podcast1 = new Podcast("Palestra POO", "prof. Marcelo", 1000);

    Conteudo conteudo1 = new Conteudo("Conteudo de Audio", 300);

    MusicaoAoVivo musica3 = new MusicaoAoVivo("Tempo Perdido", "Legião Urbana Couver", 280);
    musica3.setLocalDoShow("São Paulo");

    Playlist favoritas = new Playlist("Favoritas");
    Playlist play2 = new Playlist("   ");

    favoritas.adicionarMusica(musica1);
    favoritas.adicionarMusica(musica2);
    favoritas.adicionarMusica(new Musica("Musica x", "Artista y", 233));

   // favoritas.reproduzirMusica(1);

    favoritas.adicionarMusica(musica3);
    favoritas.exibirMusicas();

    //musica1.setTitulo(" ");

    //musica1.setTitulo("NUMB");
    //System.out.println(musica1.getDuracao());

   // musica1.exibirInformacoes();

 //   musica2.reproduzir();
 //   musica1.reproduzir();
 //   musica1.reproduzir();

 //   musica2.exibirInformacoes();
  //  musica3.exibirInformacoes();

}
