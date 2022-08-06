package string;

public class Demo {
	public static void main(String[] args) {
	      StringBuffer s=new StringBuffer("abcdefg");
	     //append

	     s.append("hijk");
	      System.out.println(s);
	     //insert
	      s.insert(2, "lkh");
	      System.out.println(s);
	      
	      //replace
	      s.replace(2, 5, "java");
	      System.out.println(s);
	      
	     String sb="abcdefgh";
	     //string to reverse
	     String str="";
	     for(int i=sb.length()-1;i>=0;i--) {
	    	 str=str+sb.charAt(i);
	     }
	    System.out.println(str);
		
	    StringBuffer sbb=new StringBuffer(sb);
	    sbb.reverse();
	   String newL=sbb+"";
	     
	     
	}

}
