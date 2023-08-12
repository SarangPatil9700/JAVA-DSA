import java.util.*;

class CricPlayer1{

	int jerNo = 0;
	String pName = null;

	CricPlayer1(int jerNo,String pName){

		this.jerNo = jerNo;
		this.pName = pName;
	}
}
class HashSetDemo{
	public static void main(String[] args){

		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add(new CricPlayer1(18,"Virat"));
		hs.add(new CricPlayer1(7,"Dhoni"));
		hs.add(new CricPlayer1(45,"Rohit"));
		hs.add(new CricPlayer1(7,"Dhoni"));

		System.out.println(hs);
	}
}
