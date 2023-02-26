package classes;

public class Conclustion {
	public static void main(String[] args) {
	System.out.println("--------conclustion1-----------");
	Child ch=new Child();
	ch.foo();
	ch.fooBar();
	System.out.println();
	System.out.println("--------conclustion2-----------");
	Parent p=new Parent();
	p.foo();
	System.out.println();
	System.out.println("-----------conclustion3------------");
	Parent pc=new Child();
	pc.foo();
	System.out.println();
	System.out.println("----------conclustion4--------");
	//Child cp=new Parent();
	System.out.println("nothing is CE: ");
	}
}
