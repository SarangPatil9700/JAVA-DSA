class Outer{
	class Inner{
		void m1(){
			System.out.println("In M1-Inner");
		}
	}
	void m2(){
		System.out.println("In M2-Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m2();
		Outer.Inner obj1=new Outer().new Inner();
		obj1.m1();
	}
}
