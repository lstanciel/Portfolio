%Lauren Stanciel
%None
%Section 035
%9/27/18

function [numPallets] = additionalPallets(roofHeight, pallets, palletHeight)
    %additionalPallets computes the number of additional storage pallets
    %     that can fit in the storage area of the structure
    %     roofHeight: scalar representing the height of the roof
    %     pallets: a matrix representing the number of pallets in 
    %              each storage cell of the storage area
    %     palletHeight: scalar representing the height of a single pallet
    %
    %     numPallets: number of additional pallets that can fit in 
    %                 the storage area
    
    %This is the starting number for the number of additional pallets that
    %can fit in the storage area
    numPallets = 0;
        
    %Tells us which storage area can add pallets
    storageArea = (pallets.* palletHeight) < roofHeight;
   
    %This adds to the function to give us the max number than can be added
    numPallets = pallets + storageArea;
    numPallets = (numPallets .* palletHeight) < roofHeight;
            
    %Figures out the maximum number of pallets than can be in each column             
    maxPallets = roofHeight ./ palletHeight;
    
    %This makes sure that the maximum number of pallets than can be in each
    %column is a whole number and is rounded down instead of up
    maxPallets = floor(maxPallets); 
    
    %Gives the dimensionsensions of pallets
    dimensions = size(pallets);
    
    %Creates a matrix full of the maximum number of pallets for each column
    maxMatrix = ones(dimensions(1),dimensions(2));
    maxPallets = maxMatrix .* maxPallets;
    
    %Creates a maxtrix full of the number of additonal pallets that can be
    %added to each storage cell
    numPallets = maxPallets - pallets;
    
    %Finds the sum of the maxrix full of the number of additonal pallets
    %that can be added to each storage cell
    numPallets = sum(numPallets);
    numPallets = sum(numPallets, 2);
           
    
end