import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //making an array of lists
        List<Integer>[] elements = new List[nums.length + 1]; 
        for(int i = 0; i < elements.length; i++)
        {
            //initializing the lists
            elements[i] = new ArrayList<Integer>();
        }

        //count the frequency of each element
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
            {
                map.put(i, map.get(i) + 1);
            }
            else
            {
                map.put(i, 1);
            }
        }

        for(Entry<Integer, Integer> entry: map.entrySet())
        {
            elements[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = elements.length-1; i > 0 && index < k; i--)
        {
            for(int j : elements[i])
            {
                res[index] = j;
                index++;
                if(index == k)
                {
                    return res; 
                }
            }
        }
        return res;
    }
}