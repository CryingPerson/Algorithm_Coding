class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 길이 3<= x <=15
        // a-z, 0-9, -,_,. 만 사용가능
        // 단 .은 시작과 끝에 사용불가능, 또한 연속 사용 불가능
        
        //1. 대문자 소문자 -> toLowerCase();
        //2. [^a-z0-9-.] replaceAll();
        //3. . 연속으로 만게되면 cnt ++ 하나로 치환 
        //4. .처음일경우 없앰
        //5. 
        String newId = new_id.toLowerCase();
        String new2Id = newId.replaceAll("[^a-z0-9_.-]", "");
        String new3Id = new2Id.replaceAll("\\.+", ".");
        if(new3Id.length() != 0 && new3Id.charAt(0) == '.'){
            new3Id = new3Id.substring(1,new3Id.length());
        }
         if(new3Id.length() != 0 &&new3Id.charAt(new3Id.length()-1) == '.'){
            new3Id = new3Id.substring(0,new3Id.length()-1);
        }
        if(new3Id.length() == 0){
            new3Id += "a";
        }
        if(new3Id.length() >= 16){
            new3Id = new3Id.substring(0,15);
                if(new3Id.charAt(new3Id.length()-1) == '.'){
                new3Id = new3Id.substring(0,new3Id.length()-1);
            }
        }
        while(new3Id.length()< 3){
            char ch = new3Id.charAt(new3Id.length()-1);
            new3Id += ch;
        }
        return new3Id;
    }
}