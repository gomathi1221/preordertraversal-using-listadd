class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer>list=new ArrayList<>();
       if(root!=null){     
        
        list.add(root.val);
         list.addAll(preorderTraversal(root.left));
         list.addAll(preorderTraversal(root.right));
        }
       return list;
       
    }
   
    
}
