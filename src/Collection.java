public class Collection {


    public Boolean myContentEquals(String line1, String line2){
        char[] myLine1 = line1.toCharArray();
        char[] myLine2 = line2.toCharArray();
        boolean res = true;
        for (int i = 0; i < line1.length(); i++) {
            if(myLine1[i] != myLine2[i]){
                res = false;
                break;
            }
            else res = true;
        }
        return res;
    }


}
