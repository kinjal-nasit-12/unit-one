/*A motor cycle dealer sells two-wheelers to his customer on loan, which is to be
repaid in 5 years. The dealer charges simple interest for the whole term on the day
of giving the loan itself. The total amount is then divided by 60(months) and is
collected as equated monthly installment (EMI). Write a program to calculate the
EMI for a loan of Rs. X, where X is given from command line argument. Print the
EMI value in rupees. */

class U1P2 {

    public static void main(String args[]) {
        int amt = Integer.parseInt(args[0]);
        float rate = Float.parseFloat(args[1]);
        int y = 5;
        float si = (amt * rate * y) / 100;
        float netamt = amt + si;
        float emi = netamt / 12;
        System.out.println("Total amount: " + amt);
        System.out.println("Rate: " + rate);
        System.out.println("year: " + y);
        System.out.println("Simple Interest: " + si);
        System.out.println("Net Amount: " + netamt);
        System.out.println("EMI: " + emi);
    }
}
