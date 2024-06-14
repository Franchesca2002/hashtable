package hashTable;

public class hashtableClase2 {

	public static void main(String[] args) {
		HasTable<String, Integer> personas = new hashtable<>();
		personas.put("Juan", 25);
		personas.put("Maria", 35);
		personas.put("Pedro", 20);
		
		String nombre "Maria";
		
		if (personas.containsKey(nombre)) {
			System.out.println(nombre + "tiene" + personas.get(nombre)+ "años.");
			
		}else {
			System.out.println("No se encontro a" + nombre + "en la lista.");
			
		}
		

	}

}
