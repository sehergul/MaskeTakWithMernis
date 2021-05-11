package business.concretes;

import java.util.List;

import business.abstracts.ApplicantService;
import entities.concretes.Person;

public class ForeignerManager implements ApplicantService{

	@Override
	public void applyForMask(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
