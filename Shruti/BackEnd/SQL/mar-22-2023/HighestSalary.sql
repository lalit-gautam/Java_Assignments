-- 2nd highest salary of employee
Select max(salary) from employee
Where sal < (Select max(salary) from employee);

-- highest payed employees in each departments
Select max(salary), departmentNo
from employee
group by departmentNo;

-- display the no. of employees in each department
Select count(*), departmentNo
from employee
group by departmentNo;

-- display alternate records in sql
Select * from employee
    (Select rownum rn, empNo, ename, sal
    from employee
    order by rn)
    Where mod(rn, 2)!= 0;