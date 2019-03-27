package Program;

public class Dodatkowe {
	public static String[] rozdzielenie(int l, String dane) {
		String[] tablica = new String[l];
		int i, j, io;
		for(i=0;i<l;i++) {
			if(dane.indexOf(",")>-1) {
				io=dane.indexOf(",");
				tablica[i]=dane.substring(0, io);
			}
			else {
				tablica[i]=dane.substring(0, dane.length());
			}
			if(dane.indexOf(",")>-1) {
				io=dane.indexOf(",");
				dane=dane.substring(io+1, dane.length());
			}
		}
		return tablica;
	}
}
