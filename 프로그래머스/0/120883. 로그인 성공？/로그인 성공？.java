class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int idx = 0; idx < db.length; idx++) {
            if(db[idx][0].equals(id_pw[0]) && db[idx][1].equals(id_pw[1])) {
                return "login";
            } else if(db[idx][0].equals(id_pw[0]) && !db[idx][1].equals(id_pw[1])) {
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}