package timecomplexity;

public class FrogJump {
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int z = Y - X;
		
        int r = (int)(z / D);
        
        if (z % D != 0) {
            r++;
        }
        return r;
    }
}
