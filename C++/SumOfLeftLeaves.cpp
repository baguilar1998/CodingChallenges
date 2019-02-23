/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        if(root == NULL) return 0;
        int sum = 0;
        TreeNode* left = root->left;
        if (left != NULL) {
            if (left->left == NULL && left->right == NULL) {
                sum+=left->val;
            } else {
                sum+=sumOfLeftLeaves(left);
            }
        }
        sum+= sumOfLeftLeaves(root->right);
        return sum;
    }
};
