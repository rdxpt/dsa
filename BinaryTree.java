public class BinaryTree<T> {

    private TreeNode root;

    public class TreeNode {
        private T data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data){
            this.data = data;
        }
    }

    @SuppressWarnings("unchecked")
    public void createBinaryTree(){
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
        System.out.print(root.data + " ");
    }
    

    public void preOrderItrS(){
        if(root == null)return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data);
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
    }
    public void inOrderItrS(){
        if(root==null)return;
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(!s.isEmpty() || temp !=null){
            if(temp != null){
                s.push(temp);
                temp = temp.left;
            }else{
                temp = s.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    public void postOrderItrS(){
        if(root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current !=null){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current = temp;
                }
            }
        }
    }
    
    public void levelOrderQ(){
        if(root==null)return;
        Queue<TreeNode> q = new Queue<>();
        q.enqueue(root);

        while(!q.isEmpty()){
            TreeNode temp = q.dequeue();
            System.out.print(temp.data);
            System.out.print(" ");
            if(temp.left!=null)q.enqueue(temp.left);
            if(temp.right!=null)q.enqueue(temp.right);
        }
    }

    public int findMax(TreeNode root){
        if(root==null)return Integer.MIN_VALUE;
        int result = (int) root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left>result)result=left;
        if(right>result)result=right;
        return result;
    }
    


    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.createBinaryTree();

        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
        bt.postOrderItrS();
        System.out.println();
        bt.levelOrderQ();
        System.out.println();

        int res = bt.findMax(bt.root);

        System.out.println(res);
    }

}