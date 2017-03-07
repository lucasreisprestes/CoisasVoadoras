
public class Voador {
	
	int metrosVoados;
	boolean voando;
	
	public Voador(){
		
	}

	public void voar(int valor){
		setMetrosVoados(valor);
	}
	
	public void pousar(){
		
		setVoando(false);
	}	
	
	public void decolar(){
		
		setVoando(true);
	}
	
	public int getMetrosVoados() {
		return metrosVoados;
	}

	public void setMetrosVoados(int metrosVoados) {
		
		this.metrosVoados = metrosVoados;
	}

	public boolean isVoando() {
		
		return voando;
	}

	public void setVoando(boolean voando) {
		
		this.voando = voando;
	}
	
	

}
