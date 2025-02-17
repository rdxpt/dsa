public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left, value);
        }
        if(value>root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }

    public TreeNode search(int key){
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key){
        if(root==null){
            System.out.print("null");
            return null;
        }
        System.out.print(root.data);
        if(root == null || root.data == key)return root;
        System.out.print("-->");
        if(key>root.data){    
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }

    public boolean validate(){
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean validate(TreeNode root, Integer min, Integer max){
        if(root == null)return true;
        if(root.data <= min || root.data>= max)return false;
        Boolean left = validate(root.left, min, root.data);
        if(left){
            Boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(6);
        bst.insert(4);
        bst.insert(8);
        bst.insert(2);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);

        bst.inOrder();
        System.out.println();

        if(null != bst.search(12))System.out.println("\nKey Found Eureka");
        else System.out.println("\nRoot not found");

        System.out.println(bst.validate());
    }
}
