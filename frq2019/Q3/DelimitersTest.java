import java.util.ArrayList;
import java.util.Arrays;

class DelimitersTest{
    public static void main(String[] args){
        testGetDelimitersList();
    }

    public static void testGetDelimitersList(){
        //Test case 1 from the question
        Delimiters delimiter1 = new Delimiters("(", ")");
        String[] tokens1 = {"(","x + y",")","* 5"};
        ArrayList<String> ans1 = new ArrayList<>(Arrays.asList(
            "(",")"));
        boolean result1 = testGetDelimitersListHelper(tokens1,delimiter1,ans1);
        System.out.println("PART (a) test 1: " + result1);

        //Test case 2 from the question
        Delimiters delimiter2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>","yy","</q>","zz","</q>"};
        ArrayList<String> ans2 = new ArrayList<>(Arrays.asList(
            "<q>","</q>","</q>"));
        boolean result2 = testGetDelimitersListHelper(tokens2,delimiter2,);
        System.out.println("PART (a) test 1: " + result2);
    }

    public static boolean testGetDelimitersListHelper(String[] tokens, Delimiters d, ArrayList<String> ans){
        ArrayList<String> list = d.getDelimitersList(tokens);
        if(list.size() != ans.size()){
            return false;
        }
        for(int i = 0; i < list.size(); i++){
            if(!list.get(i).equals(ans.get(i))){
                return false;
            }
        }
        return true;
    }

    public static void testIsBalanced(){
        Delimiters delimiter = new Delimiters("<sup>", "</sup>");
        
        ArrayList<String> case1 = new ArrayList<>(Arrays.asList(
            "<sup>","<sup>","</sup>","<sup>","</sup>","</sup>"));
        ArrayList<String> case2 = new ArrayList<>(Arrays.asList(
            "<sup>","</sup>","</sup>","<sup>"));
        ArrayList<String> case3 = new ArrayList<>(Arrays.asList(
            "</sup>"));
        ArrayList<String> case4 = new ArrayList<>(Arrays.asList(
            "<sup>","</sup>","</sup>","<sup>"));
        
        System.out.println("PART (b) test 1: " + delimiter.isBalanced(case1));
        System.out.println("PART (b) test 2: " + delimiter.isBalanced(case2));
        System.out.println("PART (b) test 3: " + delimiter.isBalanced(case3));
        System.out.println("PART (b) test 4: " + delimiter.isBalanced(case4));
    }
}