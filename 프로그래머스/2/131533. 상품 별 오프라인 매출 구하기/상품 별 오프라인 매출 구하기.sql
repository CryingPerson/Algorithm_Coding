-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(SALES_AMOUNT) * P.PRICE as SALES
FROM PRODUCT P INNER JOIN OFFLINE_SALE O ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES desc, PRODUCT_CODE