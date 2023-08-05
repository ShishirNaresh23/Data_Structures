public class Main {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        Integer[] intArr = {2,4,5,7,9};
        for(int ele: intArr){
            linkedlist.insertElement(ele);
        }
        System.out.println(linkedlist.findElement(3).toString());
        System.out.println(linkedlist.removeElement(2));
        System.out.println(linkedlist.head.toString());
        System.out.println("Hello world!");
    }
}