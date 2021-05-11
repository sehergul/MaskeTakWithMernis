package business.concretes;

import java.util.List;

import adapters.AdapterService;
import business.abstracts.ApplicantService;
import entities.concretes.Person;

public class PersonManager implements ApplicantService{
	
	private AdapterService adapterService;
	
	public PersonManager(AdapterService adapterService) {
		super();
		this.adapterService = adapterService;
	}
	
	@Override
	public void applyForMask(Person person) {}
	
	@Override
	public List<Person> getList(){
		return null;}
	
		
	@Override
	public boolean checkPerson(Person person) {
		if(adapterService.checkPerson(person))
			return true;
		else
			return false;
	}

}
