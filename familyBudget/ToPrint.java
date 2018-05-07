package com.oprotsen.JavaOOP.familyBudget;

public class ToPrint implements Printer{

    private final Family family;

    public ToPrint(Family family) {
        this.family = family;
    }

    @Override
    public void calendarViewEarnings() {
        System.out.println("EARNINGS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                elem.getMovements().sort(MoneyMovementComparator.byDate());
                System.out.println(elem.getMovements());
//                System.out.print(elem.getCategory(i).getLocalDate() + ": ");
//                System.out.print(elem.getCategory(i).getName() + " ");
//                if (elem.getCategory(i).getPaymentType().getCardType() != null)
//                    System.out.print(elem.getCategory(i).getPaymentType().getCardType() + " ");
//                System.out.println(elem.getCategory(i).getCost() + " UAH");
                i++;
            }
        }
    }

    @Override
    public void calendarViewEarnings(User user) {
        System.out.println("EARNINGS: ");

        for (User userElem: family) {
            if (userElem == user) {
                int i = 0;
                for (CategoryMovements elem : userElem.getEarnings()) {
                    System.out.print(elem.getCategory(i).getLocalDate() + ": ");
                    System.out.print(elem.getCategory(i).getName() + " ");
                    if (elem.getCategory(i).getPaymentType().getPaymentType() != null)
                        System.out.print(elem.getCategory(i).getPaymentType().getPaymentType() + " ");
                    System.out.println(elem.getCategory(i).getCost() + " UAH");
                    i++;
                }
            }
        }
    }

    @Override
    public void calendarViewConsumptions() {
        System.out.println("CONSUMPTIONS: ");
        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                System.out.print(elem.getCategory(i).getLocalDate() + ": ");
                System.out.print(elem.getCategory(i).getName() + " ");
                if (elem.getCategory(i).getPaymentType().getPaymentType() != null)
                    System.out.print(elem.getCategory(i).getPaymentType().getPaymentType() + " ");
                System.out.println(elem.getCategory(i).getCost() + " UAH");
                i++;
            }
        }
    }

    @Override
    public void calendarViewConsumptions(User user) {
        System.out.println("CONSUMPTIONS: ");
        for (User userElem: family) {
            if (userElem == user) {
                int i = 0;
                for (CategoryMovements elem : userElem.getConsumptions()) {
                    System.out.print(elem.getCategory(i).getLocalDate() + ": ");
                    System.out.print(elem.getCategory(i).getName() + " ");
                    if (elem.getCategory(i).getPaymentType().getPaymentType() != null)
                        System.out.print(elem.getCategory(i).getPaymentType().getPaymentType() + " ");
                    System.out.println(elem.getCategory(i).getCost() + " UAH");
                    i++;
                }
            }
        }
    }

    @Override
    public void categoryViewEarnings() {
        System.out.println("EARNINGS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                i++;
            }
        }
    }

    @Override
    public void categoryViewEarnings(User user) {
        System.out.println("EARNINGS: ");

        for (User userElem: family) {
            if (userElem == user) {
                int i = 0;
                for (CategoryMovements elem : userElem.getEarnings()) {
                    System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                    i++;
                }
            }
        }
    }

    @Override
    public void categoryViewConsumption() {
        System.out.println("CONSUMPTIONS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                i++;
            }
        }
    }

    @Override
    public void categoryViewConsumption(User user) {
        System.out.println("CONSUMPTIONS: ");

        for (User userElem: family) {
            if (userElem == user) {
                int i = 0;
                for (CategoryMovements elem : userElem.getConsumptions()) {
                    System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                    i++;
                }
            }
        }
    }

    @Override
    public void cardView() {
        System.out.println("EARNINGS: ");

        for (User user : family) {
            int e = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                if (elem.getCategory(e).getPaymentType().getPaymentType() != null)
                    System.out.println(user.getLogin() + " " + elem.getCategory(e).getPaymentType().getPaymentType()
                            + " " + elem.getCategory(e).getCost());
                e++;
            }
        }
        System.out.println("CONSUMPTIONS: ");

        for (User user : family) {
            int c = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                if (elem.getCategory(c).getPaymentType().getPaymentType() != null)
                    System.out.println(user.getLogin() + " " + elem.getCategory(c).getPaymentType().getPaymentType()
                            + " " + elem.getCategory(c).getCost());
                c++;
            }
        }
    }

    @Override
    public void cardView(User user) {
        System.out.println("EARNINGS: ");

        for (User userElem: family) {
            if (userElem == user) {
                int e = 0;
                for (CategoryMovements elem : userElem.getEarnings()) {
                    if (elem.getCategory(e).getPaymentType().getPaymentType() != null)
                        System.out.println(user.getLogin() + " " + elem.getCategory(e).getPaymentType().getPaymentType()
                                + " " + elem.getCategory(e).getCost());
                    e++;
                }
            }
        }
        System.out.println("CONSUMPTIONS: ");

        for (User userElem: family) {
            if (userElem == user) {
                int c = 0;
                for (CategoryMovements elem : userElem.getConsumptions()) {
                    if (elem.getCategory(c).getPaymentType().getPaymentType() != null)
                        System.out.println(user.getLogin() + " " + elem.getCategory(c).getPaymentType().getPaymentType()
                                + " " + elem.getCategory(c).getCost());
                    c++;
                }
            }
        }
    }
}
