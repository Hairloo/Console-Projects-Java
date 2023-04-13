package Mirea.Exam;

public class Money { //нужно доделать
    private long  rub;
    private double kop;

    Money(){ this.rub = 0; this.kop = 0;};
    Money(long rub,double kop){this.kop = kop; this.rub = rub;}
    //Money(long rub){this.kop = 0; this.rub = rub;}
    Money(double kop){
        this.rub = (long)(kop / 100);
        this.kop = Math.abs(kop - (int)(kop / 100) * 100);
    }

    public String getSum(){
        if (this.kop < 10) return this.rub + ",0" + (int) this.kop;
        else{
            return this.rub + "," + (int) this.kop;
        }
    }
    public static void getSum(Money sum){
        if (sum == null ) return;
        if (sum.kop < 10) System.out.println(sum.rub + ",0" + (int) sum.kop);
        else System.out.println(sum.rub + "," + (int) sum.kop);
    }

    public void moneyAdd(Money term){
        Money money = moneyAdd(this, term);
        this.rub = money.rub;
        this.kop = money.kop;
    }

    public static Money moneyAdd(Money sum1, Money sum2){
        Money newSum = new Money();
        newSum.rub = sum1.rub + sum2.rub;
        newSum.kop = sum1.kop + sum2.kop;

        if (newSum.kop >= 100) {
            newSum.rub++;
            newSum.kop = newSum.kop - 100;
        }
        return newSum;
    };

    public void moneySub(Money subtrahendMoney){
        Money money = moneySub(this, subtrahendMoney);
        this.rub = money.rub;
        this.kop = money.kop;
    }

    public static Money moneySub(Money sum1, Money sum2){
        double sum1Kop = sum1.getAllKop();
        double sum2Kop = sum2.getAllKop();
        Money newSum = new Money(sum1Kop - sum2Kop);
        return newSum;
    };

    public void moneyDiv(double num){
        moneyDiv(new Money(num));
    }

    public void moneyDiv(Money divider){
        if (divider.kop == 0 && divider.rub == 0) throw new IllegalArgumentException("division 0");
        Money money = moneyDiv(this, divider);
        this.rub = money.rub;
        this.kop = money.kop;
    }

    public static Money moneyDiv(Money sum1, Money sum2){
        if (sum2.kop == 0 && sum2.rub == 0) throw new IllegalArgumentException("division 0");
        double sum1Kop = sum1.getAllKop();
        double sum2Kop = sum2.getAllKop();
        Money newSum = new Money((sum1Kop / sum2Kop) * 100);
        return newSum;
    };

    public static Money moneyDiv(Money sum1, double num){
        if (num == 0) throw new IllegalArgumentException("division 0");
        double sum1Kop = sum1.getAllKop();
        Money newMoney = new Money((sum1Kop / num) * 100);
        return newMoney;
    };

    public void moneyMul(Money multiplier){
        Money money = moneyMul(this, multiplier);
        this.rub = money.rub;
        this.kop = money.kop;
    }

    public void moneyMul(double num){
        moneyMul(new Money(num));
    }

    public static Money moneyMul(Money sum1, Money sum2){
        double sum1Kop = sum1.getAllKop();
        double sum2Kop = sum2.getAllKop();
        return new Money(sum1Kop * sum2Kop / 100);
    }

    public static Money moneyMul(Money sum1, double num){
        double sum1Kop = sum1.getAllKop();
        Money newSum = new Money(sum1Kop * num);
        return newSum;
    };

    public static Money moneyCom(Money sum1, Money sum2){
        if (sum1.rub > sum2.rub) return sum1;
        else if( sum2.rub > sum1.rub) return sum2;
        else {
            if(sum1.kop > sum2.kop) return  sum1;
            else if (sum2.kop > sum1.kop) return sum2;
            else System.out.println("Одинаковые");
        }
        return null;
    };

    public double getAllKop(){
        return getAllKop(this);
    }
    public static double getAllKop(Money money){
        return money.rub * 100 + money.kop;
    }

    @Override
    public String toString() {
        return "Money{" +
                "rub=" + rub +
                ", kop=" + kop +
                '}';
    }
}


class TesterForMoney{
    public static void main(String[] args) {
        Money e1 = new Money(128, 0);
        Money e2 = new Money(2,12);
        for(int i = 0; i < 5; i++){
            e1.moneySub(e2);
        }
        System.out.println(e1);
        e1.moneyDiv(e2);
        Money.getSum(e1);
        Money.getSum(e1);
        Money.getSum(e2);
        Money.getSum(Money.moneyAdd(e1,e2));
        Money.getSum(Money.moneyDiv(e1,e2));
        Money.getSum(Money.moneySub(e1,e2));
        Money.getSum(Money.moneyMul(e2, e1));
    }
}
