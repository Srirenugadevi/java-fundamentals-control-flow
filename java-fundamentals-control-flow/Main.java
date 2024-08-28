import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	      System.out.println(a);
	    if(a>0){
	    System.out.println("Positive Number");}
	    else if(a<0){
	    System.out.println("Negative Number");}
	    else{
	    System.out.println("Zero");}
	    
	    switch(a){
	        case 1:{
	            System.out.println("Sunday");
	            break;
	        }
	        case 2:{
	            System.out.println("Monday");
	            break;
	        }
	        case 3:{
	            System.out.println("Tuesday");
	            break;
	        }
	        case 4:{
	            System.out.println("Wednesday");
	            break;
	        }
	        case 5:{
	            System.out.println("Thursday");
	            break;
	        }
	        case 6:{
	            System.out.println("Friday");
	            break;
	        }
	        case 7:{
	            System.out.println("Saturday");
	            break;
	        }
	        default:{
	            System.out.println("Invalid Number");
	        }
	    }
	    for(int i=1;i<=a;i++){
	        System.out.println(i+" ");
	    }
	    while(a!=0){
	        System.out.println(a+" ");
	        a--;
	    }
	    int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 3);
	}
}