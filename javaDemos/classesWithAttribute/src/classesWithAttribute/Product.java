package classesWithAttribute;

public class Product
{
	public Product(int id,String name,String description,Double price,String renk, int stockAmount)
	{
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._renk=renk;
		this._stockAmount=stockAmount;
		
	}
	public Product()
	{
		
	}
	
	//attribute || field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private String _renk;
	private int _stockAmount;
	private String kod;
	
	//getter
	public int getId() 
	{
		return _id;
		
	}
	
	//setter
	public void setId(int id)
	{
		_id=id;
	}
	
	
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String name)
	{
		this._name=name;
	}
	
	
	public String getDescription()
	{
		return _description;
	}
	
	public void setDescription(String description)
	{
		_description=description;
	}
	
	
	public double getPrice()
	{
		return _price;
	}
	
	public void setPrice(Double price)
	{
		_price=price;
	}
	
	
	public String getRenk()
	{
		return _renk;
	}
	
	public void setRenk(String renk)
	{
		_renk=renk;
	}
	
	
	public int getStockAmount()
	{
		return _stockAmount;
	}
	
	public void setStockAmount(int stockAmount)
	{
		_stockAmount=stockAmount;
	}
	
	public String getKod()
	{
		return this._name.substring(0,2) + _id;
	}
	
}
