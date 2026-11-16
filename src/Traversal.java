public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);
    
    // printPreorder(root);
    // PrintPostOrder(root);

    PrintInOrder(root);
    
  }

  public static void printPreorder(TreeNode current)
  {
    /*
    if current is null : return
    print node value
    explore left
    explore right
    return
     */

    if (current == null)
    {
      return;
    }
    System.out.println(current.value);
    printPreorder(current.left);
    printPreorder(current.right);
    return;
  }

  public static void PrintPostOrder(TreeNode current)
  {
    if (current == null)
    {
      return;
    }
    PrintPostOrder(current.left);
    PrintPostOrder(current.right);
    System.out.println(current.value);
    return;
  }

  public static void PrintInOrder(TreeNode current)
  {
    if (current == null)
    {
      return;
    }
    PrintInOrder(current.left);
    System.out.println(current.value);
    PrintInOrder(current.right);
    return;
  }


}
