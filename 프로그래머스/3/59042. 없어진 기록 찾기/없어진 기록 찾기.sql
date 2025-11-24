-- 코드를 입력하세요
SELECT ao.ANIMAL_ID, ao.name
from ANIMAL_INS a right join ANIMAL_outs ao on a.ANIMAL_ID = ao.ANIMAL_ID
where a.ANIMAL_ID is null
order by a.animal_id 
