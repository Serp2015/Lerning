-- SQL Basics: Group By Day
SELECT DATE(created_at) as day, description, count(*) as count
FROM events
where name = 'trained'
group by 1, 2
order by 1;