import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class AddTwoNumberLinkedList {
    public  static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {

        int sum = linkedListToIntReverce(l1) + linkedListToIntReverce(l2);
        LinkedList linkedList=new LinkedList<>();

        for (int i=10; sum>0; sum/=10){
            linkedList.add(sum%10);
        }

        return linkedList;
    }

    public static int linkedListToIntReverce(LinkedList linkedList){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=linkedList.size(); i>0; i--){
            stringBuilder.append(linkedList.get(i-1));
        }

        int result = Integer.parseInt(stringBuilder.toString()); 
        return result;
    }

    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);

        LinkedList linkedList2 =  new LinkedList<>();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(4);

        System.out.println(addTwoNumbers(linkedList, linkedList2));


        
        
    }
}