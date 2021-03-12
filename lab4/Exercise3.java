package labbook.lab4;

abstract class Items{
	private long id ;
	private String title;
	private long numberOfCopies;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(long numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	public Items(long id, String title, long numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (id != other.id)
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public void print() {
		
	}
	public void checkIn() {
		
	}
	public void checkOut() {
		
	}
	public void addItem() {
		
	}
	
}
abstract class WrittenItem {
	
}
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
