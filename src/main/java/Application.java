public class Application {
        public static void main(String[] args) {
            int n1=2;
            int n2=4;
            int n3=6;
            int n4=8;
            //using variable-length argument list
            System.out.printf("n1=%d\t\nn2=%d\t\nn3=%d\t\nn4=%d\t\n",n1,n2,n3,n4);
            int value1=getProduct(n1,n2);
            System.out.printf("The product of n1 and n2 is : %d\n",value1);
            int value2=getProduct(n1,n2,n3);
            System.out.printf("The product of n1 ,n2 and n3 is : %d\n",value2);
            int value3=getProduct(n1,n2,n3,n4);
            System.out.printf("The product of n1 ,n2,n3 and n4 is : %d\n",value3);
        }
        private static int getProduct(int...numbers)
        {
            int product=1;
            for(int  n:numbers) {
                product =product*n;
            }
            return product;
        }
}
