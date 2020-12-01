
public class FruitCollection {

    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size) {
        if (size <= 0) {
            size = 1;
        }
        fruits = new Fruit[size];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return count == fruits.length;
    }

    public boolean addFruit(String name, double price, int quality) {
        if(price <0 || quality < 1 || quality > 10 || isFull()){
            return false;
        }
        fruits[count++] = new Fruit(name, price, quality);
        return true;
    }

    public Fruit getFruitAt(int slot) {
        if(slot >= 0 && slot < count){
            return fruits[slot];
        }
        return null;
    }

    public int searchForFruitName(String name) {
        if(name == null){
            return -1;
        }
        for(int i=0; i < count;i++){
            if(name.equals(fruits[i].getName()))
                return i;
        }
        return -1;
    }
    public boolean expand(int size){
        if(size <= 0){
            return false;
        }
        Fruit f[] =new Fruit[fruits.length + size];
        System.arraycopy(fruits, 0, f, 0, count);
        fruits = f;
        return true;
    }
}

