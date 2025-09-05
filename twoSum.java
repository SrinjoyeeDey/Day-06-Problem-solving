import java.util.Stack;

public class twoSum {
     static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
     }

     static Node root1;
     static Node root2;

     public static int countPairs(Node root1,Node root2,int x){
        if(root1==null || root2==null){
            return 0;
        }
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();

        Node top1,top2;
        int count=0;

        while (true) {
            while (root1!=null) {
                s1.push(root1);
                root1=root1.left;
            }
            while (root2!=null) {
                s1.push(root2);
                root2=root2.left;
            }
            if(s1.empty() || s2.empty()){
                break;
            }
            top1=s1.peek();
            top2=s2.peek();

            if(top1.data+top2.data==x){
                count++;
                s1.pop();
                s2.pop();

                root1=top1.right;
                root2=top2.left;
            }
            else if(top1.data+top2.data<x){
                s1.pop();
                root1=top1.right;
            }
            else{
                s2.pop();
                root2=top2.left;
            }
            
        }
        return count;
    }
}
