// package 9_Recursion.intermediate;

public class index {
    public static int tilingProblen(int n){
        if( n == 0 || n ==1){
            return 1;
        }
        return tilingProblen(n-1)+ tilingProblen(n-2);
    }
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
        if(idx == str.length()){
            System.out.println(sb);
        return;
        }
        char curr = str.charAt(idx);
        if (map[curr-'a'] == true){
            removeDuplicates(str, idx+1, sb, map);
        } else{
            map[curr-'a'] = true;
            removeDuplicates(str, idx+1, sb.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String str = "aappnaacoollege";

        removeDuplicates(str, 0, new StringBuilder("") , new boolean[26]);
      System.out.println( tilingProblen(3));

       
    }
    
}
