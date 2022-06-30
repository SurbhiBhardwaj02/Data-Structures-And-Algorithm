public class BST {
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    Node root;
    public void insert(int key)
    {
        root =insetbyrec(key,root);
    }
    public Node insetbyrec(int data,Node root)
    {
        if(root==null)
        {
            root=new Node(data);
        }
        else if(root.data>data)
        {
            root.left=insetbyrec(data,root.left);
        }
        else if(root.data<data)
        {
            root.right=insetbyrec(data,root.right);
        }
        return root;
    }
    public Node deleteNode(Node root,int key)
    {
        if(root==null)
            return root;
        if(key<root.data)
            root.left=deleteNode(root.left,key);
        else if(key>root.data)
            root.right=deleteNode(root.right,key);

        else
        {
            if(root.right==null)
            {
                return root.left;
            }
            if(root.left==null)
            {
                return root.right;
            }
            root.data=minValue(root.right);
            root.right=deleteNode(root.right,root.data);
        }
        return root;
    }
    static int minValue(Node root)
    {
        int minv=root.data;
        while(root.left!=null)
        {
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec((root.left));
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST obj=new BST();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.inorderRec(obj.root);
    }


}
