package Program;
import java.io.IOException;
import java.util.*;

public class Start {

	public static void main(String[] args){
		int a, b;
		boolean koniec=true;
		while(koniec) {
			System.out.println("Witam w bibliotece.");
			System.out.println("Menu:");
			System.out.println("1. Operacje na uzytkownikach.");
			System.out.println("2. Operacje na ksiazkach.");
			System.out.println("3. Wypozyczenia i zwroty.");
			System.out.println("4. Wyjscie.");
			System.out.print("Wybor: ");
			Scanner wczytaj = new Scanner(System.in);
			a = wczytaj.nextInt();
			switch(a) {
			case 1:
				System.out.println("Operacje na uzytkownikach:");
				System.out.println("1. Dodaj uzytkownika.");
				System.out.println("2. Usun uzytkownika.");
				System.out.println("3. Status uzytkownika.");
				System.out.print("Wybor: ");
				b = wczytaj.nextInt();
				switch(b) {
				case 1:
					Uzytkownicy.Dodawanie();
					break;
				case 2:
					Uzytkownicy.Usuwanie();
					break;
				case 3:
					Uzytkownicy.Wypisanie();
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("Operacje na ksiazkach:");
				System.out.println("1. Dodaj ksiazke.");
				System.out.println("2. Usun ksiazke.");
				System.out.println("3. Wyszukaj ksiazki.");
				break;
			case 3:
				System.out.println("Wypozyczenia i zwroty:");
				System.out.println("1. Zwrot ksiazki.");
				System.out.println("2. Wypozyczenie ksiazki.");
				break;
			case 4:
				System.out.println("Do widzenia.");
				koniec = false;
				break;
			default:
				System.out.println("Brak opcji!");
				break;
			}
		}
	}
}
/*
File file = new File("C:\\Users\\st506\\Desktop\\nazwiska.txt");
List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
for(String line : a) {
	zmien(line);
}
*/