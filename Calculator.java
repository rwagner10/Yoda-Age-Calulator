import java.util.Scanner;
public class Calculator {
	
	   public static void main(String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      double yodaYears;
	      double humanYears;
	      boolean answer = true;
	      int ask; 
	      int counter=0;
	      System.out.println("Welcome to the Yoda Age Calculator. \nType the age of a yoda specimen to find out it's age in human years. \n--------------------------------------------------------------------");
	      while (answer) {
	      System.out.println("Age of Yoda:");
	      yodaYears = scnr.nextDouble();
	      humanYears = yodaYears / 11.25;
	      if (humanYears <= 0)
	      	{
	    	  	humanYears = 0;
	      	}
	      System.out.print("A ");
	      System.out.print(yodaYears);
	      System.out.print(" year old yoda is about a ");
	      System.out.print(humanYears);

	      System.out.println(" year old human.");
	      System.out.println("Do you want to calculate another age for yoda? 1 = yes and 0 = no");
	      ask = scnr.nextInt();
	    	 if (ask == 1)
	    	 {
	    		 answer = true;
	    		 counter++;
	    	 }
	      else 
	      {
		   answer = false;
	      }
	     }//end of while
	      if (counter >= 2)
	      System.out.println("Thank you for Using Yoda Age Calculator! \n Hmm... Full Yoda Easter Egg, You've Unlocked! \n"+ "               	    ____\r\n" + 
	      		"                 _.' :  `._\r\n" + 
	      		"             .-.'`.  ;   .'`.-.\r\n" + 
	      		"    __      / : ___\\ ;  /___ ; \\      __\r\n" + 
	      		"  ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\r\n" + 
	      		"  :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\r\n" + 
	      		"       `:-.._J '-.-'L__ `-- ' L_..-;'\r\n" + 
	      		"         \"-.__ ;  .-\"  \"-.  : __.-\"\r\n" + 
	      		"             L ' /.------.\\ ' J\r\n" + 
	      		"              \"-.   \"--\"   .-\"\r\n" + 
	      		"             __.l\"-:_JL_;-\";.__\r\n" + 
	      		"          .-j/'.;  ;\"\"\"\"  / .'\\\"-.\r\n" + 
	      		"        .' /:`. \"-.:     .-\" .';  `.\r\n" + 
	      		"     .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.\r\n" + 
	      		"  .+\"-.  : :      \"-.__.-\"      ;-._   \\\r\n" + 
	      		"  ; \\  `.; ;                    : : \"+. ;\r\n" + 
	      		"  :  ;   ; ;                    : ;  : \\:\r\n" + 
	      		" : `.\"-; ;  ;                  :  ;   ,/;\r\n" + 
	      		"  ;    -: ;  :                ;  : .-\"'  :\r\n" + 
	      		"  :\\     \\  : ;             : \\.-\"      :\r\n" + 
	      		"   ;`.    \\  ; :            ;.'_..--  / ;\r\n" + 
	      		"   :  \"-.  \"-:  ;          :/.\"      .'  :\r\n" + 
	      		"     \\       .-`.\\        /t-\"\"  \":-+.   :\r\n" + 
	      		"      `.  .-\"    `l    __/ /`. :  ; ; \\  ;\r\n" + 
	      		"        \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/\r\n" + "\n May the force be with you" );
	      else
	      {
	    	  System.out.println("Thank you for Using Yoda Age Calculator!\n Hmm... A Easter Egg, You Seem to Have Missed. \n"+ "               	    ____\r\n" + 
	  	      		"                 _.' :  `._\r\n" + 
	  	      		"             .-.'`.  ;   .'`.-.\r\n" + 
	  	      		"    __      / : ___\\ ;  /___ ; \\      __\r\n" + 
	  	      		"  ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\r\n" + 
	  	      		"  :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\r\n" + 
	  	      		"       `:-.._J '-.-'L__ `-- ' L_..-;'\r\n" + 
	  	      		"         \"-.__ ;  .-\"  \"-.  : __.-\"\r\n" + 
	  	      		"             L ' /.------.\\ ' J\r\n" + 
	  	      		"              \"-.   \"--\"   .-\"\r\n" + 
	  	      		"             __.l\"-:_JL_;-\";.__\r\n" + "\n May the force be with you" );
	      }
}//end of main
}//end of class
	