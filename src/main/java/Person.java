public class Person {
private int quantity;
private String timeUnit;
   public Person (int q) {
       this.quantity = q;
   }
   public Person (int q, String t) {
       this.quantity = q;
       this.timeUnit = t;
   }
    void sleep (){
        System.out.println("персона проспить 15 хвилин");
    }
    void sleep (int quantity){
      System.out.println("персона проспить " + quantity + " хвилин");
        }
    void sleep (int quantity, String timeUnit){
        System.out.println("персона проспить " + quantity + " " + timeUnit);
    }
}
