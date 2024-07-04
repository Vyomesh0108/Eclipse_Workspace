
public class StudentBean 
{
	public int sid;
	public String sna;
	public int sag;
	
	public StudentBean()
	{ }
	
	public String callNext()
	{
		sag= sag+20;
		return "output";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSna() {
		return sna;
	}

	public void setSna(String sna) {
		this.sna = sna;
	}

	public int getSag() {
		return sag;
	}

	public void setSag(int sag) {
		this.sag = sag;
	}

	
	
}
