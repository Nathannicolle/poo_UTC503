package interestPoint;

public class TypeLieu extends Lieu {
	private String caption;
	
	public TypeLieu(String caption, String name, int x, int y) {
		super(name, x, y);
		this.caption = caption;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	@Override
	public String toString() {
		return "Type du lieu : " + this.caption;
	}
}
