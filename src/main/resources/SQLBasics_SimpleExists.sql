-- SQL Basics: Simple EXISTS
select id, name
from departments d
where exists(
              select price
              from sales s
              where d.id = s.department_id
                and price > 98.00
          )