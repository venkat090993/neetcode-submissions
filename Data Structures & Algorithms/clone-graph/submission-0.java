/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // Idea: I have Map that points old node to new node.
    // Whenever, I iterater through the node, I check if exists, 
    //              Yes -> return the cloned node
    //              NO -> Clone it map it and add the old node cloned neighbour to it.

    Map<Node, Node> nodeMap = new HashMap<>();
    public Node cloneGraph(Node node) {

        if(node == null){
            return null;
        }
        
        if(nodeMap.get(node) != null){
            return nodeMap.get(node);
        }

        Node clone = new Node(node.val);
        nodeMap.put(node, clone);
        for(Node nei: node.neighbors){
            clone.neighbors.add(cloneGraph(nei));
        }

        return clone;
        
    }
}