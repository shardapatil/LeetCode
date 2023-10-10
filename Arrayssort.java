Arrays.sort(nums);
         int count =1;
        // Set <Integer> as = new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count] = nums[i];
                count++;
                //  int value =nums[nums.length-1];
                
            }
           
        }
       
     return count;
      
    }
