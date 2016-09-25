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
public class MyMath {
    //Bubble sort
    
    public void bubbleSort(int[] nums)
    {
        for (int i=0; i<(nums.length);i++)
        {
            for (int j=0; j<(nums.length);j++)
                {
            //System.out.println(j);
            if((j+1)>=(nums.length))
                {
                    //System.out.println("highest number is :" + nums[j]);
                }
            else if (nums[j]>nums[j+1])
                {
                
                System.out.print(nums[j] + " swaps with ");
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                System.out.println(nums[j]);
            
                
                }
            }
        }
        for (int i = 0;i<nums.length ; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
