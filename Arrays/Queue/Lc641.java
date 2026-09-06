
import java.util.*;
class Lc641 {
    int[] dequeue;
    int front;
    int rear;
    int size;
    int k;
    public Lc641(int k) {
        dequeue = new int[k];
        front = 0;
        rear = 0;
        size = 0;
        this.k = k;
    }
    public boolean insertLast(int value){
        if(isFull()){
            return false;
        }
        dequeue[rear] = value;
        rear = (rear + 1) % k;
        size++;
        return true;
    }
    public boolean insertFront(int value){
        if(isFull()){
            return false;
        }
        front = (front-1 + k)%k;
        dequeue[front]= value;
        size++;
        return true;
    }
    public boolean deleteFront(){
        if(isEmpty()){
            return false;
        }
        front = (front+1)%k;
        size--;
        return true;
    }
    public boolean deleteLast(){
        if(isEmpty()){
            return false;
        }
        rear=(rear-1+k)%k;
        size--;
        return true;
    }
    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return dequeue[front];
    }
    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        return dequeue[(rear-1+k)%k];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==k;
    }
   
    public static void main(String[] args){
        Lc641 MycirularDeque = new Lc641(3);
        System.out.println(MycirularDeque.insertLast(1));  // Output: true
        System.out.println(MycirularDeque.insertLast(2));  // Output: true
        System.out.println(MycirularDeque.insertFront(3)); // Output: true
        System.out.println(MycirularDeque.getFront());    // Output: 3
        System.out.println(MycirularDeque.getRear());     // Output: 2
        System.out.println(Arrays.toString(MycirularDeque.dequeue));
    }
}
