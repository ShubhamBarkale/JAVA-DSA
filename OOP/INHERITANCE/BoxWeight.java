public class BoxWeight extends Box{
    double weight;


BoxWeight(BoxWeight other) {
    super(other);
    this.weight = other.weight;
}

    public BoxWeight(double h, double l, double w,double weight){
        super(l,h,w);// what is this ? call the parent class constructor 
        // used to ineatlise values present in parent cass 
        this.weight=weight;
    }
}



// // boxWeight box6=new Box(2,3,5);     gpt this  and check why 
// .