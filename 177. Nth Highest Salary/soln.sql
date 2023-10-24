CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT
AS
BEGIN
  DECLARE @Result INT;

  WITH RankedSalaries AS (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS SalaryRank
    FROM Employee
  )
  
  SELECT @Result = salary
  FROM RankedSalaries
  WHERE SalaryRank = @N;

  RETURN @Result;
END;
