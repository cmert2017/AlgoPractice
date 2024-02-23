package week9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TheAnimalsWentinTwobyTwo {
    //A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs.
    // We are only interested in getting one pair of each animal, and not interested in any animals where there are less than 2.
    // They need to mate to repopulate the planet after all!
    //Write a function that takes a list of animals as a parameter, which you need to check to see which animals there are at
    // least two of, and then return a Map<String, Integer> that contains the name of the animal along with the fact that
    // there are 2 of them to bring onto the ark.
    //Examples:
    //Input: []
    //Output: {}
    //Input: ['goat']
    //Output: {}
    //Input : ["dog", "goat", "dog"]
    //Output: {dog=2}
    //Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
    //Output: {cat=2, dog=2}
    //Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
    //Output: {horse=2, rabbit=2, goat=2}

    public static Map<String,Integer> theAnimalsWentinTwobyTwo1(String[] arr) {
        Map<String, Integer> mapAnimals = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mapAnimals.put(arr[i], mapAnimals.getOrDefault(arr[i], 0) + 1);
        }
        //for each loop doesnt work with remove as expected
        for (Map.Entry<String, Integer> tempMap : mapAnimals.entrySet()) {
            if (tempMap.getValue() > 2) tempMap.setValue(2);
            if (tempMap.getValue() < 2) {
                System.out.println("tempMap.getKey() = " + tempMap.getKey());
                mapAnimals.remove(tempMap.getValue());
                System.out.println("mapAnimals = " + mapAnimals);
            }


        }
            return mapAnimals;
    }

        public static Map<String,Integer> theAnimalsWentinTwobyTwo2(String[] arr){
            Map<String, Integer> mapAnimals= new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = mapAnimals.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue()> 2) entry.setValue(2);

            if (entry.getValue() < 2) {
                iterator.remove();
            }
        }
        return mapAnimals;
    }


    public static void main(String[] args) {

        String[] arrAnimals1 = {"goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"};
        String[] arrAnimals2= {"dog", "cat", "dog", "cat", "beaver", "cat"};
        String[] arrAnimals3= {"dog"};
        String[] arrAnimals4= {};

//        System.out.println("theAnimalsWentinTwobyTwo(arrAnimals1) = " + theAnimalsWentinTwobyTwo1(arrAnimals1));
        System.out.println("theAnimalsWentinTwobyTwo(arrAnimals2) = " + theAnimalsWentinTwobyTwo1(arrAnimals2));
//        Systemystem.out.println("theAnimalsWentinTwobyTwo(arrAnimals3) = " + theAnimalsWentinTwobyTwo1(arrAnimals3));
//        System.out.println("theAnimalsWentinTwobyTwo(arrAnimals4) = " + theAnimalsWentinTwobyTwo1(arrAnimals4));

    }
}
