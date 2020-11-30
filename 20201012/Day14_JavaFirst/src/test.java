
class aa{
	
}

class bb extends aa{
	
}




public class test {

	public static void main(String[] args) {

		
		byte a=15, b=19;
		
		System.out.println(~a);
		System.out.println(a^b);
		System.out.println(a&b);
		System.out.println(a|b);
		
		int ac = 035, bc=0x35, cc =35;
		System.out.printf("%d\n",ac);
		System.out.printf("%d\n",bc);
		System.out.println(cc);
		
		aa sub = new bb();
	}

}
