"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    
    def preOrderHelper(self,order,node):
        if node == None:
            return
        order.append(node.val)
        for i in range(len(node.children)):
            self.preOrderHelper(order,node.children[i])
        
    def preorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        list = []
        self.preOrderHelper(list,root)
        return list