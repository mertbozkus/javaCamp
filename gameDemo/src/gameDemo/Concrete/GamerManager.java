package gameDemo.Concrete;

import gameDemo.Abstract.IGamerService;
import gameDemo.Adapters.GamerValidationService;
import gameDemo.Entities.Gamer;

public class GamerManager implements IGamerService{
	
	private GamerValidationService gamerValidationService;
	
	public GamerManager(GamerValidationService gamerValidationService) {
		this.gamerValidationService = gamerValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerValidationService.validateCheck(gamer)) {
			System.out.println("Mernis dogrulandi. Kayit basarili." + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println("Mernis dogrulanamadi. Kayit basarisiz.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adli oyuncu guncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adli oyuncu silindi.");

	}

}
