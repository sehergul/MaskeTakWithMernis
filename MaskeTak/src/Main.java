import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import business.concretes.PTTManager;
import business.concretes.PersonManager;
import entities.concretes.Person;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1));
		
		PTTManager pttManager = new PTTManager(new PersonManager(new MernisServiceAdapter()));
		pttManager.giveMask(person);
	}

}
