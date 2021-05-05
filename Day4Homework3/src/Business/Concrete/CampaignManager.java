package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign " + campaign.getName() + " was successfully added!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign " + campaign.getName() + " was successfully updated!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign " + campaign.getName() + " was successfully deleted!");
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

}
