




public class FinalTest {
    public static void main(String[] args) {
        Fruit a=new Fruit("apple", 10.5, 5);
        Fruit b=new Fruit("Banana", 34, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        
        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("cherry", 40, 4);
        fc.expand(1);
        int s = fc.searchForFruitName("Date");
        if (s>=0){
            System.out.println(fc.getFruitAt(s));
        }
        
       
      
    }
}
