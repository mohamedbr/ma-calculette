import java.util.HashMap;


public abstract class Operation {
	public abstract int resultat(int operande1,int operande2);
	
	public static Operation forOperator(String operation){
		HashMap<String,Operation> operations = new HashMap<String,Operation>();
		operations.put("+",new Addition());
		operations.put("-",new Soustraction());
		operations.put("=",new NullOperation());
		operations.put("*",new NullOperation());
		operations.put("/",new NullOperation());
		return operations.get(operation);
	}

}
