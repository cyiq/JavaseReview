package cyiq.oop;
/**
 * @author CYIQ
 */
class Father{
	public static String str1 = "public static str1 -- Father";
	public String str3 = "public str3 -- Father";
	public void fun1(){
		System.out.println("public fun1() : - Father");
		fun2();
	}
	protected void fun2() {
		System.out.println("protected function -- Father");
	}
}
class Son extends Father{
	public  String str1 = "public  str1 -- Son";
	public String str3 = "public str3 -- Son";
	//protected void fun1(){}   error
	public void fun1(){
		System.out.println("public fun1() : - Son");
		fun2();
	}
	
	public void fun2(){
		System.out.println("public function -- Son");
	}
}

public class ExtendsTest1 {
	public static void main(String[] args) {
		Father f1 = new Son();
		f1.fun1();
		System.out.println(f1.str1);
		System.out.println(f1.str3);
		System.out.println("******************");
		Son s1 = new Son();
		s1.fun1();
		System.out.println(s1.str1);
		System.out.println(s1.str3);
	}
}
