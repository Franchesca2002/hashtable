package hashTable;

public class hashtableClase1 {

	public static void main(String[] args) {
		HashTable<String, Double> frutas = new HashTble<>();
		frutas.put("Manzana", 1.50);
		frutas.put("Banana", 0.75);
		frutas.put("Naranja", 0.60);
		
		String fruta= "Banana";
		
		if (frutas.containsKey(fruta)) {
			frutas.remove(fruta);
			System.out.println(fruta + "fue eliminada de la lista");
			
		}else {
			System.out.println("la fruta ingresada no esta en la lista");
		}

	}

}
