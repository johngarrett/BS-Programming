console.log("The chrome extension is running");

//start and end times respectivly
/*let mon = [0, 0];
let tues = [0, 0];
let wed = [0, 0];
let thurs = [0, 0];
let fri = [0, 0];
let sat = [0, 0];
*/

//let location = 0; 


let page = document.body.textContent.split('\n');

for(var i = 0; i < page.length; i++)
{
    if(page[i].includes("MONDAY",0))
    {
        var mon = page[i];
        var tues =  page[i+1];
        var wed =  page[i+2];
        var thurs =  page[i+3];
        var fri = page[i+4];
        var sat =  page[i+5];
        break;
    }
}
 


console.log(mon);
/*window.find("MONDAY (");
alert("found monday");

window.find("TUESDAY ("); 
alert("found wed");



/*var childDivs = document.getElementById('3451').getElementsByTagName('iv jstcache');

for( i=0; i< childDivs.length; i++ )
{
 var childDiv = childDivs[i];
 alert(childDiv[i]);
}




/*$('#test').find('div jstcache').each(function(){
    var innerDivId = $(this).attr('id');
}); 
//pseudocode:

for every text element on page, search for something with the header lake norman FSU or just find the date format
parse out the start time and end time, set it to the respective index
acces the api
???
profit
*/
