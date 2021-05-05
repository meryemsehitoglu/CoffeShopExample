package adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap Client = new KPSPublicSoapProxy();
	
		boolean result = true;
		try {
			
				result = Client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(new Locale("tr")),customer.getLastName().toUpperCase(new Locale("tr")),customer.getDateOfBirth().getYear());
			
			
			
			}catch (RemoteException e) {
				
				e.printStackTrace();
			}
		
		System.out.println(result);
		
		return result;
	}

}
