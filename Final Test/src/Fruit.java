public class Fruit {
    private String name;
    private double price;
    private int quality;
    
    public Fruit(String name,double price,int quality){
        if(name==null){
            this.name="";
        }else{
            this.name=name;
        }
        
        if(price<0.0){
            this.price=0.0;
        }else{
            this.price=price;
        }
        
        if(quality<1){
            this.quality=1;
        }else if(quality>10){
            this.quality=10;
        }else{
            this.quality=quality;
        }
    }
    
    public String getName(){
        return name;
}
    
    public double getPrice(){
        return price;  
    } 
    
    public int getQuality(){
        return quality;
    }
    
    public boolean equals(Fruit f){
       if(f!=null && this.name.equals(f.name) && this.price == f.price && this.quality==f.quality){
           return true;
       } else{
           return false;
       }
    }
    
    public int compareTo(Fruit f){
        if (f==null){
            return 1;
        }
        int val = this.quality-f.quality;
        return (val>0) ? 1:(val<0) ? -1:0;
    }

    @Override
    public String toString() {
        return String.format("%s(%.2f,quality:%d)", name,price,quality);
    }
 
}
