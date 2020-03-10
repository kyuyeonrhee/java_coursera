public class Q1 {
    public void findAbc(String input){
       int index = input.indexOf("abc");
       while (true){
           if (index == -1 || index >= input.length() - 3){
               break;
           }
           String found = input.substring(index+1, index+4);
           System.out.println("Index: " + index);
           System.out.println(found);
           index = input.indexOf("abc",index+3);
           System.out.println("Index after updating: " + index);
       }
   }

   public void test(){
       //findAbc("abcd");
       //findAbc("abcdabc");
       //         01234567890123456789012345678901234567890 
       //         V                             V  V  
       //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
       findAbc("abcabcabcabca");
   }
   

}
