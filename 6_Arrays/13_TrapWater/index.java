
public class index {
    public static int Trapwaterfun(int height[] ) {
        int n = height.length;
        // Calculate the left boundary
        int leftMax [] = new int[n];
        leftMax[0]= height[0];
        // loop 
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
         //Calculate the right boundary
         int rightMax[]= new int[n];
         rightMax[n-1] = height[n-1];
         for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }
         int trapWater = 0;
         int width =1;
         //loop 
         for (int i = 0; i < n; i++) {
            //waterlevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapper water = waterLevel - height[i]
             trapWater += waterLevel- height[i];
         }
         return trapWater;
    }
    public static void main(String[] args) {
        int height []={4, 2, 0, 6, 3, 2, 5};
       System.out.println(Trapwaterfun(height)) ;
    }
    
}
