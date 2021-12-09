package C2_Stack;

/*
public class MyStack {
    int a[];
    int cap;
    int top;

    MyStack(int c){
        cap=c;
        top=-1;
         a=new int[cap];
    }
    int push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return 0;
        }
        top++;
        a[top] = x;
        return x;

    }

    int pop(){
        if(top==-1){
            System.out.println("stack empty");
            return Integer.MIN_VALUE;
        }
        int res=a[top];
        top--;
        return res;
    }
    int peek(){
        if (top==-1){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        return a[top];
    }
    int size(){
        return(top+1);
    }
    boolean isEmpty() {
        return top == -1;

    }
}
class main{
    public static void main(String[] args) {
        MyStack stack=new MyStack(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}

 */ //Normal stack

/*
 class MyDynamicStack {
    ArrayList<Integer> stack = new ArrayList<>();


    void push(int x) {
        stack.add(x);
    }

    int pop() {
        int res = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return res;
    }

    int peek() {
        return stack.get(stack.size() - 1);
    }

    int size() {
        return stack.size();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }
}


class DynMain{
    public static void main(String[] args) {

        MyDynamicStack stack=new MyDynamicStack();

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
       System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(isEmpty());



    }
}

 */ //Dynamic stack

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class MyStack {
    Node head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }


    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;

    }

    int pop() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        size--;
        return res;

    }

    int peek() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    int size() { return size; }
    boolean isempty(){
        return head==null;
    }
}
class main{
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isempty());

    }
}

 */ //Linked-list implementation for stack imp for interview

/*
class stack{
    public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
    public static boolean isBalanced(String str) {

        Deque<Character> s = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
            {
                s.add(str.charAt(i));
            }
            else
                {
                if (s.isEmpty() == true)
                    return false;
                else if (matching(s.peek(), str.charAt(i)) == false)
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty() == true);
    }

    public static void main (String[] args) {

        String str = "{([])}";

        if (isBalanced(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

    }

}

 */// balanced parenthesis

/*
class TwoStacks{
    int a[];
    int cap;
    int top1,top2;

    TwoStacks(int n){
        cap=n;
        a=new int[n];
        top1=n/2+1;
        top2=n/2;
    }
    void push1(int x){
        if(top1>0){
            top1--;
            a[top1]=x;
        }
        else
            System.out.println("stack overflow");
        return;

    }
    void push2(int x){
        if (top2<cap-1){
            top2++;
            a[top2]=x;
        }
        else
            System.out.println("stack overflow "+ x);
            return;
    }
    int pop1(){
        if(top1<=cap/2){
            int x=a[top1];
            top1++;
            return x;
        }
        else {
            System.out.println("stack underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if (top2>=cap/2+1){
            int x=a[top2];
            top2--;
            return x;
        }
        else{
            System.out.println("stack underflow");
        System.exit(1);
    }
    return 0;
}}
class main{
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.push1(5);
        ts.push1(9);
        ts.push2(10);
        ts.push2(20);
        ts.push2(40);

        System.out.println("popped elements from stack 1: "+ts.pop1());

        System.out.println("popped elements from stack 2: "+ts.pop2());
    }
}

 *///two stack in array naive sol

/*
class TwoStacks {
    int cap;
    int top1, top2;
    int arr[];

    TwoStacks(int n)
    {
        arr = new int[n];
        cap = n;
        top1 = -1;
        top2 = cap;
    }

    void push1(int x)
    {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x)
    {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1()
    {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2()
    {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
}

class GFG {

    public static void main (String[] args) {

        TwoStacks ts=new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());

    }

}

 */ //two stacks efficient method

/*
class kstacks{
    int arr[];
    int top[];
    int next[];
    int cap,k;
    int freetop;

    kstacks(int k1,int n){
        k=k1;cap=n;
        arr=new int [cap];
        top=new int [k];
        next=new int [cap];

        for (int i=0;i<k;i++){
            top[i]=-1;
        }

            freetop=0;
            for (int i=0;i<cap-1;i++)
                next[i]=i+1;

            next[cap-1]=-1;

        }
        boolean isfull(){
        return (freetop==-1);
    }
    boolean isEmpty(int sn){
        return top[sn]==-1;
    }

    void push(int x,int sn){
        if (isfull()){
            System.out.println("\n stack overflow");
            return;
        }

        int i=freetop;
        freetop=next[i];
        next[i]=top[sn];
        top[sn]=i;
        arr[i]=x;
    }
    int pop(int sn)
    {
        if (isEmpty(sn))
        {
            System.out.print("\nStack Underflow\n");
            return Integer.MAX_VALUE;
        }

        int i = top[sn];
        top[sn] = next[i];
        next[i] = freetop;
        freetop = i;
        return arr[i];
    }
}

class Stack{
    public static void main(String[] args) {
        int k = 3, n = 10;
        kstacks ks=new kstacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2) );
        System.out.println("Popped element from stack 1 is " + ks.pop(1) );
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );

    }
}

 */// K stacks in a array

/*
class stockspan{
        public static void printSpan(int arr[],int n){
            Stack<Integer> s = new Stack<>();
            s.add(0);
            System.out.print(1 + " ");
            for (int i = 1; i < n; i++) {
                while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
                    s.pop();
                }
                int span = s.isEmpty() ? i + 1 : i - s.peek();
                // if the stack is empty then the print do i+1 or else i-peek;
                System.out.print(span + " ");

                s.push(i);//insert the new  elements
            }
        }

    public static void main(String[] args) {
        int[] arr=new int[]{18,12,13,14,11,16};

        printSpan(arr,arr.length);

    }
}

 */ //stock span efficient sol

