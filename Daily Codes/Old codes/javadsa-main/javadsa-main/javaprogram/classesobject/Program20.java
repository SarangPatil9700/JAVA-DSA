class Demo{
        int x=10;
        Demo(){
                System.out.println("In No Argument Constructor");
        }
        Demo(int x){
		this();
                System.out.println("In Parametrized Constructor");
        }
        public static void main(String[] args){
                Demo obj2=new Demo(50);
        }
}
