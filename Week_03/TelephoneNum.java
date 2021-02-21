class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> numsMap = new HashMap<>();
        numsMap.put('1', "");
        numsMap.put('2', "abc");
        numsMap.put('3', "def");
        numsMap.put('4', "ghi");
        numsMap.put('5', "jkl");
        numsMap.put('6', "mno");
        numsMap.put('7', "pqrs");
        numsMap.put('8', "tuv");
        numsMap.put('9', "wxyz");
        List<String> results = new ArrayList<String>();
        recursion(digits,0, "", results, numsMap);
        return results;
    }

    void recursion(String digits,int level ,String result, List<String> results,
            HashMap<Character, String> numsMap) {
        if (level == digits.length()) {
            if(level!=0){
                results.add(result);
            }
            return;
        }
        char c = digits.charAt(level);
        String numString = numsMap.get(c);
        for(int i = 0; i < numString.length(); i ++){
            result += numString.charAt(i);
            recursion(digits,level+1, result, results, numsMap);
            result = result.substring(0,result.length()-1);
        }
    }
}