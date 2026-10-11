import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=new Random().nextInt(100)+1;
        int b=0;
        for(int i=7;i>=1;i--){
            System.out.print("Select a number between 1 to 100:");
            int a = sc.nextInt();
            if (a==n){
                System.out.println("you won");
                b=1;
                break;
            }else if (a<n){
                System.out.println("too low!");
                System.out.println("attempt left:"+(i-1));
            }else{
                System.out.println("too high!");
                System.out.println("attempt left:"+(i-1));
            }
        }if (b==0){
            System.out.println("you lost,the guess was:"+n);
        }
    
    }
}