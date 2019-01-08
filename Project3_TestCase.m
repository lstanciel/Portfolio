filenameWind = 'windSpeedTestCase.csv';
filenameWave = 'waveHeightTestCase.csv';
filenameBuoy = 'buoyTestCase.csv';


windSpeedMin = 2.5;
windSpeedMax = 7.5;
waveHeightMax = 5.5;
waveHeightRisk = 80;
deckHeight = 17.2;

makePlots(filenameWind, filenameWave, filenameBuoy, windSpeedMin, windSpeedMax, waveHeightMax);

[ c1, c2, c3, c4, c5 ] = analyzeWindFarm( filenameWind, filenameWave, filenameBuoy, windSpeedMin, windSpeedMax, waveHeightMax, waveHeightRisk, deckHeight );