/*
class main{
    public static void main(String[] args) {
        int a[]={20,30,10,5,15};
        printprev(a,a.length);
    }

    private static void printprev(int[] a, int length) {
        for (int i=0;i<length;i++){
            for (int j=i-1;j>=0;j--){
                if(a[i]<a[j]){
                    System.out.println(a[i]+" ");
                    break;
                }
                if (j==-1)
                    System.out.println(-1+" ");

            }
        }
    }
}

 *///prevGreatest naive method

/*
class main{

        public static void main(String[] args) {
            int a[]={20,30,10,5,15};
            printprev(a,a.length);
        }

    private static void printprev(int[] a, int length) {
        Stack<Integer> s=new Stack<>();
        s.add(a[0]);
        System.out.println("-1"+" ");

        for (int i=1;i<length;i++) {
            while (s.isEmpty() == false && s.peek() <= a[i])
                s.pop();

            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.println(pg + " ");
            s.add(a[i]);
        }
    }
}

 *///prevGreatest efficient method

/*
class main{
    private static void printGreater(int[] a, int length)
    {
        for(int i=0;i<length;i++)
        {
            int j;//declaring it outside to use outside the loop
            for ( j=i+1;j<length;j++)
            {
                if(a[j]>a[i])
                {
                    System.out.println(a[j] + " ");
                    break;
                }
            }
            if(j==length)
            {
                    System.out.println(-1+ " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] a=new int[]{5,15,10,8,6,12,9,18};

        printGreater(a,a.length);

    }
}

 *////NextGreatest  element naive method

/*
class main{
    private static void printGreater(int[] a, int n) {
        Stack<Integer> s=new Stack<>();
        s.push(a[n-1]);
        System.out.println("-1"+" ");

        for (int i=n-2;i>=0;i--){
            while(s.empty()==false&& s.peek()<=a[i])
                s.pop();

            int nexGen=(s.empty()? -1 : s.peek());
            System.out.println(nexGen+" ");
            s.push(a[i]);
            //we get the output in reverse with out using arraylist
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{5,15,10,8,6,12,9,18};

        printGreater(a,a.length);
    }
}

 *///NextGreatest  element efficient method

/*
class main{
    private static int  getMaxArea(int[] a, int n) {
        int res=0;
        for (int i=0;i<n;i++){
            int cur=a[i];

            //we travel backwards and when we find an elements greater than i
            //we add it if we find a smaller element we break
            for (int j=i-1;j>=0;j--){
                if(a[j]>=a[i])
                    cur+=a[i];
                else break;
            }
            //we travel forward and when we find an smaller elements we break,
            //till then we keep on adding a[i] to current
            for (int j=i+1;j<n;j++){
                if (a[j]>=a[i])
                    cur+=a[i];
                else break;
            }
            res=Math.max(res,cur);// MAX of res,cur
        }
         return res; // at the end we return res

    }
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,1,5,6};

        System.out.print("Maximum Area: "+getMaxArea(arr,arr.length));

    }
}

 *///largest Rectangle Area in a histogram  naive method

/*
class myStack{
    //making aux stack
    Stack<Integer> ms;
    Stack<Integer> as;

    myStack(){
        ms=new Stack<>();
        as=new Stack<>();
    }
    void push(int x){
        if (ms.isEmpty()){
            ms.add(x);
            as.add(x);
            return;
        }else
        ms.add(x);
        if (as.peek()>=ms.peek()){
            as.add(x);
        }
    }
    void pop() {
        if (as.peek() == ms.peek())
        {
            as.pop();
        }
        ms.pop();
    }
    int top(){
        return ms.peek();
    }
    int getMin(){
        return as.peek();
    }
    public static void main(String[] args)
    {
        myStack s=new myStack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);


        System.out.print(" Minimum Element from Stack: " + s.getMin() );

    }
}

 *///MIN() in stack naive sol

/*
class MyStack {

    Stack<Integer> s;
    int min;

    MyStack(){
        s=new Stack<>();
    }

void push(int x) {

      if(s.isEmpty() ) {
         min=x;
         s.add(x);
      }
      else if(x<=min){
          s.add(x-min);
          min=x;
      }else{
      s.add(x);
      }
   }

int pop() {

    int t=s.peek();s.pop();
    if(t<=0){
        int res=min;
        min=min-t;
        return res;
    }else{
        return t;
    }
   }

int peek() {
    int t=s.peek();
    return ((t<=0)? min : t);
   }

int getMin() {
      return min;
   }
}

class GFG {

    public static void main(String[] args)
    {
        MyStack s=new MyStack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin() );

    }
}


 *///MIN() in stack cant handle negative sol

/*

class MyStack {

    Stack<Integer> s;
    int min;

    MyStack(){
        s=new Stack<>();
    }

    void push(int x) {

        if(s.isEmpty() ) {
            min=x;
            s.add(x);
        }
        else if(x<=min){
            s.add(2*x-min);
            min=x;
        }else{
            s.add(x);
        }
    }

    int pop() {

        int t=s.peek();s.pop();
        if(t<=min){
            int res=min;
            min=2*min-t;
            return res;
        }else{
            return t;
        }
    }

    int peek() {
        int t=s.peek();
        return ((t<=min)? min : t);
    }

    int getMin() {
        return min;
    }
}

class GFG {

    public static void main(String[] args)
    {
        MyStack s=new MyStack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin() );

    }
}

 */////MIN() in stack handles negative sol



















