/**
 * In Class Assignment # 1
 * Bah_InClass01
 * @author Thiernomamadou Bah
 */

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // --------------------------------------------------------------------[ Test Cases }----- //

        // All Test Cases and corresponding methods should run in isolation except for Question 10 which also uses the method getParsedUsers from Question 4 to Test Data.
        // All Code is commented out


         // -------------------------------------------------------------------[ Question 1 ]----- //

         // fizzBuzz();


        // --------------------------------------------------------------------[ Question 2 ]----- //

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


        // --------------------------------------------------------------------[ Question 3 ]----- //


        Integer arr[] = {5, 6, 7, 8, 1};

        Integer result = getMinimum(arr);

        System.out.println(result);


        // --------------------------------------------------------------------[ Question 4 ]----- //


        for (User user : getParsedUsers(Data.users)) {
            System.out.println(user.toString());
        }


        // --------------------------------------------------------------------[ Question 5 ]----- //

        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Oola,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user2 = new User("Mybilla,Martinetto,84,smartinetto1@google.it,Female,Anniston,AL");
        User user3 = new com.company.User("Casi,Roizn,78,croizn2@scribd.com,Female,San Jose,CA");
        User user4 = new com.company.User("Neriann,Blackadder,83,tblackadderpt@go.com,Female,Raleigh,NC");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        printUsers_OMN(users);

        // --------------------------------------------------------------------[ Question 6 ]----- //

        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Lola,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user2 = new User("Sybilla,Martinetto,84,smartinetto1@google.it,Female,Anniston,AL");
        User user3 = new User("Casi,Roizn,78,croizn2@scribd.com,Female,San Jose,CA");
        com.company.User user4 = new User("Wilma,Guilaem,84,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

   //     System.out.println("Before Sort: " + users); // For Testing Users Before sort ##Delete-ME##

        printUsersSortedByAge(users);

 */

/*

        // --------------------------------------------------------------------[ Question 7 ]----- //


        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Lola,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user2 = new User("Sybilla,Martinetto,84,smartinetto1@google.it,Female,Anniston,AL");
        User user3 = new User("Casi,Roizn,78,croizn2@scribd.com,Female,San Jose,CA");
        User user4 = new User("Wilma,Guilaem,84,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user5 = new User("Bulma,Smith,48,bsmith3@sourceforge.net,Female,Pensacola,FL");
        User user6 = new User("Lola,Grimsdyke,12,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user7 = new User("Sybilla,Martinetto,11,smartinetto1@google.it,Female,Anniston,AL");
        User user8 = new User("Casi,Roizn,24,croizn2@scribd.com,Female,San Jose,CA");
        User user9 = new User("Wilma,Guilaem,32,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user10 = new User("Bulma,Smith,30,bsmith3@sourceforge.net,Female,Pensacola,FL");
        User user11= new User("Lola,Grimsdyke,56,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user12 = new User("Sybilla,Martinetto,75,smartinetto1@google.it,Female,Anniston,AL");
        User user13 = new User("Casi,Roizn,15,croizn2@scribd.com,Female,San Jose,CA");
        User user14 = new User("Wilma,Guilaem,17,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user15 = new User("Bulma,Smith,113,bsmith3@sourceforge.net,Female,Pensacola,FL");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);

        //System.out.println("Before Sort: " + users); // For Testing Users Before sort ##Delete-ME##

        printUsersOldest10(users);

        //System.out.println("After Sort: " + users); // For Testing Users After sort ##Delete-ME##


        // --------------------------------------------------------------------[ Question 8 ]----- //

        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Jasmine,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,SC");
        User user2 = new User("Sybilla,Martinetto,84,smartinetto1@google.it,Female,Anniston,AL");
        User user3 = new User("Casey,Roizn,78,croizn2@scribd.com,Female,San Jose,CA");
        User user4 = new User("Wilma,Guilaem,84,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user5 = new User("Bulma,Smith,48,bsmith3@sourceforge.net,Female,Pensacola,FL");
        User user6 = new User("Peter,Grimsdyke,12,lgrimsdyke0@facebook.com,Female,Newport Beach,CA");
        User user7 = new User("Sybilla,Martinetto,11,smartinetto1@google.it,Female,Anniston,AL");
        User user8 = new User("Casi,Roizn,24,croizn2@scribd.com,Female,San Jose,CA");
        User user9 = new User("Wilma,Guilaem,32,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user10 = new User("Chris,Smith,30,bsmith3@sourceforge.net,Female,Pensacola,FL");
        User user11= new User("Lola,Grimsdyke,56,lgrimsdyke0@facebook.com,Female,Newport Beach,NC");
        User user12 = new User("Sybilla,Martinetto,75,smartinetto1@google.it,Female,Anniston,AL");
        User user13 = new User("Casie,Roizn,15,croizn2@scribd.com,Female,San Jose,CA");
        User user14 = new User("Wilma,Guilaem,17,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User user15 = new User("Bulma,Smith,113,bsmith3@sourceforge.net,Female,Pensacola,SC");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);

        //System.out.println("Before Sort: " + users); // For Testing Users Before sort ##Delete-ME##

        printUserStateStats(users);

        //System.out.println("After Sort: " + users); // For Testing Users After sort ##Delete-ME##


        // --------------------------------------------------------------------[ Question 9 ]----- //


       Set<String> result = getWordOverlap(Data.words_1,Data.words_2);

        for (String fromSet : result) {
            System.out.println(fromSet);
        }

*/

        // --------------------------------------------------------------------[ Question 10 ]----- //

        // --------------------------- [ Test Case 1: Custom Data ] ------ //

        /*

        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User("Jasmine,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,SC");
        User user2 = new User("Sybilla,Martinetto,84,smartinetto1@google.it,Female,Anniston,AL");
        User user3 = new User("Casey,Roizn,78,croizn2@scribd.com,Female,San Jose,CA");
        User user4 = new User("Wilma,Guilaem,84,wguilaem3@sourceforge.net,Female,Pensacola,FL");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        ArrayList<User> otherUsers = new ArrayList<User>();
        User userA = new User("Jasmine,Grimsdyke,89,lgrimsdyke0@facebook.com,Female,Newport Beach,SC");
        User userB = new User("Casie,Roizn,15,croizn2@scribd.com,Female,San Jose,CA");
        User userC = new User("Wilma,Guilaem,17,wguilaem3@sourceforge.net,Female,Pensacola,FL");
        User userD = new User("Bulma,Smith,113,bsmith3@sourceforge.net,Female,Pensacola,SC");

        otherUsers.add(userA);
        otherUsers.add(userB);
        otherUsers.add(userC);
        otherUsers.add(userD);

         */
        // --------------------------- [ Test Case 2: Data.users & Data.otherUsers ] ------ //

        // ---- [ Run with getParsedUsers (Question 4 Method for Test) ] --------------- //

       ArrayList<User> users = getParsedUsers(Data.users);
       ArrayList<User> otherUsers = getParsedUsers(Data.otherUsers);

       ArrayList<User> result = getUserOverlap(users, otherUsers);

        for (User shared : result) {
            System.out.println(shared);
        }


    } // End of Driver Method



