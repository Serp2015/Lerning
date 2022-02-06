-- SQL Basics: Simple VIEW
create table members_approved_for_voucher
(
    id             integer,
    name           varchar(50),
    email          varchar(50),
    total_spending float
);

insert into members_approved_for_voucher (
    select me.id, me.name, me.email, sum(pr.price) as total_spending
    from sales sa
             inner join members me on (sa.member_id = me.id)
             inner join departments d on (sa.department_id = d.id)
             inner join products pr on (sa.product_id = pr.id)
    where d.id in (select d.id
                   from sales sa
                            inner join departments d on (sa.department_id = d.id)
                            inner join products pr on (sa.product_id = pr.id)
                   group by d.id
                   having sum(pr.price) > 10000
    )
    group by me.id
    having sum(pr.price) > 1000
    order by me.id asc
);
select *
from members_approved_for_voucher;