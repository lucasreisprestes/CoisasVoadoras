
public class Superman extends Voador{
	
	boolean clarkKent;
	
	public Superman(){
		
	}
	
	public void disfarcar(){
		
		setClarkKent(true); 
	}
	
	public boolean isClarkKent() {
		return clarkKent;
	}

	public void setClarkKent(boolean clarkKent) {
		this.clarkKent = clarkKent;
	}

	public void serHeroi(){
		
		setClarkKent(false);  
	}
	
	public void voar(int valor){
		
		setMetrosVoados(valor * 5);
	}

}
