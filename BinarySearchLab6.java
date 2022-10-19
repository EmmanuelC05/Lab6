/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchlab6;

/**
 *
 * @author Emmanuel C.
 */
public class BinarySearchLab6 {

    public static void binarySearch(int arr[], int first, int last, int key)
    {
    //Definigng the middle value with the equation below, mid = (first + last)/2   
   int mid = (first + last)/2;
   
   //First is less than or equal to last integer
   while( first <= last ){
       
      //loop by searching mid value if its less then key number the new minimum value
      //becomes one more than the previous median.
      if ( arr[mid] < key ){
        first = mid + 1;  
   
     //Loop will end here if the middle value is equal to the key value we are looking 
     //for and print out a statment saying that the element in the array has been found.
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
        
       //if its more then key number the new maximum value
      //becomes one less than the previous median.
      }else{
         last = mid - 1;
      }
      //equation that establishes the median value
      mid = (first + last)/2;
   }
   //Statets that after searching through the whole array and the element is not found then 
   //a statement will come up telling you that the number was not found.
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
    
    public static void main(String args[])
 {
                //inserting an array of numbers to be searched
		int arr[] = {10,20,30,40,50};
                //Target variable we are looking for
		int key = 30;
        //Defining the last number in the array by assigning the last index number 
        //as legth - 1
        int last=arr.length-1;
        
		binarySearch(arr,0,last,key);	
 }
}

 