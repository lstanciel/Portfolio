%Lauren Stanciel
%None
%Section 035
%9/27/18

function [maxLoad] = actualLoad(W)
    %actualLoad computes the largest load any of the support poles would
    %  need to bear based on the distribution of forces in the W matrix. We 
    %  assume each pole is solely responsible for the forces in its
    %  quadrant.
    %     W: Weights matrix (Distribution of weight on the roof)
    %      
    %     maxLoad: the largest load among any of the four support poles  

    %Gives us the dimensionsensions of W
   dimensions = size(W);
    
    %Gives us the width of each quadrant
    quadWidth = dimensions(1)./2;
    
    %Gives us the height of each quadrant
    quadHeight = dimensions(2)./2;
    
    %This gives us a submatrix for the first quadrant
    quad1 = W(1:quadWidth,1:quadHeight);
   
    %This gives us a submatrix for the second quadrant
    quad2 = W(1:quadWidth, (quadHeight+1):end);
    
    %This gives us a submatrix for the third quadrant
    quad3 = W((quadWidth+1):end,1:quadHeight);
     
    %This gives us a submatrix for the fourth quadrant
    quad4 = W((quadWidth+1):end,(quadHeight+1):end);

    %This gives us the sum of each submatrix/quadrant
    sum1 = sum(quad1);
    quad1 = sum(sum1, 2); 
    
    sum2 = sum(quad2);
    quad2 = sum(sum2,2);
    
    sum3 = sum(quad3);
    quad3 = sum(sum3,2); 
    
    sum4 = sum(quad4);
    quad4 = sum(sum4,2);
    
    %This gives us a vector with all of the sums of the quadrants
    quads = [quad1,quad2,quad3,quad4];
    
    %This gives us the maximum load of quadrants
    maxLoad = max(quads);
end