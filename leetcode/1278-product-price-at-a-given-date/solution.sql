with main 
as
(
#This main section takes change_date<='2019-08-16' so that we can take top new_price 
select product_id, new_price,change_date,  
rank() over(partition by product_id order by change_date desc) rnk
from Products
where change_date<='2019-08-16'
)
select product_id, new_price price
from main
where rnk=1
union all
# Only exception case from main CTE is when there are no changes within this period and we need to default to 10. That we are doing in this union part
select product_id, 10 as price
from Products
where product_id not in (select product_id from main)
group by product_id

