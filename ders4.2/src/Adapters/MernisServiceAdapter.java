package Adapters;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
					,customer.getFirstName().toUpperCase() ,customer.getLastName().toUpperCase()
					,customer.getDateOfBirth().getYear());
			
		}catch(RemoteException e ) {
			System.err.print(e);
			return false;
		}
		
	}

}
