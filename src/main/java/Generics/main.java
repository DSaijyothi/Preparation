package Generics;

import java.util.List;

public class main<T>
{
    private static Number simulation(List<? extends Number> numbers)
    {
        double sum=15.5;
        for(Number n:numbers)
            sum+=n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer>int_List=Arrays.asList(5,4,3,2,1);
        System.out.println("sum of the elements in int_list:"+simulation(int_List));
        List<Double>double_list=Arrays.asList(1.5,2.5,3.5,7.5);
        System.out.println("sum of the elements in double_list:"+simulation((double_list)));
    }
}
