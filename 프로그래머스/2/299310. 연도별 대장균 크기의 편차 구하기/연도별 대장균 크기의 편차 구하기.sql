-- 코드를 작성해주세요
SELECT year(DIFFERENTIATION_DATE) as YEAR, (SELECT MAX(SIZE_OF_COLONY) FROM ECOLI_DATA WHERE year(DIFFERENTIATION_DATE) = YEAR ) - SIZE_OF_COLONY as YEAR_DEV , ID
FROM ECOLI_DATA 
ORDER BY 1, 2