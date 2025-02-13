public class Stack_Arr<T>{
    private int topArr;
    private T[] arr;
    @SuppressWarnings("unchecked")
    public Stack_Arr(int cap){
        topArr = -1;
        arr = (T[]) new Object[cap];
    }

    public boolean isEmpty(){
        return topArr == -1;
    }
    public boolean isFull(){
        return arr.length-1 == topArr;
    }
    public int size(){
        return topArr+1;
    }

    public void push(T data){
        if(isFull())throw new RuntimeException("Stack is full !!!");
        topArr++;
        arr[topArr]=data;
    }
    public T pop(){
        if(isEmpty())throw new RuntimeException("Stack is Full");
        return arr[topArr--];
    }
    public T peek(){
        if(isEmpty())throw new RuntimeException("Stack is Empty");
        return arr[topArr];
    }


    public void displayStack_Arr(){
        for(int i=0; i<=topArr; i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Arr<Integer> intStack = new Stack_Arr<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.displayStack_Arr(); // Output: 10 20 30

        System.out.println("Popped: " + intStack.pop()); // Output: Popped: 30
        intStack.displayStack_Arr(); // Output: 10 20
        System.out.println(intStack.peek());
    }
}