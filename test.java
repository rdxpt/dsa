public class test<T> {
    private TreeNode root;

    public class TreeNode {
        private T data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data) {
            this.data = data;
        }
    }
    
    @SuppressWarnings("unchecked")
    public void createBinaryTree() {
        TreeNode first = new TreeNode((T) Integer.valueOf(1));
        TreeNode second = new TreeNode((T) Integer.valueOf(2));
        TreeNode third = new TreeNode((T) Integer.valueOf(3));
        TreeNode fourth = new TreeNode((T) Integer.valueOf(4));
        TreeNode fifth = new TreeNode((T) Integer.valueOf(5));
        TreeNode sixth = new TreeNode((T) Integer.valueOf(6));
        TreeNode seventh = new TreeNode((T) Integer.valueOf(7));

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
        
        third.left = sixth;
        third.right = seventh;
    }

    public void preOrder(TreeNode root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void preOrderIts(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }
    }
    public void inOrderIts(TreeNode root){
        if(root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    public void postOrderIts(TreeNode root){
        if(root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            if(current!=null){
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                }
            }
        }

    }

    public static void main(String[] args) {
        test<Integer> bt = new test<>();
        bt.createBinaryTree();

        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();  
        bt.postOrder(bt.root);
        System.out.println();

        bt.inOrderIts(bt.root);
    }
}
