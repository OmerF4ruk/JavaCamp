package Adapters;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

import Abstract.IUserCheckService;
import Entities.User;

public class MernisServiceAdapter implements IUserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId())
					,user.getFirstName().toUpperCase() ,user.getLastName().toUpperCase()
					,user.getDateOfBirth().getYear());
			
		}catch(RemoteException e ) {
			System.err.print(e);
			return false;
		}
		
	}

}
