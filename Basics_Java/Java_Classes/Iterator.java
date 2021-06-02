public class main {
    public static void nonmain(String[] args) {

        // Using the iterator()

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
    }

    public static LoopIterator() {
        // Iterator methods used for looping

        //hasNext() and next()

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static RemoveIterator() {
        // Iterator mothod used to remove items.

        // remove()

        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(12);
            numbers.add(8);
            numbers.add(2);
            numbers.add(23);
            Iterator<Integer> it = numbers.iterator();
            while(it.hasNext()) {
                Integer i = it.next();

                if(i < 10) {
                    it.remove();
                }
            }
            System.out.println(numbers);
    }
}