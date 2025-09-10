class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> users = new HashSet<>();

        for(int[] f: friendships){
            int u1 = f[0]-1;
            int[] l1 = languages[u1];
            int u2 = f[1] -1;
            int[] l2 = languages[u2];

            if(!canCommunicate(l1,l2)){
                users.add(u1);
                users.add(u2);
            }
        }
        HashMap<Integer, Integer> language = new HashMap<>();
        int mostKlang = 0;

        for (int sad : users) {
            for (int lang : languages[sad]) {
                language.put(lang, language.getOrDefault(lang, 0) + 1);
                mostKlang = Math.max(mostKlang, language.get(lang));
            }
        }

        return users.size() - mostKlang;
    }

    private boolean canCommunicate(int[] l1,int[] l2){
        for(int a: l1){
            for(int b: l2){
                if(a==b){
                    return true;
                }
            }
        }
        return false;
    }
}