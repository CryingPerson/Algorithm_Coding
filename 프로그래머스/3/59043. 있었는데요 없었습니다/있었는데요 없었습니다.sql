-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.name
from ANIMAL_INS a join ANIMAL_outs aa on a.ANIMAL_ID = aa.ANIMAL_ID
where a.DATETIME > aa.DATETIME
order by a.DATETIME