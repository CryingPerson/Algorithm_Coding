-- 코드를 입력하세요
SELECT a.name, a.datetime as DATETIME
FROM ANIMAL_INS a left join ANIMAL_OUTS aa ON a.ANIMAL_ID = aa.ANIMAL_ID
WHERE aa.ANIMAL_ID is null
order by a.datetime
limit 3
