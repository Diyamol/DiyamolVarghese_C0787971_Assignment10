package com.diyamolVarghese_C0787971;

public class CalculateCommission {
    private static double[] rate= {5,10,12,15,16};

    public static double CalculateCommissionAmount(double salesAmount) {
        double commissionAmt=0;
        if(salesAmount!=0)
        {
            if(salesAmount<10000)
            {
                commissionAmt=(salesAmount*rate[0])/100;
            }
            else if(salesAmount>10000 && salesAmount<15000)
            {
                commissionAmt=(salesAmount*rate[1])/100;
            }
            else if(salesAmount>14999 && salesAmount<18000)
            {
                commissionAmt=(salesAmount*rate[2])/100;
            }
            else if(salesAmount>17999 && salesAmount<22000)
            {
                commissionAmt=(salesAmount*rate[3])/100;
            }
            else
            {
                commissionAmt=(salesAmount*rate[4])/100;
            }
        }
        return commissionAmt;
    }


    public static double CalculatePay(double advance,double commissionAmount){
        double pay=0;
        pay=commissionAmount-advance;
        return pay;
    }
}
