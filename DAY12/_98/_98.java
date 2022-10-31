package _98;

public class _98 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
        }

    }

    public static void main(String[] args) {
        // TreeNode node1 = new TreeNode(2, new TreeNode(1), null);

        TreeNode node1 = new TreeNode(32,
                new TreeNode(26,
                        new TreeNode(19,
                                null, new TreeNode(27)),
                        null),
                new TreeNode(47, null, new TreeNode(56)));
        System.out.println(isValidBST(node1));

        TreeNode node2 = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(2)),
                new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        // System.out.println(isValidBST(node2));

    }

    public static boolean isValidBST(TreeNode root) {
        boolean isLeftValid = false;
        boolean isRightValid = false;
        if (root == null)
            return false;

        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) // chi co 1 node
            return true;
        else if (left == null) { // chi co node right
            if (isHigher(root, right))
                return true;
            else
                return false;
        } else if (right == null) { // chi co node left
            if (isSmaller(root, left))
                return true;
            else
                return false;
        } else if (left.val >= root.val || right.val <= root.val) // 1 trong 2 node khong dat dieu kien
            return false;
        else { // 2 node deu dat dieu kien nhung co leaf node
            isLeftValid = isSmaller(root, left);
            isRightValid = isHigher(root, right);

            if (isLeftValid == true && isRightValid == true)
                return true;
            else
                return false;
        }

    }

    private static boolean isSmaller(TreeNode root, TreeNode node) {
        boolean isValid = true;
        // TreeNode temp = root;
        TreeNode tempLeft = node.left;
        TreeNode tempRight = node.right;
        if (root.val <= node.val)
            return false;
        else {
            if (tempLeft != null) { // tim dk sai trong leaf node ben trai
                isValid = isSmaller(root, tempLeft);
                if (isValid == false)
                    return isValid;
                // change root
                if (tempLeft.left != null) {
                    isValid = isSmaller(node, tempLeft.left);
                    // System.out.println(tempLeft.left.val);
                    if (isValid == false)
                        return isValid;
                }
                if (tempLeft.right != null) {
                    isValid = isSmaller(node, tempLeft.right);
                    if (isValid == false)
                        return isValid;
                }
                // }
            }

            if (tempRight != null) { // tim dk sai trong leaf node ben phai
                isValid = isSmaller(root, tempRight);
                System.out.println(tempRight);
                if (isValid == false)
                    return isValid;
                if (tempRight.left != null) {
                    isValid = isSmaller(node, tempRight.left);
                    if (isValid == false)
                        return isValid;
                }
                if (tempRight.right != null) {
                    isValid = isSmaller(node, tempRight.right);
                    if (isValid == false)
                        return isValid;

                }
            }
        }

        return isValid;

    }

    private static boolean isHigher(TreeNode root, TreeNode node) {
        boolean isValid = true;
        TreeNode tempLeft = node.left;
        TreeNode tempRight = node.right;
        
        if (root.val >= node.val)
            return false;
        else {
            if (tempLeft != null) { // tim dk sai trong leaf node ben trai
                isValid = isHigher(root, tempLeft);
                if (isValid == false)
                    return isValid;
                // change root
                if (tempLeft.left != null) {
                    isValid = isHigher(node, tempLeft.left);
                    // System.out.println(tempLeft.left.val);
                    if (isValid == false)
                        return isValid;
                }
                if (tempLeft.right != null) {
                    isValid = isHigher(node, tempLeft.right);
                    if (isValid == false)
                        return isValid;
                }

            }

            if (tempRight != null) { // tim dk sai trong leaf node ben phai
                isValid = isHigher(root, tempRight);
                System.out.println(tempRight);
                if (isValid == false)
                    return isValid;
                if (tempRight.left != null) {
                    isValid = isHigher(node, tempRight.left);
                    // System.out.println(tempLeft.left.val);
                    if (isValid == false)
                        return isValid;
                }
                if (tempRight.right != null) {
                    isValid = isHigher(node, tempRight.right);
                    if (isValid == false)
                        return isValid;

                }
            }
        }
        return isValid;
    }

}