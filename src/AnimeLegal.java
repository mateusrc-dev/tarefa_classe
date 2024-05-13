/**
 *  @author Mateus Carvalho
 *  
 *  @version 1.0
 */
public class AnimeLegal {
	private String nome;
	private String genero;
	private int anoDeLancamento;
	
	/**
	 * This method is important because return the value of variable private
	 * 
	 * @return return this name of animation
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
}
