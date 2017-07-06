package application;

public class model {

	public long calc(long num1 , long num2 , String opt)
	{
		
         if(opt.equals("+")){return (num1+num2);}
         if(opt.equals("-")){return (num1-num2);}
         if(opt.equals("*")){return (num1*num2);}
         if(opt.equals("/")){return (num1/num2);}
		return 0;
	}
}
