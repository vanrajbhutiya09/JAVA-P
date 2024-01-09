public class PrintInfo {
    
    static void chechAge(int age) {

        if(age > 18) {
            System.out.println("Welcome Mr.");
        }else{
            throw new ArithmeticException("Not Valid Age Baby You Are baby"); 
        }

    }
    public static void main(String[] args) {


        chechAge(19);




        // try{
        //         int n = 10/1;
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }finally{
        //     System.out.println("DONE");
        // }



//        try{
//            int a=10,b=1;
//            int c=a/b;
//            System.out.println(c);
//            System.out.println("1");
//        }catch(ArithmeticException e) {
////            System.out.println(e.toString());
////            e.printStackTrace();
//            System.out.println("Error");
//            System.out.println("2");
//
//        }
//        System.out.println("3");

//        Diffrent between final, finally,finalize

//        table
//
//            final
//                keyword
//                    final keyword can be use with variable method class
//
//            finally
//                block
//                finally is use with try or try catch block
//            finalize
//                is method
//                method is override

    }
}
