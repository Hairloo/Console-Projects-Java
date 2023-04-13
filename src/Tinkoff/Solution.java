package Tinkoff;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Solution {

}

class LinkedIntList {
    private ListNode front;

    public LinkedIntList(ListNode front){
        this.front = front;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3, new ListNode(0, new ListNode(3, new ListNode(7))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        LinkedIntList list = new LinkedIntList(listNode);
        list.firstLast();
    }

    public void removeAll(LinkedIntList list) {
        // Узел предшествующий узлу i из списка, в котором был вызван метод
        ListNode previousI = null;
        // Узел i из списка, в котором был вызван метод
        ListNode i = front;
        // Узел j из списка удаляемых элементов
        ListNode j = list.front;
        while (i != null && j != null) {
            if (i.data > j.data) {
                // Двигаемся по списку удаляемых элементов
                j = j.next;
            } else if (i.data < j.data) {
                // Передвигаем предыдущий и текущий элементы из списка, в котором был вызван метод
                previousI = i;
                i = i.next;
            } else if (previousI == null) {
                // Предыдущего элемента еще не установлено, так как мы находимся на front-элементе =>
                // просто меняем front-элемент
                i = front.next;
                front = front.next;
            } else {
                // Удаляем узел по принципу prev [1] -> current [2] -> next [3] => prev [1] -> next [3]
                previousI.next = i.next;
                i = i.next;
            }
        }
        int k = 0;
    }
    public void removeDuplicates() {
        for (ListNode i = front; i != null; i = i.next) {
            int iData = i.data;
            ListNode previousJ = i;
            for (ListNode j = i.next; j != null; j = j.next) {
                if (j.data == iData) {
                    previousJ.next = j.next;
                } else {
                    previousJ = previousJ.next;
                }
            }
        }
        int k = 0;
    }

    public void removeDuplicates2(){
        if(front.next == null){
            return;
        }
        for(ListNode i = front; i != null; i = i.next){
            ListNode previousI = i;
            int dataI = i.data;
            for(ListNode j = i.next; j != null; j = j.next){
                if(dataI == j.data){
                    previousI.next = j.next;
                }
                else {
                    previousI = j;
                }
            }
        }
        int k = 0;
    }

    public void firstLast(){
        if(front.next == null){
            return;
        }
        ListNode last = front;
        front = front.next;
        ListNode sub = front;
        while (sub.next != null){
            sub = sub.next;
        }
        sub.next = last;
        last.next = null;
        int k =0;
    }

}
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
    }

    public ListNode(int data, ListNode next){
        this.data = data;
        this.next = next;
    }
}

class K{
    int x = 1;
}

interface J{
    abstract void l();
}

class G extends K{

    public static void main(String[] args) {
        G g = new G();
        g.x();
    }
    public void x(){
        System.out.println(x);
    }
}


class UniversalSort<T extends Comparable>{

}

abstract class U{
    abstract void h();
    abstract void r();
}



