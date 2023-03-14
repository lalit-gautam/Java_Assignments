class userMaincode
{
    Public int totalParents(int input1,int input2,int[] input3)
    {
        int[ ] sub=new int[input1];
        int c=0; 
        for(int i=0;i<n;i++)
        {
            if(input3[i]!=-1)
            ++sub[input3[i]];
        }
         for(int i=0;i<n;i++)
        {
            if(sub[i]>=input2)
            ++c;
        }
        return c;
    }
}