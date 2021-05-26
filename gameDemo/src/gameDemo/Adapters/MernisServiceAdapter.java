package gameDemo.Adapters;

import java.rmi.RemoteException;

import gameDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerValidationService{

	@Override
	public boolean validateCheck(Gamer gamer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(gamer.getNationalityID(),
					gamer.getFirstName(),
					gamer.getLastName(),
					gamer.getDateOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	
	}

}
