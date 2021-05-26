package gameDemo.Concrete;

import gameDemo.Abstract.ISaleService;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;
import gameDemo.Entities.Sale;

public class SaleManager implements ISaleService{

	@Override
	public void getId(Sale sale) {
		System.out.println(sale.getGameName() + " oyununu" + sale.getId() + " ID'ye sahip kisi aldi.");
		
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " oyunu satildi.");
		
	}

	@Override
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu" + game.getGameName()
		+ " Adli oyunu aldi." + " Ýndirim Oraný : " + game.getPrice()*campaign.getDiscountAmount()/100);
		
	}

	@Override
	public void update(Gamer gamer, Game game) {
		System.out.println("Satis guncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer, Game game) {
		System.out.println("Satis iptal edildi.");
		
	}

}
