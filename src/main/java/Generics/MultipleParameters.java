package Generics;
    class Test< U, M>
    {
        U obj1;
        M obj2;
        Test(U obj1,M obj2)
        {
            this.obj1=obj1;
            this.obj2=obj2;
        }
        public void print()
        {
            System.out.println(obj1);
            System.out.println(obj2);

        }
    }
    class Main
    {
        public static void main(String[] args) {
            Test<String,Integer>gy=new Test<String,Integer>("Gym",7);
            gy.print();

        }
    }

