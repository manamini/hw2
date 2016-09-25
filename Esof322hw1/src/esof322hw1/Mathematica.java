/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322hw1;

/**
 *
 * @author manam
 */
public class Mathematica {
    // Insertion sort
    public void insertionSort(int[] nums)
    {
        int temp;
        for(int i = 1; i<nums.length;i++)
        {
            for(int j = i; j> 0; j--)
            {
                if(nums[j]< nums[j-1])
                {
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
    public void sorted(int[] array)
    {
        for (int i = 0;i<array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
