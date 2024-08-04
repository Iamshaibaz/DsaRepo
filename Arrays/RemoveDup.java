// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class RemoveDup {
    
        public static void removeDup(int[] arr ){
            if(arr == null){
                return;
            }
            int uniqueElements =1;
            for(int i = 1 ;i < arr.length;i++){
            if(arr[i] != arr[i-1]){
             uniqueElements++;   
                }
            }
            int[] newArr = new int[uniqueElements];
          //  newArr[0] = arr[0];
            int index = 0;
            for(int i = 0 ; i < arr.length;i++){
                if( i == 0 || arr[i] != arr[i-1]){
                    newArr[index++] = arr[i];
                }
            }
            for(int num: newArr){
                System.out.print(num+" ");
            }
            //System.out.println(uniqueElements);
        }
       
        public static void main(String[] args) {
            
            int[] arr = {1,2,3,4,5,6,6,7,7,8,8};
            removeDup(arr);
    }
}
