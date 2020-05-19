package Day22BinarySearchTree;
/*
A tree interface implemented by :
        1. NonEmptyBST: A class represent non empty BST
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D>{

    //Properties:

    D data;   //root = data
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D elt) {
    data = elt;
    left = new EmptyBST<D>();
    right = new EmptyBST<D>();
    }

    public NonEmptyBST(D data, Tree<D> left, Tree<D> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D elt) {
        if(data == elt) {
            return true;
        } else {
            if(elt.compareTo(data) < 0) {  //compare() method as it can be String also
                return left.member(elt);
            } else {
                return right.member(elt);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        //whatever we insert,
        if(data == elt) {
            return this;
        } else {
            if(elt.compareTo(data) < 0) {
                return new NonEmptyBST<>(data,left.add(elt),right); //elt should go to left
            } else {
                return new NonEmptyBST<>(data,left,right.add(elt));
            }
        }
    }
}
