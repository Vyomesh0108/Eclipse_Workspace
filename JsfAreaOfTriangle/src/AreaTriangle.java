
public class AreaTriangle 
{ 
	public float height;
	public float base;
	public float area;
	
	public AreaTriangle() {
		
	}
	
	public AreaTriangle(float height, float base, float area) {
		super();
		this.height = height;
		this.base = base;
		this.area = area;
	}
	
	public String call()
	{
		area = height * base / 2;
		
		return "output";
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	

}
