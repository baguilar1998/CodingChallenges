/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class N-AryLevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null)return answer;
        Queue<Node> waiting = new LinkedList<>();
        waiting.add(null);
        waiting.add(root);
        int level = -1;
        while(waiting.size()!=0){
            Node current = waiting.remove();
            if(current == null){
                ++level;
                if(waiting.size()!=0){
                    waiting.add(null);
                    answer.add(new ArrayList<Integer>());
                }
                continue;
            }
            for(int i=0;i<current.children.size();++i){
                Node c = current.children.get(i);
                if(c==null)continue;
                waiting.add(c);
            }
            answer.get(level).add(current.val);
        }
        return answer;
    }
}