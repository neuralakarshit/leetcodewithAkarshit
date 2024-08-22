class Solution
 {
    public int hammingWeight(int n) 
    {
    // you need to treat n as an unsigned value
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++)
         {
            if ((n & mask) != 0)
            {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
        
    
