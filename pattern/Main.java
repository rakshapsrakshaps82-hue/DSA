public class Main {
    public static void main(String[] args) {
 int arr[]={4,9,2,7};
 int Largest= Integer.MIN_VALUE;
 int secondLargest= Integer.MIN_VALUE;
    for(int num:arr){
        if(num>Largest){
            secondLargest=Largest;
            Largest=num;
        }
        else if(num<Largest && num>secondLargest){
            secondLargest=num;
        }

    }
       System.out.println("Largest number is:"+Largest);
       System.out.println("Second largest number is:"+secondLargest);
    }  
} 


    
    

