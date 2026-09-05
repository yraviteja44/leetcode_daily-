
public class Main
{
    static boolean sol(int[] arr,int mid,int b){
        int scb = 0;
        int s = 1;
        for(int  i =0;i<arr.length;i++){
            if(scb+arr[i]<=mid){
                scb = scb+arr[i];
            }else{
                
                s++;
                if(s>b){
                    return false;
                }else{
                    scb = arr[i];
                }
            }
            
        }
        return true;
        
    }
    static int merge(int[] arr,int b){
        if(arr.length < b){
            return -1;
        }
        int max =0;
        int h = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            h += arr[i];
            
        }
        int l =max;
        
        int mid =0;
        int res = 0;
        while(l<=h){
            mid =(l+h)/2;
            
            if(sol(arr,mid,b)==true){
                res = mid;
                h = mid-1;
            }
            else{
                l =mid+1;
            }
        }
        return res;
        
        
    }
	public static void main(String[] args) {
        int[] arr={13,34,67,90};
        int b = 2;
        System.out.print(merge(arr,b));
        
	}
}
