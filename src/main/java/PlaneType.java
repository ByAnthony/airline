public enum PlaneType {

    BOEING747(126, 40000),
    AIRBUSA320(86, 30000);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){ return capacity; }

    public double getTotalWeight(){ return totalWeight; }
}
