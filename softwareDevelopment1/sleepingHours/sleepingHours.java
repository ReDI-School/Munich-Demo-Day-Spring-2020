package com.company;
import java.util.*;
public class sleepingHours {
    static Scanner userWish;

    public static void main(String[] args) {
        userWish=new Scanner(System.in);
        System.out.println(" Welcome in sleeping hours tracker");
        System.out.println(" heey, did you know that the best sleeping hours are 7 hours per day for adults");
        System.out.println(" please enter you planned hours of sleeping to track");
        double sleepingHoursTarget = userWish.nextDouble();
        userWish.nextLine();
        System.out.println(" great now let us track it together");
        double actualSleepingMonday=monday(sleepingHoursTarget);
        double actualSleepingTuesday=tuesday(sleepingHoursTarget);
        double actualSleepingWednesday=wednesday(sleepingHoursTarget);
        double actualSleepingThursday=thursday(sleepingHoursTarget);
        double actualSleepingFriday=friday(sleepingHoursTarget);
        double actualSleepingSaturday=saturday(sleepingHoursTarget);
        double actualSleepingSunday=sunday(sleepingHoursTarget);
        double actualSum=actualSleepingMonday+actualSleepingTuesday+actualSleepingWednesday+actualSleepingThursday+actualSleepingFriday+actualSleepingSaturday+actualSleepingSunday;
        String [] days={"Monday","Tuesday","Wednesday","thursday","Friday","Saturday","Sunday"};
        double[] actualHours={actualSleepingMonday,actualSleepingTuesday,actualSleepingWednesday,actualSleepingThursday,actualSleepingFriday,actualSleepingSaturday,actualSleepingSunday};
        HashMap<String, Double> actual=new HashMap<String, Double>();
        for (int i=0;i<days.length;i++){
            actual.put(days[i],actualHours[i]);
        }
        System.out.println(actual);
        double [] average=new double[days.length];
        for(int i=0;i<days.length;i++){
            average[i]=((actualHours[i]/sleepingHoursTarget)*100);
        }
        System.out.println("the percentage of your actual sleeping hours up to target is as here declared ");
        HashMap<String, Double> percentage=new HashMap<String, Double>();
        for (int i=0;i<days.length;i++){
            percentage.put(days[i],average[i]);
        }
        System.out.println(percentage);
        double totalWeekSleepingTarget=sleepingHoursTarget*7;
        int totalWeekHours=7*24;
        System.out.println("total percentage of slept hours up to the target"+((actualSum/totalWeekSleepingTarget)*100));
        System.out.println("total percentage of slept hours up to the whole week hours"+((actualSum/totalWeekHours)*100));




    }
            /// *** functions *** ///
    public static double monday(double sleepingHoursTarget) {
        System.out.println(" Cheer up it is Monday. charge the battery and be full of enthusiasm");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursMonday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursMonday>sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursMonday<sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
    }if(sleepingHoursMonday==sleepingHoursTarget){
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
    return sleepingHoursMonday;
    }
    public static double tuesday(double sleepingHoursTarget) {
        System.out.println(" Cheer up it is tuesday. we are still with full of enthusiasm");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursTuesday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursTuesday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursTuesday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursTuesday==sleepingHoursTarget) {
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursTuesday;
    }
    public static double wednesday(double sleepingHoursTarget) {
        System.out.println(" Cheer up it is Wednesday.the battery still full and we can do it");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursWednesday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursWednesday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursWednesday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursWednesday==sleepingHoursTarget) {
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursWednesday;
    }
    public static double thursday(double sleepingHoursTarget) {
        System.out.println(" it is Thursday. wish you a colorful sunny day");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursThursday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursThursday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursThursday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursThursday==sleepingHoursTarget) {
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursThursday;
    }
    public static double friday(double sleepingHoursTarget) {
        System.out.println(" Friday. you can do it this week");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursFriday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursFriday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursFriday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursFriday==sleepingHoursTarget){
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursFriday;
    }
    public static double saturday(double sleepingHoursTarget) {
        System.out.println(" youpiiii ..it is saturday. wish you a nice weekend.keep the balance to get the habit.");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursSaturday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursSaturday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursSaturday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursSaturday==sleepingHoursTarget){
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursSaturday;
    }
    public static double sunday(double sleepingHoursTarget) {
        System.out.println(" smile last day of the week..it is sunday.keep the balance to get the habit and learn from the mistakes");
        System.out.println(" please enter how many hours you slept today");
        double sleepingHoursSunday = userWish.nextDouble();
        userWish.nextLine();
        if (sleepingHoursSunday >sleepingHoursTarget) {
            System.out.println("you slept more than it is planned try to reduce it next time");
        }
        if (sleepingHoursSunday <sleepingHoursTarget){
            System.out.println("you slept less than it is planned try to adjust it next time");
        }if(sleepingHoursSunday==sleepingHoursTarget){
            System.out.println("well done keep it up so.");
        }
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("");
        return sleepingHoursSunday;
    }

}
