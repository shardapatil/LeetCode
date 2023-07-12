# Write your MySQL query statement below
select unique_id, name 
from employees e
left join EmployeeUNI u on e.id = u.id
