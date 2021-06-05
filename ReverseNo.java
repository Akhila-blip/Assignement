public class RevesrseNo
{
public static void main(String[]args)
{
  int num = 1234,reverseno= 0;

    while(num != 0) 
{
    
     reverseno=reverseno*10;
     reverseno=reverseno+num%10;
     num=num/10;
    }

    System.out.println("Reverse num: " + reverseno);
  }
}