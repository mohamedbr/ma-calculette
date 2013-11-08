import java.util.HashMap;


public class Calculatrice {
	private int resultat;
	//private Operation operation = new Addition();
	private int n1;
	private int n2;
	
	public int resultat(){
		return this.resultat;
	}

	public Calculatrice click(int i) {
		this.n2 = n2*10+i;
		this.resultat=this.n2;
		return this;
	}

	public Calculatrice click(String ope) {	 
		this.n1 = this.n2;		
		this.resultat=Operation.forOperator(ope).resultat(this.n1,this.n2);
		this.n2 = 0;
		return this;
	}
}
