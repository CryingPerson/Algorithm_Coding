-- 코드를 입력하세요
SELECT MONTH(START_DATE), CAR_ID, count(*) as RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10' AND
CAR_ID IN(SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
          WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10' GROUP BY CAR_ID
         HAVING count(*) >= 5)
         GROUP BY MONTH(START_DATE), CAR_ID
         Order By MONTH(START_DATE), CAR_ID desc