
public class Especificacao {

	private int ano;
	private String diretor;
	private String genero;
	
    public Especificacao(int ano, String diretor, String genero) {
        this.ano = ano;
        this.diretor = diretor;
        this.genero = genero;
    }
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
