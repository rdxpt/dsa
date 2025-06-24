class Node { 
        int key, height;
        Node left, right;

        Node(int key){
            this.key = key;
            height = 1;
        }
    }

public class AVL {
    Node root;

    int height(Node N){
        return (N==null) ? 0 : N.height;
    }

    int getBalance(Node N){
        return (N==null) ? 0 : height(N.left) - height(N.right);
    }

    Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right));
        x.height = Math.max(height(x.left), height(x.right));

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right));
        y.height = Math.max(height(y.left), height(y.right));

        return y;
    }
}
