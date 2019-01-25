package laboration7;

public class Table {
	
	private String material;
	private int width, depth, height;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int size() {
		return (getWidth() * getDepth());
	}
	public String toString() {
		return "Table [" + "material = " + this.material + ", width = " + this.width +
				", depth = " + this.depth + ", height = " + this.height + "]";
	}
}
