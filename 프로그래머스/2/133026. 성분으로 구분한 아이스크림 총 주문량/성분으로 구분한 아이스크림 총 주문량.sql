-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, SUM(F.TOTAL_ORDER)TOTAL_ORDER
FROM FIRST_HALF F LEFT JOIN ICECREAM_INFO I ON F.FLAVOR = I.FLAVOR
GROUP BY INGREDIENT_TYPE
ORDER BY TOTAL_ORDER 