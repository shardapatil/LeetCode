# Write your MySQL query statement below
select firstName, lastName, city, state from person p
left join Address a on a.PersonId = p.PersonId
