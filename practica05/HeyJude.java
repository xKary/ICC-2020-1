public class HeyJude {
    
    public static void main (String[] args){
	String hey = "Hey Jude,";
	
	String  dont = "don't";
	
	String make_bad = "make it bad";
	String be = "be afraid";
	String down = "let me down";
	String take = "Take a sad song and make it better";
	String were = "you were made to go out and get her";
	String found = "you have found her, now go and get her";

	String remember = "remember to";
	String heart = "let her into your heart";
	String skin = "let her under your skin";

	String then = "then you";
	String start = "can start";
	String begin = "begin";
	String make_better = "to make it better";
	String better = "better";

	String na = "na";

	int p = 0;
	int c = 0;

	while (p <7){
	   if( p == 0 || p == 1 || p == 3 || p == 5){
	    System.out.print("\n" + hey + " " + dont + " ");
	     if(p == 0 || p == 5){
		System.out.println(make_bad);
		System.out.println(take);
	     }else{
		 if (p == 1){ 
		     System.out.println(be);
		     System.out.println(were);
		 }else{
		     System.out.println(down);
		     System.out.println(found);
		 }
	     }
	     System.out.print(remember + " ");
	     if (p == 0 || p == 3){
		 System.out.println(heart);
		 System.out.println(then  + " " + start + " " + make_better );	
	     }else{
		 System.out.println(skin);
		 System.out.println(then  + " " + begin + " " + make_better );
		 if(p == 5){
		     while(c < 6){
			 System.out.print(better + " ");
			 c ++;
		     }
		     c = 0;
		     System.out.println("oh");
		 }
	     }
	   }else{
	      System.out.println(" ");
	       while(c<11){
		   System.out.print(na + " ");
		   c ++;
	       }
	       if (p == 6)
		   System.out.print(hey);
	       System.out.println(" ");
	       c = 0;
	   }
	   p ++;
	}
	
	
	
	
    }
}
