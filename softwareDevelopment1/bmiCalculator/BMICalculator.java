import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.time.LocalTime;
import java.util.Scanner;
class BMICalculator{
	public static void main(String[] args){
		Scanner Bmi= new Scanner (System.in);
		System.out.println ("what is your name?");
		String name= Bmi.nextLine();
		System.out.println("what is your gender ?");
		String gender = Bmi.nextLine();
		int hour= getHour();
	    String mrOrMrs= maleorFemale(gender);
		System.out.println(greeting(hour) + " " + mrOrMrs + " "  + name);
		System.out.println("what is your weight in killograms?");
		double weight = Bmi.nextDouble();
		System.out.println ("what is your height in centimeters?");
		double height= Bmi.nextDouble();
		Double BMI = bmiCalculator (weight, height);
		System.out.println("your body mass index is " + BMI);
		String overweightOrUnderweight= underOrOver(BMI); 
		System.out.println ( "Your BMI says " + (overweightOrUnderweight));
		System.out.println (" what is your waist circumfrence?");
		double circumfrence = Bmi.nextDouble();
	    String tooMuchFat= waistcircumfrence(circumfrence, gender);
		System.out.println(tooMuchFat);
		System.out.println("Excess fat located in the upper abdominal region is associated with a greater risk of diabetes and heart diseases than fat located in other areas");
		System.out.println("how much weight do i need to loose?");
		double optimumWeight= idealweight(BMI, height);
        System.out.println(" this is your ideal weight kg:" + " " +  optimumWeight);
        double xcessweight = excessWeight (BMI, weight, optimumWeight);
        System.out.println("you are overweight by" + " "  + xcessweight + "kg");
        double xcessweightInCalories = xcessweight * 7716.18; // 1kg= 7716.18 calories 
        System.out.println("do you want to go on a diet?");
        String answer = Bmi.next();
        if (answer.equals("yes") && BMI<=24.9){
            System.out.println("your BMI is perfect for your height. you do not need to lose any weight");
        }
        System.out.println("whats your daily calorie intake ?");
        double dailyCalorieIntake= Bmi.nextDouble();
        if (dailyCalorieIntake< 2000){
            System.out.println (" you need at least 2000 calories to maintain body functions");
            }
        double dailyCalorieneed = 2000;
        double daysneeded= daysToLoseWeight(dailyCalorieneed, xcessweightInCalories, dailyCalorieIntake);
        double weeksneeded = daysneeded/7;
        if (answer.equals ("yes") && xcessweight  >1) {
            System.out.println("at your current caloric intake, It is  going to take" + " "  + weeksneeded + " " +  "weeks to lose that weight");

        } 
        System.out.println ("you can lose  weight faster  by staying active. whats your preferred form of exercise?");
        String exercise= Bmi.next();
        preferredExercise(exercise);
        System.out.println("the more intense the exercise, the more calories you burn");

        



       }

    public static String greeting(int hour){
	    String salutation = " ";
	    if (hour <=6 && hour < 12 ){
		    salutation= "Good Morning";
        }
	    if (hour >=12 || hour <=18){
		    salutation= "Good Afternoon";
        }
	    if (hour>18){
		    salutation= "Good Evening";
        }
        return salutation;
        }
    public static String maleorFemale (String gender) {
        String title= " ";
	    if (gender.equals("male")){
		    title = "Mr";
	
	    }
	    if (gender.equals("female")){
		title = "Mrs";
	
	    }

	    return title;
	
        }

    public static  int getHour() {
        return LocalTime.now().getHour();
        }

    public static double  bmiCalculator(double weight, double height){
 	    double BMI;
 	    String result;
 	    BMI = (weight/height/height) * 10000;
 	    return BMI;

    }

    public static String underOrOver( double BMI){
 	    String result = " ";
 	    if (BMI< 18.5){ 
 	 	    result= "You are underweight";
 	    }
 	    if (BMI> 18.5 && BMI <=24.9){
 	 	    result = "You are normal weight";
 	    }
 	    if (BMI> 24.9 && BMI <=29.9){
 	 	    result = "You are overweight";
 	    }
 	    if ( BMI > 29.9 && BMI <= 34.9){
 	 	   result = "you have obesity grade I";
 	    }
 	    if ( BMI > 34.9 && BMI <= 39.9){
 	 	   result = "you have obesity grade II";
 	    }
 	    if ( BMI > 39.9){
 	 	   result = "you are morbidly obese";
 	    }

 	    return result;


 }

    public static String waistcircumfrence(double circumfrence, String gender ){
 	    String advice= " ";
 	    if (gender.equals ("male") && circumfrence>102){
 		    advice = "your weight circumfrence shows that you're at very high risk of some serious health conditions.";
 		

 	    }
 	    else if (gender.equals("female") && circumfrence>88){
 		    advice = "your weight circumfrence shows that You're at very high risk of some serious health conditions.";
 	    }else{ 
 		    advice= " your weight circumfrence is perfect. stay away from too much carbs and fats to keep it that way. Eat your vegetables!!!";



 	    }
 	    return advice;
 	
        }

    public static double idealweight(double BMI, double height){
    	double weight= 0;
    	weight =( 24.9 * height*height)/10000 ;
 	    if (BMI> 24.9){
        } 
        if (BMI<= 24.9) {
   	    
   	        System.out.println (" you do not need to loose any weight, eat healthy and stay active");
        }

        return weight;

       }

    public static double excessWeight( double BMI, double weight, double optimumWeight){
 	    double xcessweight= 0;
 	    if (BMI>= 24.9){ 
 	        xcessweight = weight - optimumWeight;
 	
        }
        if (BMI<24.9){
    	    System.out.println("you do not need to lose weight. eat healthy and stay active");
        } 
        return xcessweight;
        }

    public static double daysToLoseWeight( double minimumDailyCalories,double xcessweightInCalories, double dailyCalorieIntake ){
 	    double timeneededtoloseweight= 0;
 	    double dailyCalorieneed = 2000;
 	    if (dailyCalorieIntake>= dailyCalorieneed){
 		   System.out.println ("to loose the excess weight you need to consume at most "  +  dailyCalorieneed + "calories everyday");
 		   timeneededtoloseweight= xcessweightInCalories /( dailyCalorieIntake-minimumDailyCalories);
 		
 	    } 
 	    return timeneededtoloseweight;

 	    }

 	public static String preferredExercise(String exercise){
 	 	String activity = " ";
 	 	if (exercise.equals("walking")){
 	 		activity= "you burn 3cal/min walking at 2mph and 5 cal/min walking at 4mph as against 2cal/min sitting down"; // cal= calories, mph= miles per hour
 	 		 System.out.println(activity);
 	 	}
 	 	if (exercise.equals("running") || exercise.equals("jogging")){
 	 		activity = "you burn 20cal/min running at 10mph as against 3cal/min walking at 2mph and 5 cal/min walking at 4mph ";
 	 		  System.out.println(activity);
 	 	}
 	 	if (exercise.equals("cycling")){
 	 		activity= "you burn 8cal/min cycling at 13mph as against 2cal/min  sitting down ";
 	 		System.out.println(activity);
 	 	}
 	 	if (exercise.equals("swimming")){
 	 		activity="you burn 14cal/min swimming at 2mph as against 2cal/min  sitting down";
 	 		System.out.println(activity);
 	 	}else {
 	 		activity= "the more active you are the better for your health. start some form of physical activity today!!!";
 	 		System.out.println(activity);
 	 	}
 	 	return activity;
 	 }
 	 

}

 





