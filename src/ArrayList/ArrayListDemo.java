package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //This line will create ArrayList of ArrayList
		ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;

        /*
        * Creating a new arraylist temp and adding 10,20 and 30
        * and finally adding it to main ArrayList *list*
        */
		ArrayList<Integer> temp1 = new ArrayList<>() ;
		temp1.add(10) ;
		temp1.add(20) ;
		temp1.add(30) ;

		list.add(temp1) ;

        /*
        * Similarly, creating another arraylist and adding it to
        * main list
        */
		ArrayList<Integer> temp2 = new ArrayList<>() ;
		temp2.add(40) ;
		temp2.add(50) ;

		list.add(temp2) ;

        /*
        * Finally, after insertion list would look something like
        * [ [10,20,30], [40,50] ]
        * */
		System.out.println(list);

		list.get(0).add(100) ; // [ [10,20,30,100],[40,50] ]
		list.get(1).add(200) ; // [ [10,20,30,100],[40,50,200] ]

		System.out.println(list); // [ [10,20,30,100],[40,50,200] ]


		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>() ;

		ArrayList<Integer> temp = new ArrayList<>() ;
		temp.add(10) ;
		temp.add(20) ;
		temp.add(30) ;
		list1.add(temp) ;

		temp = new ArrayList<Integer>() ; // Not writing this line will perform operations on same arraylist temp,
                                          // doing this would create new reference of temp
		temp.add(40) ;
		temp.add(50) ;
		list1.add(temp) ;

		temp = new ArrayList<Integer>();
		temp.add(60) ;
		temp.add(70) ;
		list1.add(temp) ;

		System.out.println(list1); //[ [10,20,30],[40,50],[60,70] ]

		temp.add(80) ;

		System.out.println(list1); //[ [10,20,30],[40,50],[60,70,80] ]

		temp.remove(temp.size()-1) ;
		temp.remove(temp.size()-1) ;

		System.out.println(list1); //[ [10,20,30],[40,50],[60] ]


		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

		ArrayList<Integer> t1 = new ArrayList<Integer>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(40);

		/*
		* This is creating just another variable t2
		* which has reference to t2, so now t2 and t1 are pointing to same address
		* making change through t2 will point change in t1.
		* */
		//ArrayList<Integer> t2 = t1 ;

		//list2.add(t1) ;
		//list2.add(t2) ;

		System.out.println(list2); //[[10,20,30,40],[10,20,30,40]]

		ArrayList<Integer> t2 = new ArrayList<>(t1); //this is creating another arraylist t2 at different address with
		                                             //content of t1

		//another way to copy content of t1 to t2.
		for(int i = 0 ; i < t1.size() ; i++)
		{
			t2.add(t1.get(i)) ;
		}

		list2.add(t1);
		list2.add(t2);
		t2.add(100);

		System.out.println(list2);

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;
//
//        ArrayList<Integer> temp = new ArrayList<>() ;
//
//        temp.add(10) ;
//        temp.add(20) ;
//
//        list.add(new ArrayList<>(temp)) ; //new ArrayList<> --> this will create new arraylist at different address
//        									//and copy the content of temp in it
//
//        temp.add(30) ;
//        temp.add(40) ;
//
//        list.add(new ArrayList<>(temp)) ;
//
//        temp.add(50) ;
//
//        list.add(new ArrayList<>(temp)) ;
//
//
//        System.out.println(list);


    }
}
