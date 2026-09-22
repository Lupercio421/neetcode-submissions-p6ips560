class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCount = 0;
        int l = 0;
        int r = people.length - 1;

        while (l <= r){
            int remainingWeight = limit - people[r];
            r -= 1;
            boatCount++;

            if (l <= r && remainingWeight >= people[l]){
                l++;
            }
        }
        return boatCount;
    }
}