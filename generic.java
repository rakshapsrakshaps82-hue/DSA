public class generic {
    public static  <t> void swap (t a, t b) {
        t temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b); 
        return;

    }
    public static void main(String[] args) {
        swap(10,    20);
    }
}
    

