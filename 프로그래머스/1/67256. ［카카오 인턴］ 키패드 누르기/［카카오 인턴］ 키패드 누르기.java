class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int n = 0;
        int[][] board = new int[4][3];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = n;
                n++;
            }
        }
        int[] left = {3, 0};
        int[] right ={3, 2};
        for(int x : numbers){
            if(x == 1 || x ==  4 || x == 7){
                answer += "L";
                if(x == 1){
                    left = new int[]{0, 0};
                }else if(x == 4){
                    left =new int[] {1, 0};
                }else{
                    left = new int[]{2, 0};
                }
            }else if(x == 3 || x == 6 || x == 9){
                answer += "R";
                if(x == 3){
                    right = new int[]{0, 2};
                }else if(x == 6){
                    right =new int[] {1, 2};
                }else{
                    right = new int[]{2, 2};
                }
            }else{
                if(hand.equals("right")){
                    if(x == 2){
                        int lenL = Math.abs(0 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(0 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "R";
                            right = new int[]{0, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left = new int[]{0, 1};
                            }else{
                                answer += "R";
                                right =new int[] {0, 1};
                            }   
                        }
                    }else if(x == 5){
                        int lenL = Math.abs(1 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(1 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "R";
                            right =new int[] {1, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left = new int[]{1, 1};
                            }else{
                                answer += "R";
                                right = new int[]{1, 1};
                            }   
                        }
                    }else if(x == 8){
                       int lenL = Math.abs(2 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(2 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "R";
                            right =new int[]{2,1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left = new int[]{2,1};
                            }else{
                                answer += "R";
                                right = new int[]{2,1};
                            }   
                        }
                    }else{
                       int lenL = Math.abs(3 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(3 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "R";
                            right = new int[]{3, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left =new int[] {3, 1};
                            }else{
                                answer += "R";
                                right = new int[]{3, 1};
                            }   
                        }
                    }
                }else{
                    if(x == 2){
                       int lenL = Math.abs(0 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(0 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "L";
                            left = new int[]{0, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left = new int[]{0, 1};
                            }else{
                                answer += "R";
                                right = new int[]{0, 1};
                            }   
                        }
                    }else if(x == 5){
                       int lenL = Math.abs(1 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(1 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "L";
                            left = new int[]{1, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left =new int[]{1, 1};
                            }else{
                                answer += "R";
                                right =new int[]{1, 1};
                            }   
                        }
                    }else if(x == 8){
                       int lenL = Math.abs(2 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(2 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "L";
                            left =new int[]{2, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left =new int[]{2, 1};
                            }else{
                                answer += "R";
                                right =new int[]{2, 1};
                            }   
                        }
                    }else{
                       int lenL = Math.abs(3 - left[0]) + Math.abs(1 - left[1]);
                        int lenR = Math.abs(3 - right[0]) + Math.abs(1 - right[1]);
                        if(lenL == lenR){
                            answer += "L";
                            left = new int[]{3, 1};
                        }else{
                            int newLen = Math.min(lenL, lenR);
                            if(newLen == lenL){
                                answer += "L";
                                left = new int[]{3, 1};
                            }else{
                                answer += "R";
                                right = new int[]{3, 1};
                            }   
                        }
                    }
                }
            }
        }
        return answer;
    }
}