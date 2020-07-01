import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

class BeachBot {

    public static String calculateBMI(double weight, double height) {
        
        String index = " ";
        double bmi = weight / (height * height);
        if (bmi > 0 && bmi < 18.5) {
            index = "Your BMI is " + bmi + ". \nYou are light as a feather. Summer wind might blow you away.";
        } else if (bmi > 18.5 && bmi < 25.00 ) {
            index = "Your BMI is " + bmi + ". \nPerfect!! You are ready for the beach!!! Have fun!!!";
        }    else {
            index = "Your BMI is " + bmi + ". \nYou are overweight!!! Start burning calories!!!";
        }    
        return index;
     }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BeachBot. What is your name?");
        String name = sc.nextLine();
        System.out.println("Hi "+ name + ", let us find out your Body Mass Index.");
     
        double weight = 0;
        double height = 0;
        System.out.println("Please enter your weight in kg: ");
        weight = sc.nextDouble();
        System.out.println("Please enter your height in meters: ");
        height = sc.nextDouble();
        sc.nextLine();
        System.out.println(calculateBMI(weight,height));  
        while (true) {
            System.out.print("Do you want to stay fit?\n");
            String answer = sc.nextLine();
            if (answer.toLowerCase().strip().equals("yes")) {
                break;
            }
        }
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> listHashMap = new HashMap<String, Integer>();
        boolean isDone = false;
        String exercise = "";
        while(!isDone) {
            boolean islistEmpty = list.size() == 0;
            if (islistEmpty) {
                System.out.println("Which exercises will you do today?"); 
            } else {
                
                String lastAddedExercise = exercise;
                int quantity = listHashMap.get(lastAddedExercise);
                System.out.println("Nice, "+lastAddedExercise+" "+quantity+" what else?");
            }
            
            exercise = sc.nextLine();
            String anyCaseexercise = exercise.toLowerCase();
            if (anyCaseexercise.equals("done") ||
                anyCaseexercise.equals("nothing else") ||
                anyCaseexercise.equals("finish")) 
            {
                isDone = true;
            } else {
                boolean isAlreadyOnTheList = listHashMap.containsKey(exercise);
                if (isAlreadyOnTheList) {
                    
                    int previousExercise = listHashMap.get(exercise);
                    int newExercise = previousExercise +1;
                   
                    listHashMap.put(exercise, newExercise);
                } else {
                    list.add(exercise);
                    listHashMap.put(exercise, 1);
                }  
            }
        }
        System.out.println("Here is the list of exercises you are planning to do today:\n");
        int numberOfexercises = list.size();
        for (int i = 0; i < numberOfexercises;i++) {
            String lastAddedExercise = list.get(i);
            Integer quantity = listHashMap.get(lastAddedExercise);
            System.out.println(" - #"+(i+1)+" : "+lastAddedExercise+" x ("+quantity+")");
        }
        if (numberOfexercises > 5) {
            System.out.println("\nGreat!! Calories will be melting!!\n");
        } else {
            System.out.println("\nYou could do better!! \nHere are some additional exericises for you: \n20 push-ups, 20 pull-ups and 20 squats!!\n");
            
        }
    }
}