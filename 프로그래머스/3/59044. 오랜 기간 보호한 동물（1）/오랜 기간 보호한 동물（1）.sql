-- 코드를 입력하세요
SELECT a.name, a.datetime
from ANIMAL_INS a left join ANIMAL_outs ao on a.ANIMAL_ID = ao.ANIMAL_ID
where ao.ANIMAL_ID is null
order by a.datetime
limit 3
