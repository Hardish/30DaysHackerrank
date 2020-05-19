package Day26UnitTestingWith_BinarySearchTree.Exe;

import Day26UnitTestingWith_BinarySearchTree.Testers.Tester;
/*
    Testing is runnig code twice. print fail case only as they are important to check
 */
public class BinarySearchTree {

    public static void main(String[] args) throws Exception {

        EmptyBST emptyBST = new EmptyBST();
        NonEmptyBST nonEmptyBST = new NonEmptyBST(5);
        NonEmptyBST nonEmptyBST1 = emptyBST.add(5);


        //testing
        Tester.checkIsEmpty(emptyBST);
        Tester.checkIsEmpty(nonEmptyBST);
        Tester.checkIsEmpty(nonEmptyBST1);

        Tester.checkAddMemberCardinality(emptyBST,10);
        Tester.checkAddMemberCardinality(nonEmptyBST,5);
        Tester.checkAddMemberCardinality(nonEmptyBST,6);

        int tests = 1000;
        for(int i = 0;i < tests ; i++) {
            Tree tree;
            if(i % 10 == 0) {
                tree = Tester.randomTree(0);
            } else {
                tree = Tester.randomTree(10);
            }

            Tester.checkAddMemberCardinality(tree,i);
        }
    }
}
