public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int saving = 0;
        int month = 1;
        double newPrice = startPriceNew;
        double oldPrice = startPriceOld;
        double decPercent = percentLossByMonth;
        while(newPrice>oldPrice+saving){
            if(month%2 ==0){
                decPercent += 0.5;
            }
            saving += savingperMonth;
            newPrice = newPrice*(100-decPercent)/100;
            oldPrice = oldPrice*(100-decPercent)/100;
            month++;
        }
        int result = (int)Math.round(newPrice-oldPrice-saving);
        return new int[] {month-1,-result};
    }
}