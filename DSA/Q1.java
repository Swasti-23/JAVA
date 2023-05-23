package DSA;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=90;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        int min=arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                if(index!=-1){
                    if(arr[mid]-target<min){
                        index=mid;
                        min=arr[index]-target;
                    }
                }else{
                    index=mid;
                }
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return arr[mid];
            }
        }
        if(index==-1){
            return -1;
        }else {
            return arr[index];
        }
    }
}
