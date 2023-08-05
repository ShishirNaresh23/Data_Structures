public class ArrayMissingEle extends  ArrayMinMax{

    ArrayMissingEle(Integer[] eleArr) {
        super(eleArr);
    }

    public Integer missingEle() {
        int maxEle = super.fetchMax();
        int minEle = super.fetchMin();

        while(minEle < maxEle) {
            for(int ele: super.getIntEleArr()) {
                if(ele == minEle) minEle++;
                else{
                    return minEle;
                }
            }
        }
        return -1;
    }
}
