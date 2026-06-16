// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;

//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        //iteratre through pairs
        //use m to divide the length of pairs
        //left-side (0,m)
        // right-side (m+1, r)
        // merge function to be used
        return mergeSortHelper(pairs, 0, pairs.size() - 1);
    }

    public List<Pair> mergeSortHelper(List<Pair> pairs, int s, int e) {
        if (e - s + 1 <= 1){
            return pairs;
        }

        //middle index of array
        int m = (s + e) / 2;

        //sorting left half
        mergeSortHelper(pairs, s, m);

        //sorting right half
        mergeSortHelper(pairs, m+1, e);

        merge(pairs, s, m, e);

        return pairs;

    }

    public void merge(List<Pair> arr, int s, int m, int e){
        List<Pair> L = new ArrayList<>(arr.subList(s, m + 1));
        List<Pair> R = new ArrayList<>(arr.subList(m + 1, e + 1));

        int i = 0;
        int j = 0;
        int k = s;

        while (i < L.size() && j < R.size()){
            if (L.get(i).key <= R.get(j).key){
                arr.set(k, L.get(i));
                i++;
            } else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < L.size()){
            arr.set(k, L.get(i));
            i++;
            k++;
        }
        while (j < R.size()){
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }
}
