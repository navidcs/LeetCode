
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
	int n = height.length;
	int maxArea = (Math.min(height[0], height[n-1])*(n-1));
	System.out.println();
	System.out.println(maxArea);
		for (int i = 0 ; i < n - 1 ; ++i){
			for (int j = i + 1 ; j < n ; ++j) {
				if (maxArea < Math.min(height[i],height[j])*(j - i) ){
					maxArea= Math.min(height[i],height[j])*(j - i) ;
				}
			} 	

		}

		return maxArea;
    }
//	public static int min(int a, int b){
//		if (a < b) return a;
//		return b;
//	}
	
	public static void main (String[] args){
		int[] container = new int[40000];
		for (int i = 0; i < container.length; i++) {
			container[i] = i ;
		}
		ContainerWithMostWater cwmwContainerWithMostWater = new ContainerWithMostWater();
		System.out.println(cwmwContainerWithMostWater.maxArea(container));
	}
}
