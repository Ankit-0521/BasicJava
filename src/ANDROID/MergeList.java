package ANDROID;

import javax.swing.*;
import java.util.List;

class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }
public class MergeList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null){
            return list2;
        }
        return list1;

    }

    public static void main(String[] args) {
       int a = 1;
       ListNode root = new ListNode(a);
        ListNode temp = null;
        while (temp.next==null){

        }


    }
}
