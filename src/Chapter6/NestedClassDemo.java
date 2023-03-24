package Chapter6;

class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void Analyze() {
Inner inob= new Inner();

    System.out.println("Минимум: "+inob.min());
    System.out.println("Максимум: "+inob.max());
    System.out.println("Среднее: "+inob.avg());
    }

    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        int x[]={3,2,1,5,6,9,7,8};
        Outer outob= new Outer(x);
        outob.Analyze();
    }
}
