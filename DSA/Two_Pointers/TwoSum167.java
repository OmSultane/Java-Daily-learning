package DSA.Two_Pointers;

class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while(i<j){
            if(numbers[i] + numbers[j] > target)
                j--;
            else if(numbers[i] + numbers[j] < target)
                i++;
            
            else
             return new int[]{i+1, j+1};
        }
        return null;
    }
}

/*
        --------------Two Sum II - Input Array Is Sorted-------------
Given an integer array numbers(already sorted).
Find two numbers such that they add up to a specific target number.
Array is 1-based index given so while returning indices we have to add 1 extra

Logic:
We can solve it using two pointer approach where i will be pointing 1st element and j pointing last
The loop runs while i<j
We'll check two conditions 
if sum of i&j is greater than target -> decrement j
if sum of i&j is less than target -> increment i
else means i & j we've found the elements return indices by adding 1(1-based index array)

*/