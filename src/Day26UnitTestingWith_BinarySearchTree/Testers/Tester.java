package Day26UnitTestingWith_BinarySearchTree.Testers;

import Day26UnitTestingWith_BinarySearchTree.Exe.EmptyBST;
import Day26UnitTestingWith_BinarySearchTree.Exe.NonEmptyBST;
import Day26UnitTestingWith_BinarySearchTree.Exe.Tree;

import java.util.Random;

public class Tester {
    // x + (x * 2) = x + x * 2  --> * will done first and then +

    //random integers
    public static int randomInt(int min,int max) {
        Random random = new Random();
        return random.nextInt((max- min) +1) + min;
        //if max = 15 and min = 5 ;
        //((max- min) +1) -- >  (15-5)+1 == 11 --> this will produce random number from 0 to 10
        //and then we are adding +5 in generated random number((max- min) +1) using this
    }

    //random binary search trees
    public static Tree randomTree(int count) {
        //count is size of the tree
        if(count == 0) {
            return new EmptyBST();
        } else {
            return randomTree(count - 1).add(randomInt(0,50));
        }
    }


    public static void checkIsEmpty(Tree t) throws Exception{
        // if the tree t is an instance of EmptyBST --> t.isEmpty --> true;
        // if the tree t is an instance of NonEmptyBST --> t.isEmpty -->false;
        if(t instanceof EmptyBST) {
            /*if (t.isEmpty()) {
                System.out.println("All is good, the tree is an emptyBST and it is empty");
            }*/

            if (!t.isEmpty()) {
                throw new Exception("All is not good, the tree is an emptyBST and it is non-empty");
            }
        }
        else if(t instanceof NonEmptyBST) {
     /*       if(!t.isEmpty()) {
                System.out.println("All is good, the tree is an NonemptyBST and it is not empty");
            }*/
            if(t.isEmpty()) {
               throw new Exception("All is not good, the tree is an NonemptyBST and it is empty");
            }
        }

    }

    //relationship with the add and cardinality method
    public static void checkAddMemberCardinality(Tree t,int x) throws Exception {
        //
        int nT = (t.add(x)).cardinality();
        //1. either something was added  - > and the cardinality increased by one.
        if(nT == t.cardinality()+1) {
            if(t.member(x)) {
                throw new Exception("The cardinality increased by 1, but the thing" +
                        "that was added was already a member of the tree");
            }
            /*if(!t.member(x)) {
                System.out.println("The cardinality increased by 1 and new member added in the tree");
            }*/
        }
        //2. or something that was already there and therefore not really added
        //so the cardinality stayed the same.
        else if(nT == t.cardinality()) {
            if(!t.member(x)) {
                throw new Exception("The cardinality didn't increased by 1, but" +
                        "we added a new thing");
            } /*else if(t.member(x)) {
                System.out.println("All is good as the member is already present in tree");
            }*/
        }

        else {
            throw new Exception("Something is wrong with our program");
        }
    }
}

