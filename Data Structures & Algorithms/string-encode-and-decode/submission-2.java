class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int length = str.length();
            sb.append(length).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        //10#HelloHello5#world
       int i = 0;
        List<String> result = new ArrayList<>();
        while(i < str.length()-1){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != '#'){
                sb.append(str.charAt(i));
                i++;
            }
            int jumps = Integer.parseInt(sb.toString());
            System.out.println(jumps);
            if(str.charAt(i)=='#'){
                String decodedSubString = str.substring(i+1,i+jumps+1);
                result.add(decodedSubString);
                i+=jumps+1;
            }
        }
        return result;
    }
}
