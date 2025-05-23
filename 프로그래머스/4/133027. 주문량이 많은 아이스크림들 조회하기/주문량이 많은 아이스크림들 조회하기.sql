SELECT A.FLAVOR
FROM FIRST_HALF A JOIN (SELECT FLAVOR, SUM(TOTAL_ORDER) as TOTAL_ORDER
                   FROM JULY
                   GROUP BY FLAVOR)j ON A.FLAVOR = j.FLAVOR
                   ORDER BY A.TOTAL_ORDER + j.TOTAL_ORDER desc
                  
LIMIT 3;