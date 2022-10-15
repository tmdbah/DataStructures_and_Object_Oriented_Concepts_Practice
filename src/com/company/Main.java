/**
 * In Class Assignment # 1
 * Bah_InClass01
 * @author Thiernomamadou Bah
 */

import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	     // Question One

         // fizzBuzz();

        // Question Two

        /*
        ArrayList<Integer> testNumbers = new ArrayList<>();

        for (int i = 1; i < 21 ; i++) {
            testNumbers.add(i);
        }

        for (int i = 0; i < testNumbers.size(); i++) {
          int testNum = testNumbers.get(i);
            Boolean result =  isEven(testNum);
            System.out.println("Test Number is " + testNum + " Is "+ testNum + " Even? True or False: " +  result);

        }
         */

        // Question 3

        /*
        Integer arr[] = {5, 6, 7, 8, 1};

        Integer result = getMinimum(arr);

        System.out.println(result);
        */

        // Question 4

        for (String user : Data.users) {
            String[] result = user.split(",",0);
            System.out.println("result = ");
            for (String str : result) {
                System.out.println(str + ", ");
            }
        }

       // User user = new User();

      // Question 5
        /*
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Oscar","Smith", "40", "Oscar.Smith@email.com", "Male", "LA", "CA");
        User user2 = new User("Mike","Jordan", "50", "Mike.Jordan@email.com", "Male", "CLT", "NC");
        User user3 = new User("Nicole","Baker", "20", "Nicole.baker@email.com", "Female", "New York", "NY");
        User user4 = new User("Paula","Gonzales", "31", "Paul.Gonzales@email.com", "Female", "Clover", "SC");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

//        for (User theUser : users) {
//            System.out.println(theUser.toString());
//        }

        printUsers_OMN(users);

         */

        // Question 6

        /*
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Oscar","Smith", "40", "Oscar.Smith@email.com", "Male", "LA", "CA");
        User user2 = new User("Mike","Jordan", "50", "Mike.Jordan@email.com", "Male", "CLT", "NC");
        User user3 = new User("Nicole","Baker", "20", "Nicole.baker@email.com", "Female", "New York", "NY");
        User user4 = new User("Paula","Gonzales", "31", "Paul.Gonzales@email.com", "Female", "Clover", "SC");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        //System.out.println("Before Sort: " + users);

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User userA, User userB) {
                return userA.age.compareTo(userB.age);
            }
        });

        //System.out.println("After Sort: " + users);

        for (User userResult : users) {
            System.out.println(userResult.firstname + " " + userResult.lastname + " " + userResult.age);
        }

         */

    }

    //Question 1
    public static void fizzBuzz(){
        ArrayList<String> strings1to20 = new ArrayList<>();

        // Iterate Numbers 1 to 20, Check FizzBuzz Conditions,
        // either Add String's Fizz, Buzz or FizzBuzz Else Add String Value of Iterator (index)

        for (int i = 1; i <= 20; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                strings1to20.add("FizzBuzz");
            //    System.out.println(i + " " + "FizzBuzz");
            } else if (i % 3 == 0){
                strings1to20.add("Fizz");
            //    System.out.println(i + " " + "Fizz");
            } else if (i % 5 == 0){
                strings1to20.add("Buzz");
            //    System.out.println(i + " " + "Buzz");
            } else {
               String strValueOfi = String.valueOf(i);
                strings1to20.add(strValueOfi);
            }
        }

        for (String result : strings1to20) {
            System.out.println(result);
        }
    }

    //Question 2
    public static boolean isEven(Integer num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    //Question 3
    public static Integer getMinimum(Integer[] numbers){

        if(numbers == null){
            return null;
        } else {
            int min = numbers[0]; // Assume the first item is the Smallest

            for (int i = 0; i < numbers.length; i++) {
                if( numbers[i] < min ){
                    min = numbers[i];
                }
            }
            return min;
        }

    }


    //Question 4
    public static ArrayList<User> getParsedUsers(String[] strings){

        // User user = new User();
        return null;
    }



    //Question 5
    public static void printUsers_OMN(ArrayList<User> users){

        for (int i = 0; i < users.size() ; i++) {
            User currentUser = users.get(i);
            if(currentUser.firstname.startsWith("O") || currentUser.firstname.startsWith("M") || currentUser.firstname.startsWith("N") ){
                System.out.println(currentUser.firstname + " " + currentUser.lastname);
            }
        }
    }


    //Question 6
    public static void printUsersSortedByAge(ArrayList<User> users){

//        Collections.sort(users,);

        for (int i = 0; i < users.size() ; i++) {
            User currentUser = users.get(i);
            System.out.println();
        }

    }

    /*

    //Question 7
    public static void printUsersOldest10(ArrayList<User> users){

    }

    //Question 8
    public static void printUserStateStats(ArrayList<User> users){

    }

    //Question 9
    public static Set<String> getWordOverlap(String[] listA, String[] listB){

    }

    //Question 10
    public static ArrayList<User> getUserOverlap(ArrayList<User> usersA, ArrayList<User> usersB){

    }
*/


}
