public class unionofarr {
    public static int findUnion(int a[], int b[]) {
        // code here
        int n= a.length;
        int m=b.length;
        Set<Integer> hashset = new HashSet<>();
        for(int i=0;i<n;i++){
            hashset.add(a[i]);
        }
        for(int j=0;j<m;j++){
            hashset.add(b[j]);
        }
        return hashset.size();
    }
}