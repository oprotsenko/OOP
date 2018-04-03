package com.oprotsen.JavaOOP.familyBudget;

public class ToPrint implements Printer{
    private final User user;

    public ToPrint(User user) {
        this.user = user;
    }

    public void calendarViweE() {
        System.out.println("EARNINGS: ");
        int i = 0;
        for (CategoryMovements elem : user.getEarnings()) {
            System.out.print(elem.getCategory(i).getLocalDate() + ": ");
            System.out.print(elem.getCategory(i).getName() + " ");
            if (elem.getCategory(i).getPaymentType().getCardType() != null)
                System.out.print(elem.getCategory(i).getPaymentType().getCardType() + " ");
            System.out.println(elem.getCategory(i).getCost() + " UAH");
            i++;
        }
    }

    public void calendarViweC() {
        System.out.println("CONSUMPTIONS: ");
        int i = 0;
        for (CategoryMovements elem : user.getConsumptions()) {
            System.out.print(elem.getCategory(i).getLocalDate() + ": ");
            System.out.print(elem.getCategory(i).getName() + " ");
            if (elem.getCategory(i).getPaymentType().getCardType() != null)
                System.out.print(elem.getCategory(i).getPaymentType().getCardType() + " ");
            System.out.println(elem.getCategory(i).getCost() + " UAH");
            i++;
        }
    }

    public void categoryViweE() {
        System.out.println("EARNINGS: ");
        int i = 0;
        for (CategoryMovements elem : user.getEarnings()) {
            System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
            i++;
        }
    }

    public void categoryViweC() {
        System.out.println("CONSUMPTIONS: ");
        int i = 0;
        for (CategoryMovements elem : user.getConsumptions()) {
            System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
            i++;
        }
    }

    public void cardViwe() {
        System.out.println("EARNINGS: ");
        int e = 0;
        for (CategoryMovements elem : user.getEarnings()) {
            if (elem.getCategory(e).getPaymentType().getCardType() != null)
            System.out.println(elem.getCategory(e).getPaymentType().getCardType() + " " + elem.getCategory(e).getCost());
            e++;
        }
        System.out.println("CONSUMPTIONS: ");
        int c = 0;
        for (CategoryMovements elem : user.getConsumptions()) {
            if (elem.getCategory(c).getPaymentType().getCardType() != null)
                System.out.println(elem.getCategory(c).getPaymentType().getCardType() + " " + elem.getCategory(c).getCost());
            c++;
        }
    }
}
