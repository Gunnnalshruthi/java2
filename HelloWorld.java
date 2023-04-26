import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int k = 0;
        int sum = 10;
        for(int i=1;i<4;i++) {
            k = (i > 3) ? 3 : i;
            for(int j=1;j<k;j++) {
                sum += i;
            }
        }
        System.out.println(sum);
    
    
    List studentList = new ArrayList();
	studentList.add("Rahul Sharma");
System.out.println(studentList.size());
studentList = new LinkedList();
studentList.add("Vivek Reddy");

System.out.println(studentList.size());
System.out.println("Welcome to FT12");
 }
}


