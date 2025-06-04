/**
 * 
 */
package resources;

/**
 * @author Admin
 *
 */
public enum APIResources {




	addBookApi("/Library/Addbook.php"),
	getBookAPi("/Library/GetBook.php"),
	deleteBookApi("/Library/DeleteBook.php");
	
	private String resources;
	
	APIResources(String resources)
	{
		this.resources = resources;
	}
	
	
	public String getResource()
	{
		return resources;
	}


}
