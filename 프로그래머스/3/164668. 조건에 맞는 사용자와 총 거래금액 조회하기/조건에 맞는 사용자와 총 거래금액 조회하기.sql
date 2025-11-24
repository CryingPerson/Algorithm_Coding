-- 코드를 입력하세요
SELECT us.user_id, us.nickname, SUM(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD u join USED_GOODS_USER us on u.WRITER_ID = us.user_id
where u.status = 'done'
group by us.user_id
having total_sales >= 700000
order by TOTAL_SALES 