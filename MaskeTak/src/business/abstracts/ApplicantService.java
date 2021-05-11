package business.abstracts;

import java.util.List;

import entities.concretes.Person;

public interface ApplicantService {

	void applyForMask(Person person);
	List<Person> getList();
	boolean checkPerson(Person person);
	
}
