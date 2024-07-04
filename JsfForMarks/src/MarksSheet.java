
public class MarksSheet 
{

	public int id;
	public String na;
	public int m1,m2,m3,total;
	public float per;
	
	public MarksSheet() 
	{
		
	}

	
	public MarksSheet(int id, String na, int m1, int m2, int m3, int total, float per) {
		super();
		this.id = id;
		this.na = na;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = total;
		this.per = per;
	}
	
	public String next()
	{
		total =m1+m2+m3;
		per =(float)total/3;
		
		return "result";
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNa() {
		return na;
	}


	public void setNa(String na) {
		this.na = na;
	}


	public int getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}


	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	public int getM3() {
		return m3;
	}


	public void setM3(int m3) {
		this.m3 = m3;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public float getPer() {
		return per;
	}


	public void setPer(float per) {
		this.per = per;
	}
	
	
	
}
