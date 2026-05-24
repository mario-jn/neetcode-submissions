with cte_grade as (
    select
        student_id,
        max(score) as mscore
    from
        exam_results
    group by
        student_id
)
select
    student_id,
    min(exam_id) as exam_id,
    score
from
    exam_results
inner join cte_grade using(student_id)
where
    score = cte_grade.mscore 
group by
    student_id, score
order by
    student_id




