abstract class Parent{
        void carrer(){
                System.out.println("IT Engineer");
        }

        abstract void marry();
}

class Child extends Parent{

	void marry(){
		System.out.println("Shruti");
	}
}

class Client{
        public static void main(String[] args){

                Child obj=new Child();
		obj.carrer();
		obj.marry();
        }
}
