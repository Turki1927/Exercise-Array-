
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] number = {50,-20,0,30,40,10};
      //  for( int i =0;i<=number.length-1;i++){

        System.out.println("-------q1--------");
            if(number[0]== number[number.length-1]){
                System.out.println("The First number "+number[0]+" equal to the last number");
            }else{
                System.out.println("the first number not equal to the last number");
            }
        System.out.println("-------q2--------");

        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.
int [] number2={1,4,17,25,3,100};
            int sum = 0;
            double avg=0;
            for(int num:number2){
                sum+=num;
            }
       avg = sum/number2.length;
     for (int i =0 ;i<=number2.length-1;i++){
         if (number2[i]>avg){
             System.out.println(number2[i]);
         }

     }
        System.out.println("-------q3--------");


        //3 Write a Java program to get the larger value between first and last
        //element of an array of integers.
int[] number3={20,30,40,90};
//             int max = number3[0];
//     for (int i =0;i<=number3.length-1;i++){
//      if (number3[i]>number3[0]){
//  max=number3[i];
//      }
//
//     }
//        System.out.println("The "+max);
if(number3[0]>number3[number3.length-1]){
    System.out.println("Larger value between first and last element:"+number3[0]);
} else if (number3[0]<number3[number3.length-1]) {
    System.out.println("Larger value between first and last element:"+number3[number3.length-1]);

}else {
    System.out.println("all the values are the same");
}


//Write a Java program to swap the first and last elements of an array and
//create a new array.

        System.out.println("-------q4--------");
int[] oldArray ={20,30,40};
int [] arraynew = new int[oldArray.length];

for(int j= 0;j<=oldArray.length-1;j++){
 arraynew[j]=   oldArray[j]; // copy all elements in the new  array
}

int temp=arraynew[0];
arraynew[0]=arraynew[arraynew.length-1];
arraynew[arraynew.length-1]=temp;
for(int a :arraynew){
    System.out.print(a+" ");
}
        System.out.println();
//5. Write a program that places the odd elements of an array before the
//even elements.
        System.out.println("-------q5-------");
ArrayList <Integer> orginalArray = new ArrayList<>();
        ArrayList <Integer> oddFirst = new ArrayList<>();

orginalArray.add(2);
        orginalArray.add(3);
        orginalArray.add(40);
        orginalArray.add(1);
        orginalArray.add(5);
        orginalArray.add(9);
        orginalArray.add(4);
        orginalArray.add(10);
        orginalArray.add(7);

for (int k = 0; k<=orginalArray.size()-1;k++){//this loop make odd in the beginning of  new array
    if(orginalArray.get(k)%2==1){
        int tempOddGet = orginalArray.get(k);
        oddFirst.add(tempOddGet);

    }
}


for( int t = 0 ; t<=orginalArray.size()-1;t++){ // to sure the even number after the odd
    if(orginalArray.get(t)%2==0){
        int tempEvenGet=orginalArray.get(t);
        oddFirst.add(tempEvenGet);

    }
}
        System.out.println(oddFirst); //print the new array


//  6 Write a program that test the equality of two arrays.
//[2,3,6,6,4] [2,3,6,6,4]

        System.out.println("-------q6-------");

        int [] firstArray ={2,3,6,6,4};
        int [] secondArray ={2,3,6,6,4};
boolean notequal = false;
        if (firstArray.length==secondArray.length){
            for(int w = 0;w<=firstArray.length-1;w++){
                if (firstArray[w]==secondArray[w]){
                    System.out.println(firstArray[w]+"=="+secondArray[w]);
                    notequal =false;

                }else{
                    System.out.println(firstArray[w]+"!="+secondArray[w]);
                    notequal = true;
                    break;
                }
            }
            if(notequal){
                System.out.println("two arrays are not equal");
            }else{
                System.out.println("two arrays are equal");
            }

        }else{
            System.out.println("the length of arrays not same");
        }





    }//end main


    }
