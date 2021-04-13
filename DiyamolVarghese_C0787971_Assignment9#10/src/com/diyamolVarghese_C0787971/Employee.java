package com.diyamolVarghese_C0787971;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Employee {
    public static void main(String[] args){
        String[] account=new String[3];
        double[] commission=new double[3];
        account=PersonalDetails();
        commission=SalesDetails();
        DisplayDetails(account,commission);
    }

    public static String[] PersonalDetails() {
        String[] account = new String[3];
        String firstName = JOptionPane.showInputDialog("Enter employee first name:");
        String lastName = JOptionPane.showInputDialog("Enter employee last name:");
        String id = JOptionPane.showInputDialog("Enter employee id:");
        account[0] = firstName;
        account[1] = lastName;
        account[2] = id;
        return account;
    }

    public static double[] SalesDetails() {
        double[] commission=new double[3];
        double sales=Double.parseDouble(JOptionPane.showInputDialog("Enter your monthly sales: "));
        double advance=Double.parseDouble(JOptionPane.showInputDialog("Enter the advance amount you took: "));
        while (advance>1500)
        {
            advance=Double.parseDouble(JOptionPane.showInputDialog("Enter the advance amount you took: "));
        }
        CalculateCommission objCalculateCommission=new  CalculateCommission();
        double commissionAmount=objCalculateCommission.CalculateCommissionAmount(sales);
        double pay;
        if(commissionAmount==advance)
        {
            pay=objCalculateCommission.CalculatePay(advance,commissionAmount);
        }
        else
        {
            pay=objCalculateCommission.CalculatePay(advance,commissionAmount);
        }
        commission[0]=sales;
        commission[1]=advance;
        commission[2]=pay;
        return commission;
    }

    public static void DisplayDetails(String[] account, double[] commission)
    {
        JOptionPane.showMessageDialog(null,"Firstname: "+account[0]+"\n"
                +"Lastname: "+account[1]+"\n"+"Employee Id: "+account[2]+"\n"+"Total Sales: $"+commission[0]+"\n"
        +"Advance Amount: $"+commission[1]+"\n"+"Payable Amount: $"+commission[2]);


    }
}
