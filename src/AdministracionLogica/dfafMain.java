package AdministracionLogica;




public class dfafMain {
	
	public static boolean esVocal(char c) {
		
		String vocales = "aeiou";
		
		if (vocales.indexOf(c) == -1) {
			return false;
		}
		return true;
		
	}
	
	
	public static String laMar(String s) {
		
		if (s.isEmpty()) {
			return s;
		}
		if (esVocal(s.charAt(0))) {
			return 'a' + laMar(s.substring(1));
		}
		
			return s.charAt(0) +""+ s.charAt(0) + laMar(s.substring(1));
	}

	public static void main(String[] args) {
		
		System.out.println(laMar("Serena"));
		
		
	}
}





