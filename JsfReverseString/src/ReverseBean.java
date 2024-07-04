
public class ReverseBean {

	public String str;
	public String rev="";
	
	public ReverseBean()
	{ }


	public String callRev()
	{
	
		for (int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		return "output";
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}
	
	
	
}

