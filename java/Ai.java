import java.util.Scanner;
import org.junit.Test;

/***
 * 
 * ��ֵʮ�ڵ��˹����ܴ���
 * 
 */

public class Ai {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str=null;
		while(true) {
			str=sc.next();
			str= str.replace("��", "");
			str= str.replace("?", "!");
			System.out.println(str);
			
		}
		
	}
	

}
