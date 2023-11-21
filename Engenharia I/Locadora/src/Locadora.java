import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Filmes> Filmes;

    public Locadora() {
        this.Filmes = new ArrayList<>();
    }

    public void cadastrarFilme(Filmes filme) {
        Filmes.add(filme);
    }

    
    public List<Filmes> buscarFilmePorEspecificacao(Especificacao espec) {
        List<Filmes> filmesEncontrados = new ArrayList<>();

        for (Filmes filmes : Filmes) {
            if (filmes.getEspecifacacao().equals(espec)) {
                filmesEncontrados.add(filmes);
            }
        }

        return filmesEncontrados;
    }


    public Filmes buscarFilmesPorNome(String nome) {
        for (Filmes filmes : Filmes) {
            if (((Filmes) filmes).getNome().equals(nome)) {
                return (Filmes) filmes;
            }
        }

        return null;
        }
}