/*

    // --------------------------------------------------------------------[ Question 1 ]----- //
    public static void fizzBuzz(){
        ArrayList<String> strings1to20 = new ArrayList<>();

        // Iterate Numbers 1 to 20, Check FizzBuzz Conditions,
        // either Add String's Fizz, Buzz or FizzBuzz Else Add String Value of Iterator (index)

        for (int i = 1; i <= 20; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                strings1to20.add("FizzBuzz");
            } else if (i % 3 == 0){
                strings1to20.add("Fizz");
            } else if (i % 5 == 0){
                strings1to20.add("Buzz");
            } else {
               String strValueOfi = String.valueOf(i);
                strings1to20.add(strValueOfi);
            }
        }

        for (String result : strings1to20) {
            System.out.println(result);
        }
    }



    // --------------------------------------------------------------------[ Question 2 ]----- //
    public static boolean isEven(Integer num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }


    // --------------------------------------------------------------------[ Question 3 ]----- //
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

*/

    // ---------------------------------------------------[ Question 4 | Also used for Question 10 Test 2 ]----- //
    public static ArrayList<User> getParsedUsers(String[] strings){
        ArrayList<User> userList = new ArrayList<>();

        for (String userData : strings) {
            User user = new User(userData);
            userList.add(user);
        }

        return userList;
    }

/*

    // --------------------------------------------------------------------[ Question 5 ]----- //
    public static void printUsers_OMN(ArrayList<User> users){

        for (int i = 0; i < users.size() ; i++) {
            User currentUser = users.get(i);
            if(currentUser.firstname.startsWith("O") || currentUser.firstname.startsWith("M") || currentUser.firstname.startsWith("N") ){
                System.out.println(currentUser.firstname + " " + currentUser.lastname);
            }
        }
    }


    // --------------------------------------------------------------------[ Question 6 ]----- //
    public static void printUsersSortedByAge(ArrayList<User> users){

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < users.size() ; i++) {
            User currentUser = users.get(i);
            System.out.println(currentUser);
        }

    }

 */

/*

    // --------------------------------------------------------------------[ Question 7 ]----- //
    public static void printUsersOldest10(ArrayList<User> users){

        Collections.sort(users);

        List<User> userResult = users.subList(Math.max(users.size() - 10, 0), users.size());

        for (User topTen : userResult) {
            System.out.println(topTen);
        }

    }


    // --------------------------------------------------------------------[ Question 8 ]----- //
    public static void printUserStateStats(ArrayList<User> users){

        HashMap<String, Integer> stateMap = new HashMap<>();

        for (User u : users) {
            Integer count = stateMap.get(u.getState());
            if(!stateMap.containsKey(u.getState())){
                stateMap.put(u.getState(),1);
            } else {
                stateMap.put(u.getState(), count + 1);
            }

        }

        for (String key : stateMap.keySet()) {
            Integer stateCount = stateMap.get(key);
            System.out.println(key + " : " + stateCount);
        }

    }

    // --------------------------------------------------------------------[ Question 9 ]----- //
    public static Set<String> getWordOverlap(String[] listA, String[] listB){

        Set<String> intersection = new HashSet<>(List.of(listA));
        intersection.retainAll(List.of(listB));

        return intersection;
    }

*/

    // --------------------------------------------------------------------[ Question 10 ]----- //
    public static ArrayList<User> getUserOverlap(ArrayList<User> usersA, ArrayList<User> usersB){

        ArrayList<User> result = new ArrayList<>();

        for (User match : usersA) {

            if(usersB.contains(match)){
                result.add(match);
            }
        }

        return result;
    }

} // End of public class Main

