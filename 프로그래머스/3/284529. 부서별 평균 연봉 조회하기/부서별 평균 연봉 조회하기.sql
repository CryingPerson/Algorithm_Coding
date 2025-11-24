-- 코드를 작성해주세요
select h.DEPT_ID, DEPT_NAME_EN, round(avg(SAL),0) as AVG_SAL
from HR_DEPARTMENT h join HR_EMPLOYEES hs on h.DEPT_ID = hs.DEPT_ID
group by h.DEPT_ID
order by avg_sal desc
