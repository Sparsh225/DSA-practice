class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List<String> list=new ArrayList<>();
            return list;
        }else{
        return helper(digits);
        }
        }
   static String[] phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   public static List<String> helper(String digits){
       if(digits.length() ==0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
       char firstchar = digits.charAt(0);
        int currentval=firstchar-'0';
        String phonenum=phone[currentval];
        String remstr=digits.substring(1);
        List<String> result=new ArrayList<>();
        for(int i=0;i<phonenum.length();i++){
              List<String> temp=helper(remstr);
              for(String s: temp){
                  result.add(phonenum.charAt(i)+s); //1->['d','e','f']
              }
        }     
        return result;
    }
}
