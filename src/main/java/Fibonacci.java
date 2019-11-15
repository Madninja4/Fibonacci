import java.util.ArrayList;

class Fibonacci{
    static int n1=0,n2=1,n3=0;
    private static ArrayList<Integer> resultList = new ArrayList<Integer>();
    static boolean start = true;
    public ArrayList<Integer> getFibonacci(int count){
        if(start){
            resultList.add(0);
            resultList.add(1);
            count-=2;
            start = false;
        }
        if (count==0){
            return resultList;
        }
        else {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            resultList.add(n3);
            return getFibonacci(count - 1);

        }

    }
}