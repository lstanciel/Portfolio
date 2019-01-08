function [flag] = isLeapYear( year_check )
% setup a row vector to contain the number of days/year
%  from year 1 to year 2500

    AD = 365 .* ones(1,2500);   % start with 365 days/year for 2500 years
    AD(4:4:2500) = 366;         % rule 1: There is a leap year every 4th year
    AD(100:100:2500) = 365;     % rule 2: BUT century years are NOT leap years
    AD(400:400:2500) = 366;     % rule 3: EXCEPT every 400 years IS a leap year
    flag = AD(year_check) == 366;     % return TRUE if isLeapYear
    
end

