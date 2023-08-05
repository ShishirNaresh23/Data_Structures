public class ArrayMinMax {

    private final Integer[] intEleArr;
    private Integer minEle;
    private Integer maxEle;
    ArrayMinMax(Integer[] eleArr) {
        this.intEleArr = eleArr;
    }

    public Integer[] getIntEleArr() {
        return intEleArr;
    }

    public Integer fetchMax() {
        int maxEle = 0;
        for(int ele: this.intEleArr){
            if(ele > maxEle) maxEle = ele;
        }
        this.maxEle = maxEle;
        return maxEle;
    }

    public Integer fetchMin() {
        int minEle = this.maxEle != null ? this.maxEle : this.fetchMax();
        for(int ele: this.intEleArr){
            if(ele < minEle) minEle = ele;
        }
        return minEle;
    }

}
