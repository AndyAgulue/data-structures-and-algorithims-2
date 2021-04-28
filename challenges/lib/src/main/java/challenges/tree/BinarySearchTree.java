package challenges.tree;

public class BinarySearchTree {
    public static void main(String [] args){
        Tree tree = new Tree();

    }
}
/*
Tree tree = new Tree();
tree.root = new Node(5);
tree.root.left = new Node(6);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(40);
tree.root.right = new Node(1);
tree.root.right.right = new Node(39);

class Tree{
 publicNode root;
 public Tree () {
 root = null;
}

class Node {
int value;
Node left;
Node right;

public Node(int value){
this. value = value;
}

}
 */

/*
public class BreadthFirst extends BinarySearchTree{
    ArrayList<Integer> result = new ArrayList<>();
    public void breadthFirstTraversal(){
        breadthFirstTraversal(this.root);
        return result;
    }
    private void breadthFirstTraversal(Node node){
        if(node == null)
            return;
        Queue<Node> q = new Queue();
        if(arr.size() < 1){
            q.enqueue(node);
        }


        while(!q.isEmpty()){
            Node front = q.dequeue();
            arr.add(front.value);
        }

        if(front.left != null){
            q.enqueue(front.left);
        }

        if(front.right != null){
            q.enqueue(front.right);
        }
    }

}
 */