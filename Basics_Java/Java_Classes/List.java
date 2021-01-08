public class main {

    // Create
    public static void main(String[] args) {

        //Creating a List of type String using ArrayList  
        List<String> list=new ArrayList<String>();  
        
        //Creating a List of type Integer using ArrayList  
        List<Integer> list=new ArrayList<Integer>();  
        
        //Creating a List of type Book using ArrayList  
        List<Book> list=new ArrayList<Book>();  
        
        //Creating a List of type String using LinkedList  
        List<String> list=new LinkedList<String>();  
    }

    // Creation and Iteration
    public static CreationAndIteration() {
        //Creating a List  
        List<String> list=new ArrayList<String>();  
        //Adding elements in the List  
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");  
        //Iterating the List element using for-each loop  
        for(String fruit:list)  
        System.out.println(fruit);  
    }

    // Convert Array To List
    public static ConvertArrayToList() {
        //Creating Array  
        String[] array={"Java","Python","PHP","C++"};  
        System.out.println("Printing Array: "+Arrays.toString(array));  
        //Converting Array to List  
        List<String> list=new ArrayList<String>();  
        for(String lang:array){  
        list.add(lang);  
        }  
        System.out.println("Printing List: "+list);  
        
        // Printing Array: [Java, Python, PHP, C++]
        // Printing List: [Java, Python, PHP, C++]
    }  

    // Convert List to Array
    public static ConvertListToArray() {
        List<String> fruitList = new ArrayList<>();    
        fruitList.add("Mango");    
        fruitList.add("Banana");    
        fruitList.add("Apple");    
        fruitList.add("Strawberry");    
        //Converting ArrayList to Array  
        String[] array = fruitList.toArray(new String[fruitList.size()]);    
        System.out.println("Printing Array: "+Arrays.toString(array));  
        System.out.println("Printing List: "+fruitList);  

        // Printing Array: [Mango, Banana, Apple, Strawberry]
        // Printing List: [Mango, Banana, Apple, Strawberry]
    }

    // Get and Set Element in List
    public static GetAndSetElementInList() {
         //Creating a List  
        List<String> list=new ArrayList<String>();  
        //Adding elements in the List  
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");  
        //accessing the element    
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
        //changing the element  
        list.set(1,"Dates");  
        //Iterating the List element using for-each loop  
        for(String fruit:list)  
        System.out.println(fruit);  
        
        // Returning element: 
        // Apple
        // Mango
        // Dates
        // Banana
        // Grapes
    }


    // Sort List
    public static SortList() {
          //Creating a list of fruits  
        List<String> list1=new ArrayList<String>();  
        list1.add("Mango");  
        list1.add("Apple");  
        list1.add("Banana");  
        list1.add("Grapes");  
        //Sorting the list  
        Collections.sort(list1);  
        //Traversing list through the for-each loop  
        for(String fruit:list1)  
            System.out.println(fruit);  
            
        System.out.println("Sorting numbers...");  
        //Creating a list of numbers  
        List<Integer> list2=new ArrayList<Integer>();  
        list2.add(21);  
        list2.add(11);  
        list2.add(51);  
        list2.add(1);  
        //Sorting the list  
        Collections.sort(list2);  
        //Traversing list through the for-each loop  
        for(Integer number:list2)  
            System.out.println(number);  
      

        //Output

        // Apple
        // Banana
        // Grapes
        // Mango
        // Sorting numbers...
        // 1
        // 11
        // 21
        // 51
    }
}
