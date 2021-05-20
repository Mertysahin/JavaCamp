package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Sales;
import Entities.User;

public interface SalesService 
{
	public void Order(Sales sales, Game game, User user);
	public void CancelOrder(Sales sales, Game game, User user);
	public void UpdateOrder(Sales sales, Game game, User user);
	public void CampaignSale(Sales sales, Game game, User user,Campaign campaign);
}
