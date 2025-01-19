public class index {
    public static void findSubSet(String str, String ans, int i){
        // base condition
        if(i == str.length()){
            System.err.println(ans);
            return;
        }
        // yes choice
        findSubSet(str, ans+str.charAt(i), i+1);
        // no choice
        findSubSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);

    }
}
