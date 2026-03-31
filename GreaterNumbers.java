public class GreaterNumbers{

    public static void main(String[] args){

        int a = 0;
        int b = 0;
        int c = 30;

        if(a>b && a<c){
           System.out.println("a is greater than b "); 
        } 
        else if(b>a && b<c){
            System.out.println("b is greater than a ");
        }
        else if(c>a && c>b){
            System.out.println("c is greater than a and b ");
        }
        else{
            System.out.println("No Greater Numbers");
        }

    }
}
