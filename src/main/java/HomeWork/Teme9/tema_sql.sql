use hr;

# 1. Să se selecteze deptno, enume, job și sal pentru angajatii care au sef-ul cu id-ul 7902.
select deptno, ename, job, sal from EMP where mgr = "7902";

# 2. Să se selecteze numele, funcția și salariu pentru angajații care au aceași funcție.
select ename,job,sal from EMP where job = "SALESMAN";
select ename,job,sal from EMP where job = "CLERK";
select ename,job,sal from EMP where job = "MANAGER";
select ename,job,sal from EMP where job = "ANALYST";
select ename,job,sal from EMP where job = "PRESIDENT";
# 3. Să se selecteze numele, funcția și salariul anual pentru toți angajații din același departament.
select * from EMP;
select ename,job,sal*12 as sal_anual  from EMP where deptno = 20;
select ename,job,sal*12 as sal_anual from EMP where deptno = 10;
select ename,job,sal*12 as sal_anual  from EMP where deptno = 30;

# 4. Să se selecteze numele, funcția și venitul lunar pentru toți angajații care au venitul lunar mai mare de 2000. 
# Venitul lunar este o funcție care are formula salariu + ifnull(comision, 0)
select ename, job, sal + ifnull(comm, 0) as venit_lunar from EMP where sal + ifnull(comm, 0) > 2000;

#5.Să se selecteze id-ul angajatului, numele, funcția și data angajării pentru toți angajații care au aceași funcție și au venit în firmă după o anumită dată.
select empno, ename, job ,hiredate from EMP where hiredate > "1980-12-17" and job = "salesman";

# 6. Să se adauge 10 noi angajati.
INSERT INTO EMP VALUES
(1111, 'VIO', 'CLERK', 7902, '1980-12-17', 800, NULL, 20),
(2222, 'NIXON', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),
(3333, 'JOSH', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),
(4444, 'JANINE', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
(5555, 'GEORGIE', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
(6666, 'VESPA', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
(9999, 'BUMBI', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),
(3232, 'JUPITER', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20),
(1754, 'VOLGA', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
(2122, 'DAMIAN', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);

#7. Să se calculeze o primă de 15% pentur toți angajații din departamentul 20.
select ename,deptno,sal,15/100 *sal as prima from EMP where deptno= 20;

#8. Să se selecteze id-ul și numele departamentului din tabela departamente.
select deptno,dname from DEPT;

#9 Să se selecteze id-ul, numele, funcția și data angajării pentru toți angajații din firmă. 
#Ordonați descrescător în funcție de id. Concatenați id-ul cu numele.
select * from EMP;
select concat (empno, ename), job, hiredate from EMP order by empno DESC;

#10 Să se selecteze id-ul, numele, fucția și venitul lunar pentru toți angajatii din firmă. 
# Să se adauge la select o coloană goală care să se numească semnătura. 
#Concatenați id-ul cu numele. Ordonați după departament.

select concat (empno,ename),job,sal,null as SIGNATURE from EMP order by deptno ;

#11. Să se selecteze numele și funcția angajaților.

select ename,job from EMP;

#12. Să se facă o listă cu numele departamentului și codul acestuia. Ordonați după numele departamentului.

select * from dept;
select dname,deptno from DEPT order by dname;

#13. Să se selecteze toți angajații care au funcția manager. Ordonați după id-ul departamentului.

select * from Emp where job = "manager" order by deptno;

#14. Selectați toate persoanele care s-au angajat intr-o anumită perioadă aleasa de voi.

select * from EMP where hiredate = "1981-06-09";

#15. Să se listeze id-ul, numele, funcția, venitul lunar pentru angajații care au următoarele id-uri: 7499,7902, 7876

select empno,ename,job,sal + ifnull(comm, 0) as venit_lunar from EMP where empno = 7499 or empno = 7902 or empno = 7876;

#16. Să se selecteze toate persoanele care au fost angajate în anul 1980.

select * from EMP where hiredate >= "1980-01-01" and hiredate < "1981-01-01";
select * from EMP where YEAR(hiredate) = "1980";

#17. Să se selecteze toate persoanele al căror nume începe cu litera F și numele funcției are 7 caractere.
# ABC => c substr("ABC", 2, 1)
select * from EMP where substr(ename, 1, 1) = "F" and char_length(job) = 7;

#18. Să se listeze angajații din departamentul 20 care nu au primit comision.
select * from EMP  where deptno = 20 and isnull(comm);

#19. Să se listeze angajații care au primit comision și au funcția SALESMAN.

select * from EMP where job = "salesman" and isnull(comm)=0;

#20. Să se selecteze toți angajații care au funcția MANAGER și salariul peste 1500 și toți angajații care au funcția ANALYST.

select * from EMP where (job = "manager" and sal > 1500) or job = "analyst";

#21. Selectați toți angajații care s-au angajat înainte de anul 1982 și nu au primit comision.

select * from EMP where isnull(comm)=1 and hiredate < "1982-01-01";

#22. Selectați toți angajații care au salariul peste 3000 și nu au șefi, ordonați după departament.

select * from EMP where isnull(mgr)=1 and sal >3000;

#23. Selectați numele, funcția și venitul anual al angajaților care nu au funcția MANAGER pentru un departament ales de voi.

select ename,job, (sal + ifnull(comm, 0)) * 12 as venit_anual from EMP where deptno = 30 and job != "manager";

#24. Selectați departamentul, numele, data angajării și salariul tuturor persoanelor angajate în anul 1981 din două departamente alese de voi.

select deptno,ename,hiredate,sal from EMP where YEAR(hiredate)= 1981 and deptno = 20 or deptno = 30;

