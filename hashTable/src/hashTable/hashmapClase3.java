package hashTable;

public class hashmapClase3 {

	public static void main(String[] args) {
		HashTable<String, String> paises = new HashTable<>();
		paises.put("Argentina", "Buenos Aires");
		paises.put("Brasil", "Brasilia");
		paises.put("Chile", "Santiago");
		
		String pais = "Argentina";
		String nuevaCapital = "la paz";
		
		if (personas.containsKey(pais)) {
			paises.put(pais, nuevaCapital);
		}
			System.out.println("se actualizo la capital de" + pais + "a" + nuevaCapital +".");
			
		}else {
			System.out.println("el pais ingresado no esta en la lista.");
	}

}
