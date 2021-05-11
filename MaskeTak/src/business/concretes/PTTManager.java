package business.concretes;

import business.abstracts.ApplicantService;
import business.abstracts.SupplierService;
import entities.concretes.Person;

public class PTTManager implements SupplierService{

	private ApplicantService applicantService;
	
	public PTTManager(ApplicantService applicantService) {
		super();
		this.applicantService = applicantService;
	}
	
	@Override
	public void giveMask(Person person) {
		if(applicantService.checkPerson(person))
			System.out.println(person.getFirstName() + " ki�isine maske verilmi�tir!");
		else
			System.out.println("Ge�ersiz ki�i oldu�undan maske verilmemi�tir!");
			
	}
	
}
