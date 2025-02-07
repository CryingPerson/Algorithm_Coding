-- 코드를 입력하세요
SELECT R.REST_ID, R.REST_NAME, R.FOOD_TYPE, R.FAVORITES, R.ADDRESS, ROUND(AVG(RR.REVIEW_SCORE),2) as SCORE
FROM REST_INFO R JOIN REST_REVIEW RR ON R.REST_ID = RR.REST_ID
AND R.ADDRESS LIKE '서울%'
GROUP BY RR.REST_ID
ORDER BY SCORE desc ,R.FAVORITES  desc
