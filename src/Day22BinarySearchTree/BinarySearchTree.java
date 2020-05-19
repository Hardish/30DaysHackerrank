package Day22BinarySearchTree;

public class BinarySearchTree{

    public static void main(String[] args) {

        EmptyBST emptyBST = new EmptyBST();
        System.out.println(emptyBST.isEmpty());
        NonEmptyBST nonEmptyBST = emptyBST.add(1);
        nonEmptyBST.left = emptyBST.add(5);
        nonEmptyBST.right = emptyBST.add(11);
        NonEmptyBST nonEmptyBST_1 = new NonEmptyBST(20,emptyBST.add(14),emptyBST.add(24));
        NonEmptyBST nonEmptyBST1 = new NonEmptyBST(4,nonEmptyBST,nonEmptyBST_1);
        NonEmptyBST newdata = nonEmptyBST1.add(15);
        System.out.println(nonEmptyBST1.cardinality());
        System.out.println(newdata.cardinality());
    }
}
