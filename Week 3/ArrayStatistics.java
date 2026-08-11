
public class ArrayStatistics {
    
    public void sum(int [] values)
    {
        int sum = 0;
        for(int i = 0;i < values.length;i++)
        {
            sum += values[i];
        }
        System.out.println(
            "sum: "+sum
        );
    }

    public void average(int [] values)
    {
        double avg=0;
        int sum=0;
        for(int i=0;i< values.length; i++)
        {
            sum=sum+values[i];
            avg=sum/2;
        }
        System.out.println("average: "+avg);
     
    }
    public void even(int [] values)
    {
        int even=0;
        for(int i=0;i<values.length;i++)
        {
            if(values[i]%2==0)
                even++;
        }
        System.out.println("even: "+even);
    }
    public void minimum(int [] values)
    {
        int min=values[0];
        for(int i=0;i<values.length;i++)
        {
            if(min>=values[i])
                min=values[i];
        }
        System.out.println("minimum: "+min);
    }

    public void maximum(int []values)
    {
        int max=values[0];
        for(int i=0;i<values.length;i++) 
        {
            if(max<=values[i])
                max=values[i];
        }
        System.out.println("maximum: "+max);

    }
}
    
