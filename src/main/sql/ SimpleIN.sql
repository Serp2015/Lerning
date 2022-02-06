-- Объединение таблиц без join
select id, name
from departments
where id IN (select department_id from sales where price > 98.00);