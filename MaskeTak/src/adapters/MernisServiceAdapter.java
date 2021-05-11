package adapters;

import java.rmi.RemoteException;

import entities.concretes.Person;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements AdapterService{
	
	@Override
	public boolean checkPerson(Person person){
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result=true;
		try {        
			result = client.TCKimlikNoDogrula(person.getNationalityId(), person.getFirstName().toUpperCase(),
					person.getLastName().toUpperCase(), person.getDateOfBirth().getYear());
		}catch (RemoteException e) {
	         e.printStackTrace();	}
		
		if(result==true)
			System.out.println(person.getFirstName() + " geçerli bir kişi.");
		else
			System.out.println(person.getFirstName() + " geçersiz bir kişi.");
	return result;

}
	
}
