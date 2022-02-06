--SQL with LOTR: Elven Wildcards--
select concat(INITCAP(firstname),' ',INITCAP(lastname)) as shortlist
from Elves
where firstname like '%tegil%'
   or lastname like '%astar%';