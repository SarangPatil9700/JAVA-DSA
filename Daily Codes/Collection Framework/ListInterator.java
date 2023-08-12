import java.util.*;

class ListIteratorDemo{

	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add(30.5f);
		al.add("C2W");

		ListIterator litr = al.listIterator();

		while(litr.hasNext()){
			System.out.println(litr.next());

		}
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}
}
