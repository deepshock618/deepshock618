package Practiceinit;
import java.util.Scanner;

public class EmailCheck {
	
	String emails[]= {"david@gmail.com", "vijay@icloud.com", "harry@yahoo.com", 
	"varsha@hotmail.com", "harish@outlook.com"};
	
	public static void main(String[] args) {
	
	Scanner ss= new Scanner(System.in);
	System.out.println("Enter the email id.");
	String email1=ss.nextLine();
	EmailCheck ec=new EmailCheck();
	ec.emailConfirm(email1);
	}
	
	public void emailConfirm(String em1)
	{
		int flag=0, l=emails.length;
		for(int i=0;i<l;i++)
		{if(em1.equals(emails[i]))
			{flag=1;
			break;
			}
		}
		if(flag==1)
			System.out.println("The email "+em1+" has been found in the array.");
		else
			System.out.println("The email "+em1+" has not been found in the array, please try again.");
	}

}
