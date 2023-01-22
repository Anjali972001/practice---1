import java.util.Scanner;
public class heightBT {
    static Scanner sc=null;
    public static void main(String[] args)
    {
     sc=new Scanner(System.in);
     node root=createNode();
        System.out.println("InOrder traversal");
        InOrder(root);
        System.out.println("PreOrder Traversal");
        preOrder(root);
        System.out.println("PostOrder Traversal");
        postOrder(root);

      height(root);
        
    }
    static node createNode()
    {
        node root =null;
        System.out.println("enter the data ");
        int data= sc.nextInt();

        if(data==-1)
        {
            return null;
        }
        root=new node(data);
        System.out.println("Enter the data for "+data);
        root.left=createNode();
        System.out.println("Enter the data for "+data);
        root.right=createNode();

        return root;

    }
    static void InOrder(node root)
    {
        if(root==null)
        {
            return ;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }
    static void preOrder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
         return Math.max(height(root.left),height(root.right))+1;
    }
}
class node
{
    int data;
    node left,right;
    node(int data)
    {
        this.data=data;
    }
}
