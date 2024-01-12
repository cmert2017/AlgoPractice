package practice;

public class Q1AnimalFeast {

//All the animals are having a feast! Each animal is bringing one dish.
// There is just one rule: the dish must start and end with the same letters as the animal's name.
// For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
//Write a method that takes the animal's name and dish as arguments and returns true or false to indicate
// whether the beast is allowed to bring the dish to the feast.
//Assume that beast and dish are always lowercase strings, and that each has at least two letters.
// Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
// They will not contain numerals.


    public static boolean firstNonREpeatingFeast(String animalName, String dishName){
        return  (animalName.charAt(0)==dishName.charAt(0) && animalName.charAt(animalName.length()-1)==dishName.charAt(dishName.length()-1) ? true : false);
    }


    public static void main(String[] args) {


        String animalName = "great blue heron";
        String dishName = "garlic naant";

        System.out.println(firstNonREpeatingFeast(animalName,dishName));


    }

}
