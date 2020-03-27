package com.company;
import java.util.Scanner;

public class VendingMachine  {

public static void main(String args[])
        {
        int[] coin= new int[5];//create an array to hold coin values
        int[] drink= new int[5]; //create an array to hold drink values
        int choice;
        char cont;
//String input1, input2, input3;
        double price=1.2,balance=0,coinInsert=0,sumCoininsert=0;
        showmenu(coin,drink);
        sumCoininsert=inputcoin(coinInsert);
        showdrinks(choice);
        showbalace(sumCoininsert,price);
        contmethod(cont);
        }
/*****************showmenu method*****************/
public static int showmenu(int coin,int drink)
        {
        int coin;
        int drink;

            System.out.println("[Coins available : RM 1 [" + coin[0] + "] RM0.50 [ " + coin[1] + "] RM 0.20 [ " + coin[2] + "] RM0.10 [" + coin[3] + "] ]");
            System.out.println("[Drinks available : Pepsi [" + drink[0] + "] Coke [" + drink[1] + "] Mirinda Orange [" + drink[2] + "] 7up [" + drink[3] + "] ]");
        }
/********************showmenu method*****************/
/**************inputcoin method *******************/
public static double inputcoin(double coinInsert)
        {
        double coinInsert=0,sumCoininsert=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert Coin==>");
        double coinInsert=sc.nextDouble();
        while(coinInsert=='1'||coinInsert=='0.5'||coinInsert=='0.2'||coinInsert=='0.1') {
            ;
        }
        {
        coinInc(coinInsert);
        sumCoininsert=sumCoininsert+coinInsert;
        while(sumCoinInsert< 1.20)
        {
        System.out.println("Insert Coin==>");
        double coinInsert=sc.nextDouble();
        }
        }
        System.out.println(" Total :"+sumCoinInsert);
        }
        }
/********************inputcoin method*******************/
    /***************coinInc method************************/
    public static double coinInc(int coinInsert)
    {
        double coinInsert;
        Scanner sc = new Scanner(System.in);
        switch (coinInsert) {
            case coinInsert == '1':
                coin[0]++;
                break;
            case coinInsert == '0.5':
                coin[1]++;
                break;
            case coinInsert == '0.2':
                coin[2]++;
                break;
            case coinInsert == '0.1':
                coin[3]++;
                break;
            default:
                System.out.println("Invalid coin");
                sumCoininsert = 0;
                System.out.println("Insert Coin==>");
                double coinInsert = sc.nextDouble();
                break;
        }
    }
/******************coinInc method*********************/
    /*****************showdrinks method **************/
    public static int showdrinks (int choice)
    {
        int choice;
        System.out.println("Drinks [RM1.20]");
        System.out.println("1.Pepsi" "\t2.Coke" "\t3.Mirinda Orange" "\t4.7up");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice==>");
        int choice = sc.nextInt();
        while (choice == '1' || choice == '2' || choice == '3' || choice == '4')
        {
            if (choice =='1')
            {
                drink[0]--;
            }else if (choice=='2')
            {
                drink[1]--;
            }else if (choice =='3')
            {
                drink[2]--;
            }else (choice == '4')
            {
                drink[3]--;
            }
        }
        System.out.println("Invalid choice");
        System.out.println("Choice==>");
        int choice = sc.nextInt();
    }
/*****************showdrinks method **************/
    /****************showbalance method*******************/
    public static double showbalance(double sumCoininsert, double price)
    {
        double price = 1.2, balance = 0, sumCoininsert;
        balance = sumCoininsert - price;
        if (balance != 0.00)
        {
            countbalance (balance);
            System.out.println(" Your balance is :" +balance)
            System.out.println("\n:" +fifty+ "x50" " " +twenty+ "x20" " " +tenth+ "x10" );
        }else //if (balance == 0.00)
        {
            System.out.println("Your balance is :" +balance);
        }
    }
/****************showbalance method*******************/
    /****************countbalance method******************/
    public static double countbalance(double balance)
    {
        double balance;
        int ibalance = (int)(balance);
        int fifty = ibalance/50;
        int cfifty = ibalance%50;
        int twenty = cfifty/20;
        int ctwenty = cfifty%20;
        int tenth = ctwenty/10;
        int ctenth = ctwenty%10;
        if ( fifty != 0)
        {
            coin[1]--;
        }
        if (twenty != 0)
        {
            coin[2]--;
        }
        if (tenth != 0)
        {
            coin[3]--;
        }
    }
/*************countbalance method*********************/
    /************************contmethod*****************************/
    public static String contmethod (char cont)
    {
        char cont;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Do you want to continue? y/n :");
//input3 = in.readline();
        cont = sc.charAt(0);
        while (cont == 'y' || cont == 'Y')
        {
            continue ;
        }
        System.out.println("Thank You, Please come again.");
        System.exit(0);
    }
}
