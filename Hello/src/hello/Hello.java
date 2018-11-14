/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author COSLAB
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        List<Integer> iList = new ArrayList<Integer>();
        sList.add("Hi");
        sList.add("Bye");
        sList.add("Yes");
        sList.add("No");
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        iList.add(5);
        
        Predicate<Integer> equalto = i -> (i == 1);
        int equals1 = linearSearch(iList,equalto);
        if(equals1 < 0){
            System.out.println("No Match");
        }
        else{
            System.out.println("Match at index: " + equals1);
        }
        
        Predicate<String> findYes = i -> (i.equals("Yes"));
        int isYes = linearSearch(sList,findYes);
        if(isYes < 0){
            System.out.println("No Match");
        }
        else{
            System.out.println("Match at index: " + isYes);
        }
        Predicate<Integer> greaterThan10 = i -> (i > 10);
        int bigger10 = linearSearch(iList, greaterThan10);
        if(bigger10 < 0){
            System.out.println("No Match");
        }
        else{
            System.out.println("Match at index: " + bigger10);
        }
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for(int x = 0; x < list.size(); x ++){
            T item = list.get(x);
            if(check.test(item)== true){
                return x;
            }
        }
        return -1;
    }
    
}
