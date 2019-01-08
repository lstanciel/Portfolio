%Lauren Stanciel
%None
%Section 035
%9/27/18

function [P_cr] = criticalLoad(E, I, K, L)
%calcCriticalLoad computes Euler's critical load for a column with 
%  structural parameters: E, I, K, and L.
%     E: Modulus of elasticity of the column material
%     I: Minimum moment of inertia across cross section of the column
%     K: Column effective length factor 
%     L: Length of column
%      
%     P_cr: Euler's critical load of column  



    P_cr = ((pi.^2).*(E.*I))./((K.*L).^2);

end