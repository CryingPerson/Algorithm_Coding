-- 코드를 입력하세요
SELECT user_id, product_id
FROM ONLINE_SALE 
Group By user_id, product_id
Having count(*) >= 2
Order by user_id, product_id desc