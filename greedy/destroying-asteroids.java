package greedy;

import java.util.Arrays;

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
    
    Arrays.sort(asteroids);
    long m = mass;
    
    for(int a: asteroids)
    {
    if(a <= m)
    {
    m += a;
    System.out.println(m);
    }
    else
    {
    return false;
    }
    }
    return true;
    }
}