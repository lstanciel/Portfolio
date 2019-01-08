%Lauren Stanciel
%None
%Section 035
%9/27/18

function [revenue] = parkingRevenue(timeUsed, price)
    %parkingRevenue computes the revenue from parking fees 
    %     timeUsed: a matrix with the number of hours each spot was used
    %     price: a matrix with the price per hour for each spot
    %     ONLY THE EDGE VALUES FROM EACH MATRIX SHOULD BE USED
    %     
    %     revenue: the total amount earned from all parking spots
    
    %Gives the dimensionsensions of timeUsed
    dimensions = size(timeUsed);

    %Gives a vector of all of the cost/hour for row 1
    row1 = timeUsed(1,:) .* price(1, :);
    row1 = row1(2: end-1);
    
    %Gives a vector of all of the cost/hour for the last row in timeUsed
    row2 = timeUsed(dimensions(1), :) .* price(dimensions(1) ,:);
    row2 = row2(2: end-1);
    
    %Gives a vector of all of the cost/hour for column 1
    col1 = timeUsed(:,1) .* price(:,1);
    
    %Gives a vector of all of the cost/hour for the last column in timeUsed
    col2 = timeUsed(:,end) .* price(:,end);
    
    %Gives us a row vector of all the cost/hour 
    rows = row1 + row2;
    rows = sum(rows, 2);
    
    %Gives a row vector of all the cost/hour from the columns
    cols = col1 + col2;
    cols = cols.';
    cols = sum(cols);
    
    %Gives us the sum of the of revenue
    revenue = cols + rows;
    revenue = sum(revenue);
  

    

end