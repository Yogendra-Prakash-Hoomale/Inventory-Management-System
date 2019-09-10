/**
 * 
 */

/**
 * @author Winchesters
 *
 */
public class Item {
	
	
			
	/*static attribute*/
	private static int totalItem = 0;
	
	/*attributes*/
	private String Name;
	private String Description;
	private String Category;
	private String Supplier_Name;
	private int Supplier_Contacts;
	private double Price;
	private int Available_Quantity;
	private String Item_Id;
	
	public Item() {
		/*constructors*/
		/**
		 * default constructor
		 */
		this.Name = null;
		this.Description = null;
		this.Category = null;
		this.Supplier_Name = null;
		this.Supplier_Contacts = 0;
		this.Price = 0;
		this.Available_Quantity = 0;
		this.Item_Id = null;
		settotalItem(gettotalItem() + 1); //incrementing the count to track number  of objects created 
	}
	
	/**
	 * 
	 * @param Name of item
	 * @param Description of item
	 * @param Category of item
	 * @param Supplier_Name of item
	 * @param Supplier_Contacts of item
	 * @param Price of item
	 * @param Available_Quantity of item
	 * @param Item_Id of item
	 */
	public Item(String Name, String Description, String Category, String Supplier_Name, int Supplier_Contacts, double Price, int Available_Quantity, String Item_Id) {
		this.Name = Name;
		this.Description = Description;
		this.Category = Category;
		this.Supplier_Name = Supplier_Name;
		this.Supplier_Contacts = Supplier_Contacts;
		this.Price = Price;
		this.Available_Quantity = Available_Quantity;
		this.Item_Id = Item_Id;
		
	}
	
	/*Behaviours*/
	/*Getters*/
	/**
	 * @return the counter
	 */
	public static int gettotalItem() {
		return totalItem;
	}

	/**
	 * @return the name of the item
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @return the description of the item
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @return the category of the item
	 */
	public String getCategory() {
		return Category;
	}

	/**
	 * @return the supplier_name for the item
	 */
	public String getSupplier_Name() {
		return Supplier_Name;
	}

	/**
	 * @return the supplier_contacts for the item
	 */
	public int getSupplier_Contacts() {
		return Supplier_Contacts;
	}

	/**
	 * @return the price of the item
	 */
	public double getPrice() {
		return Price;
	}

	/**
	 * @return the available_quantity of the item 
	 */
	public int getAvailable_Quantity() {
		return Available_Quantity;
	}

	/**
	 * @return the item_Id
	 */
	public String getItem_Id() {
		return Item_Id;
	}

	/*setters*/
	
	/**
	 * @param counter the counter to set
	 */
	public void settotalItem(int totalItem) {
		Item.totalItem = totalItem;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		Category = category;
	}

	/**
	 * @param supplier_Name the supplier_Name to set
	 */
	public void setSupplier_Name(String supplier_Name) {
		Supplier_Name = supplier_Name;
	}

	/**
	 * @param supplier_Contacts the supplier_Contacts to set
	 */
	public void setSupplier_Contacts(int supplier_Contacts) {
		Supplier_Contacts = supplier_Contacts;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		Price = price;
	}

	/**
	 * @param available_Quantity the available_Quantity to set
	 */
	public void setAvailable_Quantity(int available_Quantity) {
		Available_Quantity = available_Quantity;
	}

	/**
	 * @param item_Id the item_Id to set
	 */
	public void setItem_Id(String item_Id) {
		Item_Id = item_Id;
	}
	
	@Override
	public String toString() {
		return "Item [Name=" + Name + ", Description=" + Description + ", Category=" + Category + ", Supplier_Name="
				+ Supplier_Name + ", Supplier_Contacts=" + Supplier_Contacts + ", Price=" + Price
				+ ", Available_Quantity=" + Available_Quantity + ", Item_Id=" + Item_Id + "]";
	}

	public boolean equals(Item i) {
		if(this.Item_Id.equalsIgnoreCase(i.Item_Id)) {
			return true;
		}
		else {
			return false;}
	}
	
	public  String findItemByCat() {
		return "Item [Name=" + Name + ", Description=" + Description + ", Category=" + Category
				+ ", Supplier_Name=" + Supplier_Name + ", Supplier_Contacts=" + Supplier_Contacts + ", Price="
				+ Price + ", Available_Quantity=" + Available_Quantity + ", Item_Id=" + Item_Id + "]";
	}
	
	public  void totalItem() {
		System.out.println("totalItem");
	}
	
	
}
