  /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
 
    {
         if(root==null)return -1;
       int l = height(root.left);
       int r = height(root.right);
       if(l>r){
           return l+1;
       }else{
           return r+1;
       }
    }
