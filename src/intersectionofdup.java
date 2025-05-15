public class intersectionofdup {
    // Function to find the intersection of two arrays
    // Function to find the intersection of two arrays
    ArrayList<Integer> approch1TLE(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<m;j++)
                if(a[i]==b[j]){
                    res.add(a[i]);
                    break;
                }
        }
        return res;
    }
    ArrayList<Integer> intersection(int[] a, int[] b){
        ArrayList<Integer> res= new ArrayList<>();
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }else{
                res.add(a[i]);
                i++;
                j++;
            }
        }
        return res;
    }

}
