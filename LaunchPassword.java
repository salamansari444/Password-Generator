package PasswordGenerator;
import java.util.Random;
public class LaunchPassword {

	public static void main(String[] args) {
		String character="abcdefghijklmnopqrstuvwxyz"
						+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
						+ "1234567890!@#$%^&*()";

		String password=" ";
		int length=8;
		
		Random rand=new Random();
		char[] text=new char[length];
		for(int i=0; i<length; i++) {
			
			text[i]=character.charAt(rand.nextInt(character.length()));
			
		}
		for(int i=0; i<text.length; i++) {
			password=password+text[i];
		}
		System.out.println("Random Password are :"+password);
		
		}
	
	
	

	}
