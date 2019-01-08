%Lauren Stanciel
%
%Section 035
%10/10/18

function [ rad ] = removeNoise( rad, n )
    %removeNoise Removes noise from a matrix of radiation values by
    %  applying an nxn mean filter three times.
    %       n: The size of the filter (e.g. if n=3, use a 3x3 filter)
    %     rad: a matrix of numbers representing the radiation
    %          measurements from the scanner.
    %          NOTE: A matrix obtained from a call to the scan_radiation()
    %          may be used as an input argument when calling this function,
    %          but you should NOT call scan_radiation() inside of this
    %          function!
    
    N = ones(n)/n^2;
    rad1 = imfilter(rad, N, 'replicate');
    rad2 = imfilter(rad1, N, 'replicate');
    rad = imfilter(rad2, N, 'replicate');
end