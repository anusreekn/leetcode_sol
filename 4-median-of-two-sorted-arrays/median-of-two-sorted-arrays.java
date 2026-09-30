class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
       int i=0;
       int j=0;
       int k=0;
       double median=0;
       int[] nums3=new int[nums1.length+nums2.length];
        while( i <nums1.length &&  j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length)
        {
             nums3[k]=nums1[i];
                i++;
                k++;
        }
        while(j<nums2.length)
        {
             nums3[k]=nums2[j];
                j++;
                k++;
        }

        if (nums3.length % 2!=0)
        {
            median=nums3[nums3.length/2];
        }
        else
        {
            median=(nums3[nums3.length/2]+nums3[(nums3.length/2)-1])/2.0;
        }
      return  median;
    }
}