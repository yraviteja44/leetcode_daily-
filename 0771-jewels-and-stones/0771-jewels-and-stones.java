class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map =new HashMap<>();
        char[] s = jewels.toCharArray();
        int c =0;
        char [] n = stones.toCharArray();
        for(char sh : s){
            map.put(sh,1);
        }
        for(char nh:n){
            if(map.containsKey(nh)){
                c++;
            }
        }
        
        return c;
    }
}