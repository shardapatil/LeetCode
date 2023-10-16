## First solution
```
SELECT Weather.Id 
FROM   Weather 
JOIN Weather AS w 
ON w.RecordDate = SUBDATE(Weather.RecordDate, 1) 
WHERE  Weather.Temperature > w.Temperature
```
## Second Solution
```
select w.id Id 
from weather q ,weather w
where w.temperature>q.temperature and adddate(q.recordDate,1) =  w.recordDate
```
