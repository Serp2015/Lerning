create table customer
(
    customer_id int
        CONSTRAINT customer_pk PRIMARY KEY,
    email       varchar(50)
);

create table payment
(
    payment_id  int
        CONSTRAINT payment_pk PRIMARY KEY,
    customer_id int
        CONSTRAINT fk_customer REFERENCES customer (customer_id),
    amount      int
);

select customer.customer_id,
       customer.email,
       count(*)                           as payments_count,
       cast(sum(payment.amount) as float) as total_amount
from customer
         inner join payment on customer.customer_id = payment.customer_id
group by customer.customer_id
order by total_amount desc
limit 10;
