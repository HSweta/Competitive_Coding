package L15_String;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "hello";
		
		String s1 = "hello";
		
		String s2 = new String("bye");
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(1)); // e
		System.out.println(str.charAt(3)); // l
		
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.substring(0,4));//substring create in heap as new keyword used in substring function
	
		//concat
	    String st1="hi";
	    String st2="bye";
	    String st3=st1+st2; //heap
	    System.out.println(st1+", "+st2+", "+st3);
	    String st4 = st1.concat(st2); //heap
	    System.out.println(st1+", "+st2+", "+st4);
	    
	    // starts with
	    System.out.println(str.startsWith("hel"));
	    System.out.println(str.startsWith("Hel"));
	    
	    //ends with
	    System.out.println(str.endsWith("lo"));
	    System.out.println(str.endsWith("Lo"));
	    
	    //index of
	    System.out.println(str.indexOf("ll"));
	    System.out.println(str.lastIndexOf("l"));
	    
	    //equals and ===
	    st1="Hello";
	    st2=st1;
	    st3="Hello";
	    st4=new String("Hello");
	    
	    System.out.println((st1==st2)+", "+st1.equals(st2));
	    System.out.println((st1==st3)+", "+st1.equals(st3));
	    System.out.println((st1==st4)+", "+st1.equals(st4));// st4 in heap and st1 in stack so == false
	    
	    String s10 = str.replace("l", "w");//heap
	    String s11 = str.replace("q", "w");//no q present so no change will be
	    
	    System.out.println(s10);
	    System.out.println(s11);
	    
	    String t = "     hiiii      ";
	    t = t.trim();
	    System.out.println(t);
        
	    long start = System.currentTimeMillis();
	    append();
	    long end = System.currentTimeMillis();
	    
	    System.out.println(end-start);
	    
	}
	public static  void append() {
		
		int n=100000;
		
		String str = "";
		for (int i = 0; i <=n; i++) {
			str+=i;
		}
		
	}

}
