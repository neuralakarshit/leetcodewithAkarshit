/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution 
{
    List<Integer> l=new ArrayList<Integer>();

    public List<Integer> preorder(Node root) 
    {
        if(root==null)
        {
            return l;
        }
        if(root.children==null)
        {
            l.add(root.val);
        }
        l.add(root.val);

        for(int i=0;i<root.children.size();i++)
        {
            preorder(root.children.get(i));
        }

        return l;


    }
}