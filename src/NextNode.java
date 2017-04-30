public class NextNode{
    public static void main(String[] args) {

    }
    //ÖÐÐò±éÀú
    public int findSucc(TreeNode root, int p) {
        // write code here
        int[] ret = new int[1];
        ret[0] = -1;
        if(root == null)
            return  -1;
        else{
            findSucc(root.left, p, ret);
            if(root.val == p)
                return root.right == null ? -1: root.right.val;
            findSucc(root.right,p,ret);
        }
        return ret[0];
    }
    public void findSucc(TreeNode root, int p, int[] ret){
        if(root == null)
            return;
        else{
            findSucc(root.left, p, ret);
            if(root.val == p){
                ret[0] = (root.right == null) ? -1: root.right.val;
            }

            findSucc(root.right,p,ret);
        }

    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}