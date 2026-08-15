public class BoxPrice extends BoxWeight {
 double cost;

    BoxPrice() {
        super();
        this.cost =1;
    
    }

  BoxPrice(BoxPrice other){
    super(other);
    this.cost =other.cost;
  }

    public BoxPrice(double cost, double h, double l, double w, double weight) {
        super(h, l, w, weight);
        this.cost = cost;
    }

    
  
}