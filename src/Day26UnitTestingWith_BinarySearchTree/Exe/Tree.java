package Day26UnitTestingWith_BinarySearchTree.Exe;

import Day26UnitTestingWith_BinarySearchTree.Exe.NonEmptyBST;

/*
    binary tree:
    middle node is x;
    left node is less than x(root);
    and right side is greater than x(root);
    that's why D should extends Comparable
 */
public interface Tree<D extends Comparable> {
    boolean isEmpty();
    int cardinality();
    boolean member(D elt);
    NonEmptyBST<D> add(D elt);
}
